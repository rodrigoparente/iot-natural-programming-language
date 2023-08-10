package com.evaluators.terminals;

import com.evaluators.Evaluate;
import com.evaluators.enums.StateEnum;


public class StateEvaluator
  implements Evaluate
{
  String device;
  String location;
  StateEnum operator;
  boolean value;
  
  public StateEvaluator() {}
  
  public StateEvaluator(StateEnum op) {
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
  
  public StateEnum getOperator() {
    return this.operator;
  }
  
  public void setOperator(StateEnum operator) {
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
      case ON:
      case OPEN:
        if (this.value) {
          return true;
        }

        return false;case OFF: case null: if (!this.value) return true;  return false;
    } 
    return false;
  }
}