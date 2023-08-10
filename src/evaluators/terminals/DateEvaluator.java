package com.evaluators.terminals;

import com.evaluators.Evaluate;
import com.evaluators.enums.TimeEnum;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;


public class DateEvaluator
  implements Evaluate
{
  SimpleDateFormat parser = new SimpleDateFormat("MM/dd/yyyy");

  TimeEnum operator;
  
  LocalDate currentDate;
  
  LocalDate date1 = null;
  LocalDate date2 = null;

  public DateEvaluator(TimeEnum op, String date1) throws ParseException {
    this.operator = op;
    this.currentDate = new LocalDate();
    
    this.date1 = new LocalDate(this.parser.parse(date1));
  }
  
  public DateEvaluator(TimeEnum op, String date1, String date2) throws ParseException {
    this.operator = op;
    this.currentDate = new LocalDate();

    this.date1 = new LocalDate(this.parser.parse(date1));
    this.date2 = new LocalDate(this.parser.parse(date2));
  }

  public boolean evaluate() {
    switch (this.operator) {
      case null:
        if (this.currentDate.isAfter((ReadablePartial)this.date1)) {
          return true;
        }

        return false;case BEFORE: if (this.currentDate.isBefore((ReadablePartial)this.date1)) return true;  return false;case BETWEEN: if (this.currentDate.isAfter((ReadablePartial)this.date1) && this.currentDate.isBefore((ReadablePartial)this.date2)) return true;  return false;case EXACTLY: if (this.currentDate.isEqual((ReadablePartial)this.date1)) return true;  return false;
    } 
    return false;
  }
  
  public DateEvaluator() {}
}