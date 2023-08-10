package src.com.lexer;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.RuleNode;


public class IOTPoliciesBaseVisitor<T>
  extends AbstractParseTreeVisitor<T>
  implements IOTPoliciesVisitor<T>
{
  public T visitPolicies(IOTPoliciesParser.PoliciesContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitPolicy(IOTPoliciesParser.PolicyContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitCondition(IOTPoliciesParser.ConditionContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitAction(IOTPoliciesParser.ActionContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitConditionExpression(IOTPoliciesParser.ConditionExpressionContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitTimedEvent(IOTPoliciesParser.TimedEventContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitTimedFunction(IOTPoliciesParser.TimedFunctionContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitSingleTimePeriod(IOTPoliciesParser.SingleTimePeriodContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitComposedTimePeriod(IOTPoliciesParser.ComposedTimePeriodContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitSimpleEvent(IOTPoliciesParser.SimpleEventContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitOperators(IOTPoliciesParser.OperatorsContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitRelationalOperator(IOTPoliciesParser.RelationalOperatorContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitBooleanOperator(IOTPoliciesParser.BooleanOperatorContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitStateOperator(IOTPoliciesParser.StateOperatorContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitActionExpression(IOTPoliciesParser.ActionExpressionContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitActionEvent(IOTPoliciesParser.ActionEventContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitActionFunction(IOTPoliciesParser.ActionFunctionContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitParameters(IOTPoliciesParser.ParametersContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitParameterList(IOTPoliciesParser.ParameterListContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitDeviceIdentifier(IOTPoliciesParser.DeviceIdentifierContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitDevice(IOTPoliciesParser.DeviceContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitLocation(IOTPoliciesParser.LocationContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitIdentifier(IOTPoliciesParser.IdentifierContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitDigitIdentifier(IOTPoliciesParser.DigitIdentifierContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitLetterDigitIdentifier(IOTPoliciesParser.LetterDigitIdentifierContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitParameter(IOTPoliciesParser.ParameterContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitInteger(IOTPoliciesParser.IntegerContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitDecimal(IOTPoliciesParser.DecimalContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitString(IOTPoliciesParser.StringContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitDate(IOTPoliciesParser.DateContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }

  public T visitHour(IOTPoliciesParser.HourContext ctx) {
    return (T)visitChildren((RuleNode)ctx);
  }
}