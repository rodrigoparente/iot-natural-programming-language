package com.evaluators.expressions;

import com.evaluators.Evaluate;


public class Or implements Evaluate {
  Evaluate policyLeft;
  Evaluate policyRight;
  
  public Or(Evaluate left, Evaluate right) {
    this.policyLeft = left;
    this.policyRight = right;
  }

  public boolean evaluate() {
    return !(!this.policyLeft.evaluate() && !this.policyRight.evaluate());
  }
}