package com.evaluators.expressions;

import com.evaluators.Evaluate;


public class And implements Evaluate {
  Evaluate policyLeft;
  Evaluate policyRight;
  
  public And(Evaluate left, Evaluate right) {
    this.policyLeft = left;
    this.policyRight = right;
  }

  public boolean evaluate() {
    return (this.policyLeft.evaluate() && this.policyRight.evaluate());
  }
}