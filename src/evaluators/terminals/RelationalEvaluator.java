package com.evaluators.terminals;

import com.evaluators.Evaluate;
import com.evaluators.enums.RelationalEnum;

public class RelationalEvaluator
  implements Evaluate
{
  String device;
  String location;
  RelationalEnum operator;
  Double policyValue;
  Double value;
  
  public RelationalEvaluator() {}
  
  public RelationalEvaluator(RelationalEnum op, Double polVal) {
    this.operator = op;
    this.policyValue = polVal;
  }

  public String getDevice() {
    return this.device;
  }
  
  public void setDevice(String device) {
    this.device = device;
  }
  
  public String getLocation() {
    return this.location;
  }
  
  public void setLocation(String location) {
    this.location = location;
  }
  
  public RelationalEnum getOperator() {
    return this.operator;
  }
  
  public void setOperator(RelationalEnum operator) {
    this.operator = operator;
  }
  
  public Double getPolicyValue() {
    return this.policyValue;
  }
  
  public void setPolicyValue(Double policyValue) {
    this.policyValue = policyValue;
  }
  
  public Double getValue() {
    return this.value;
  }
  
  public void setValue(Double value) {
    this.value = value;
  }

  public boolean evaluate() {
    switch (this.operator) {
      case null:
        if (this.value.equals(this.policyValue)) {
          return true;
        }

        return false;case GREATER_THAN: if (this.value.doubleValue() > this.policyValue.doubleValue()) return true;  return false;case LESSER_THAN: if (this.value.doubleValue() < this.policyValue.doubleValue()) return true;  return false;case GREATER_THAN_OR_EQUAL: if (this.value.doubleValue() >= this.policyValue.doubleValue()) return true;  return false;case LESSER_THAN_OR_EQUAL: if (this.value.doubleValue() <= this.policyValue.doubleValue()) return true;  return false;
    } 
    return false;
  }
}