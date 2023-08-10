package com.evaluators.terminals;

import com.evaluators.Evaluate;
import com.evaluators.enums.BooleanEnum;


public class BooleanEvaluator
  implements Evaluate
{
  String device;
  String location;
  BooleanEnum operator;
  boolean value;
  
  public BooleanEvaluator() {}
  
  public BooleanEvaluator(BooleanEnum op) {
    setOperator(op);
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
  
  public BooleanEnum getOperator() {
    return this.operator;
  }
  
  public void setOperator(BooleanEnum operator) {
    this.operator = operator;
  }
  
  public boolean isValue() {
    return this.value;
  }
  
  public void setValue(boolean value) {
    this.value = value;
  }

  public boolean evaluate() {
    switch (this.operator) {
      case TRUE:
        if (this.value) {
          return true;
        }

        return false;case null: if (!this.value) return true;  return false;
    } 
    return false;
  }
}