package com.prog3_td2.prog3.controllers.formatter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class hourFormatter {

    public static String customformat(LocalDateTime localDateTime){
       int hour = localDateTime.getHour();
       int minute = localDateTime.getMinute();
       int second = localDateTime.getSecond();

       LocalDate localDate1 = localDateTime.toLocalDate();
        return   localDate1.toString()+" "+hour+":"+minute+":"+second;
    }
}
