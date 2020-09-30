/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Calendar;


/**
 *
 * @author hp
 */
public class time {
       private int hour;
    private int minute;
    private int seconds;
    
    String TIME ;
  

    public time(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public int getHour() {
       return Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    }

    public int getMinute() {
       return Calendar.getInstance().get(Calendar.MINUTE);
    }

    public int getSeconds() {
       return Calendar.getInstance().get(Calendar.SECOND);
    }
    @Override
      public String toString() {
        return getHour() + ":" + getMinute() + ":" + getSeconds() + " ";
    }
 
}
