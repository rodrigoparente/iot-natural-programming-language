package com.evaluators.terminals;

import com.evaluators.enums.TimeEnum;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.joda.time.LocalTime;
import org.joda.time.ReadablePartial;


public class TimeEvaluator
  extends BaseTime
{
  SimpleDateFormat parser = new SimpleDateFormat("hh:mm");

  TimeEnum operator;
  
  LocalTime currentTime;
  
  LocalTime time1 = null;
  LocalTime time2 = null;
  
  public TimeEvaluator(TimeEnum op, String time1) throws ParseException {
    this.operator = op;
    this.currentTime = new LocalTime();
    
    this.time1 = new LocalTime(this.parser.parse(time1));
  }
  
  public TimeEvaluator(TimeEnum op, String time1, String time2) throws ParseException {
    this.operator = op;
    this.currentTime = new LocalTime();

    this.time1 = new LocalTime(this.parser.parse(time1));
    this.time2 = new LocalTime(this.parser.parse(time2));
  }

  public boolean evaluate() {
    switch (this.operator) {
      case null:
        if (this.currentTime.isAfter((ReadablePartial)this.time1)) {
          return true;
        }

        return false;case BEFORE: if (this.currentTime.isBefore((ReadablePartial)this.time1)) return true;  return false;case BETWEEN: if (this.currentTime.isAfter((ReadablePartial)this.time1) && this.currentTime.isBefore((ReadablePartial)this.time2)) return true;  return false;case EXACTLY: if (this.currentTime.isEqual((ReadablePartial)this.time1)) return true;  return false;
    } 
    return false;
  }
  
  public TimeEvaluator() {}
}