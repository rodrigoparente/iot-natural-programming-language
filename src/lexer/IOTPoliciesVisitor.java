package src.com.lexer;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public interface IOTPoliciesVisitor<T> extends ParseTreeVisitor<T> {
  T visitPolicies(IOTPoliciesParser.PoliciesContext paramPoliciesContext);
  
  T visitPolicy(IOTPoliciesParser.PolicyContext paramPolicyContext);
  
  T visitCondition(IOTPoliciesParser.ConditionContext paramConditionContext);
  
  T visitAction(IOTPoliciesParser.ActionContext paramActionContext);
  
  T visitConditionExpression(IOTPoliciesParser.ConditionExpressionContext paramConditionExpressionContext);
  
  T visitTimedEvent(IOTPoliciesParser.TimedEventContext paramTimedEventContext);
  
  T visitTimedFunction(IOTPoliciesParser.TimedFunctionContext paramTimedFunctionContext);
  
  T visitSingleTimePeriod(IOTPoliciesParser.SingleTimePeriodContext paramSingleTimePeriodContext);
  
  T visitComposedTimePeriod(IOTPoliciesParser.ComposedTimePeriodContext paramComposedTimePeriodContext);
  
  T visitSimpleEvent(IOTPoliciesParser.SimpleEventContext paramSimpleEventContext);
  
  T visitOperators(IOTPoliciesParser.OperatorsContext paramOperatorsContext);
  
  T visitRelationalOperator(IOTPoliciesParser.RelationalOperatorContext paramRelationalOperatorContext);
  
  T visitBooleanOperator(IOTPoliciesParser.BooleanOperatorContext paramBooleanOperatorContext);
  
  T visitStateOperator(IOTPoliciesParser.StateOperatorContext paramStateOperatorContext);
  
  T visitActionExpression(IOTPoliciesParser.ActionExpressionContext paramActionExpressionContext);
  
  T visitActionEvent(IOTPoliciesParser.ActionEventContext paramActionEventContext);
  
  T visitActionFunction(IOTPoliciesParser.ActionFunctionContext paramActionFunctionContext);
  
  T visitParameters(IOTPoliciesParser.ParametersContext paramParametersContext);
  
  T visitParameterList(IOTPoliciesParser.ParameterListContext paramParameterListContext);
  
  T visitDeviceIdentifier(IOTPoliciesParser.DeviceIdentifierContext paramDeviceIdentifierContext);
  
  T visitDevice(IOTPoliciesParser.DeviceContext paramDeviceContext);
  
  T visitLocation(IOTPoliciesParser.LocationContext paramLocationContext);
  
  T visitIdentifier(IOTPoliciesParser.IdentifierContext paramIdentifierContext);
  
  T visitDigitIdentifier(IOTPoliciesParser.DigitIdentifierContext paramDigitIdentifierContext);
  
  T visitLetterDigitIdentifier(IOTPoliciesParser.LetterDigitIdentifierContext paramLetterDigitIdentifierContext);
  
  T visitParameter(IOTPoliciesParser.ParameterContext paramParameterContext);
  
  T visitInteger(IOTPoliciesParser.IntegerContext paramIntegerContext);
  
  T visitDecimal(IOTPoliciesParser.DecimalContext paramDecimalContext);
  
  T visitString(IOTPoliciesParser.StringContext paramStringContext);
  
  T visitDate(IOTPoliciesParser.DateContext paramDateContext);
  
  T visitHour(IOTPoliciesParser.HourContext paramHourContext);
}