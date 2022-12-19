package com.prog3_td2.prog3.controllers.formatter;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class hourFormatter {

    public String formatter(LocalDateTime localDateTime){
       int hour = localDateTime.getHour();
       int minute = localDateTime.getMinute();
       int seconde = localDateTime.getSecond();

        LocalDate localDate = localDateTime.toLocalDate();
        String hours = localDate.toString()+" "+hour+":"+minute+":"+":"+seconde;
        return  hours;
    }
}
