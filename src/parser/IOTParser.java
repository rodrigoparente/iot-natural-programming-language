package com.parser;

import com.evaluators.Evaluate;
import com.evaluators.enums.BooleanEnum;
import com.evaluators.enums.RelationalEnum;
import com.evaluators.enums.StateEnum;
import com.evaluators.enums.TimeEnum;
import com.evaluators.expressions.And;
import com.evaluators.expressions.Or;
import com.evaluators.terminals.BooleanEvaluator;
import com.evaluators.terminals.DateEvaluator;
import com.evaluators.terminals.RelationalEvaluator;
import com.evaluators.terminals.StateEvaluator;
import com.evaluators.terminals.TimeEvaluator;
import com.jdbc.DAO.JDBCDAO;
import com.socket.SimpleSocket;

import src.com.lexer.IOTPoliciesBaseVisitor;
import src.com.lexer.IOTPoliciesParser;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;


public class IOTParser
  extends IOTPoliciesBaseVisitor<Evaluate>
{
  ArrayList<String> parameters = new ArrayList<>();
  JDBCDAO jdbc = new JDBCDAO();
  SimpleSocket sock = new SimpleSocket();

  public Evaluate visitPolicies(IOTPoliciesParser.PoliciesContext ctx) {
    for (IOTPoliciesParser.PolicyContext policy : ctx.policy()) {
      visit((ParseTree)policy);
    }
    return null;
  }

  public Evaluate visitPolicy(IOTPoliciesParser.PolicyContext ctx) {
    Evaluate condition = (Evaluate)visit((ParseTree)ctx.condition());
    
    if (condition.evaluate())
    {
      
      visit((ParseTree)ctx.action());
    }

    return null;
  }

  public Evaluate visitConditionExpression(IOTPoliciesParser.ConditionExpressionContext ctx) {
    if (ctx.timedEvent() != null)
      return (Evaluate)visit((ParseTree)ctx.timedEvent()); 
    if (ctx.simpleEvent() != null) {
      return (Evaluate)visit((ParseTree)ctx.simpleEvent());
    }
    
    Evaluate left = (Evaluate)visit(
        ctx.getChild(0));
    Evaluate right = (Evaluate)visit(
        ctx.getChild(2));
    
    if (ctx.getChild(1).getText().equals("and"))
    {
      return (Evaluate)new And(left, right);
    }
    if (ctx.getChild(1).getText().equals("or"))
    {
      return (Evaluate)new Or(left, right);
    }

    return null;
  }

  public Evaluate visitTimedEvent(IOTPoliciesParser.TimedEventContext ctx) {
    return (Evaluate)visit((ParseTree)ctx.timedFunction());
  }

  public Evaluate visitTimedFunction(IOTPoliciesParser.TimedFunctionContext ctx) {
    if (ctx.getChild(0).getText().equals("between")) {
      return (Evaluate)visit((ParseTree)ctx.composedTimePeriod());
    }
    return (Evaluate)visit((ParseTree)ctx.singleTimePeriod());
  }

  public Evaluate visitSingleTimePeriod(IOTPoliciesParser.SingleTimePeriodContext ctx) {
    ParserRuleContext timedEventCtx = ctx.getParent().getParent();
    ParserRuleContext timedFunctionCtx = ctx.getParent();
    
    String period = timedEventCtx.getChild(0).getText();
    TimeEnum op = TimeEnum.valueOf(timedFunctionCtx.getChild(0).getText().toUpperCase());
    
    if (period.equals("time")) {
      
      String hour = ctx.hour().getText();
      
      try {
        return (Evaluate)new TimeEvaluator(op, hour);
      } catch (ParseException e) {
        e.printStackTrace();
      } 
    } else if (period.equals("date")) {
      
      String date = ctx.date().getText();
      
      try {
        return (Evaluate)new DateEvaluator(op, date);
      } catch (ParseException e) {
        e.printStackTrace();
      } 
    } 
    
    return null;
  }

  public Evaluate visitComposedTimePeriod(IOTPoliciesParser.ComposedTimePeriodContext ctx) {
    ParserRuleContext timedEventCtx = ctx.getParent().getParent();
    ParserRuleContext timedFunctionCtx = ctx.getParent();
    
    String period = timedEventCtx.getChild(0).getText();
    TimeEnum op = TimeEnum.valueOf(timedFunctionCtx.getChild(0).getText().toUpperCase());
    
    if (period.equals("time")) {
      
      String hour = ctx.getChild(0).getText();
      String hour1 = ctx.getChild(2).getText();
      
      try {
        return (Evaluate)new TimeEvaluator(op, hour, hour1);
      } catch (ParseException e) {
        e.printStackTrace();
      } 
    } else if (period.equals("date")) {
      
      String date = ctx.getChild(0).getText();
      String date1 = ctx.getChild(2).getText();
      
      try {
        return (Evaluate)new DateEvaluator(op, date, date1);
      } catch (ParseException e) {
        e.printStackTrace();
      } 
    } 
    
    return null;
  }

  public Evaluate visitSimpleEvent(IOTPoliciesParser.SimpleEventContext ctx) {
    String device = ctx.deviceIdentifier().device().getText();
    String location = ctx.deviceIdentifier().location().getText();
    
    if (ctx.operators().relationalOperator() != null) {
      RelationalEvaluator relationalEval = (RelationalEvaluator)visit((ParseTree)ctx.operators().relationalOperator());
      relationalEval.setDevice(device);
      relationalEval.setLocation(location);

      try {
        String value = this.jdbc.getLastDataEntryFromDevice(Integer.parseInt(device));
        
        relationalEval.setValue(Double.valueOf(Double.parseDouble(value)));
        
        return (Evaluate)relationalEval;
      } catch (NumberFormatException e) {
        e.printStackTrace();
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    
    }
    else if (ctx.operators().booleanOperator() != null) {
      BooleanEvaluator booleanEval = (BooleanEvaluator)visit((ParseTree)ctx.operators().booleanOperator());
      booleanEval.setDevice(device);
      booleanEval.setLocation(location);

      try {
        String value = this.jdbc.getLastDataEntryFromDevice(Integer.parseInt(device));
        
        if (value.equals("1")) {
          booleanEval.setValue(true);
        } else if (value.equals("0")) {
          booleanEval.setValue(false);
        } 

        return (Evaluate)booleanEval;
      } catch (NumberFormatException e) {
        e.printStackTrace();
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    
    } else if (ctx.operators().stateOperator() != null) {
      StateEvaluator stateEval = (StateEvaluator)visit((ParseTree)ctx.operators().stateOperator());
      stateEval.setDevice(device);
      stateEval.setLocation(location);

      try {
        String value = this.jdbc.getLastDataEntryFromDevice(Integer.parseInt(device));
        
        if (value.equals("on") || value.equals("open")) {
          stateEval.setValue(true);
        } else if (value.equals("0")) {
          stateEval.setValue(false);
        } 
        
        return (Evaluate)stateEval;
      } catch (NumberFormatException e) {
        e.printStackTrace();
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      } catch (SQLException e) {
        e.printStackTrace();
      } 
    } 

    return null;
  }

  public Evaluate visitRelationalOperator(IOTPoliciesParser.RelationalOperatorContext ctx) {
    String operationText = ctx.getChild(0).getText().replace(' ', '_').toUpperCase();
    
    RelationalEnum op = RelationalEnum.valueOf(operationText);
    Double polVal = Double.valueOf(ctx.getChild(1).getText());
    
    return (Evaluate)new RelationalEvaluator(op, polVal);
  }

  public Evaluate visitBooleanOperator(IOTPoliciesParser.BooleanOperatorContext ctx) {
    String operationText = ctx.getChild(0).getText().toUpperCase();
    
    BooleanEnum op = BooleanEnum.valueOf(operationText);
    
    return (Evaluate)new BooleanEvaluator(op);
  }

  public Evaluate visitStateOperator(IOTPoliciesParser.StateOperatorContext ctx) {
    String operationText = ctx.getChild(1).getText().toUpperCase();
    
    StateEnum op = StateEnum.valueOf(operationText);
    
    return (Evaluate)new StateEvaluator(op);
  }

  public Evaluate visitActionExpression(IOTPoliciesParser.ActionExpressionContext ctx) {
    if (ctx.actionEvent() != null) {
      visit((ParseTree)ctx.actionEvent());
    } else {
      visit(ctx.getChild(0));
      visit(ctx.getChild(2));
    } 
    
    return null;
  }

  public Evaluate visitActionEvent(IOTPoliciesParser.ActionEventContext ctx) {
    StringBuilder buff = new StringBuilder();
    int childrenNumber = ctx.actionFunction().getChildCount();
    
    String device = ctx.deviceIdentifier().device().getText();
    String location = ctx.deviceIdentifier().location().getText();
    
    buff.append("{ \"device\" : \"" + device + "\", ");
    buff.append("\"location\" : \"" + location + "\", ");
    
    buff.append("\"action\" : ");
    
    String funcName = ctx.actionFunction().getChild(0).getText();
    
    if (childrenNumber == 2) {
      visit((ParseTree)ctx.actionFunction());

      buff.append("{ \"" + funcName + "\" : [");
      
      int parametersCount = this.parameters.size();
      
      for (int i = 0; i < parametersCount; i++) {
        buff.append(this.parameters.get(i));
        if (i != parametersCount - 1) {
          buff.append(", ");
        }
      } 
      
      buff.append("]}}");
    } else {
      buff.append("\"action\" : \"" + funcName + "\"");
      buff.append(" }");
    } 

    return null;
  }

  public Evaluate visitActionFunction(IOTPoliciesParser.ActionFunctionContext ctx) {
    visit((ParseTree)ctx.parameters());
    
    return null;
  }
  
  public Evaluate visitParameters(IOTPoliciesParser.ParametersContext ctx) {
    visit((ParseTree)ctx.parameterList());
    
    return null;
  }
  
  public Evaluate visitParameterList(IOTPoliciesParser.ParameterListContext ctx) {
    int numberChildren = ctx.getChildCount();
    
    for (int i = 0; i < numberChildren; i += 2) {
      this.parameters.add(ctx.getChild(i).getText());
    }
    
    return null;
  }
}