package com.evaluators.terminals;

import com.evaluators.Evaluate;
import com.evaluators.enums.TimeEnum;
import org.joda.time.ReadablePartial;
import org.joda.time.base.BaseLocal;


public class BaseTime
  implements Evaluate
{
  TimeEnum op;
  BaseLocal baseCurrentTime;
  BaseLocal baseTime1;
  BaseLocal baseTime2;
  
  public boolean evaluate() {
    switch (this.op) {
      case null:
        if (this.baseCurrentTime.isAfter((ReadablePartial)this.baseTime1)) {
          return true;
        }

        return false;case BEFORE: if (this.baseCurrentTime.isBefore((ReadablePartial)this.baseTime1)) return true;  return false;case BETWEEN: if (this.baseCurrentTime.isAfter((ReadablePartial)this.baseTime1) && this.baseCurrentTime.isBefore((ReadablePartial)this.baseTime2)) return true;  return false;case EXACTLY: if (this.baseCurrentTime.isEqual((ReadablePartial)this.baseTime1)) return true;  return false;
    } 
    return false;
  }
}