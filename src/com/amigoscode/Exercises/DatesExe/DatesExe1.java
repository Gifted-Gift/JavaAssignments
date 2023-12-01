package com.amigoscode.Exercises.DatesExe;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatesExe1 {
    public static void main(String[] args){
        //Exe 1:Print today's Date and Time using LocalDate and LocalDateTime
        //Solnt 1:
        LocalDate todayDate = LocalDate.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Today's date is " + todayDate);
        int currentHour = LocalDateTime.now().getHour();
        int currentMin = LocalDateTime.now().getMinute();
        int currentSec = LocalDateTime.now().getSecond();
        System.out.println("The time now is " + currentHour + ":" + currentMin + ":" + currentSec);

        //Using DateTimeFormatter
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //printing with DateTimeFormatter
        System.out.println("The date today is " + todayDate.format(dateFormatter));
        System.out.println("Current Date and Time is " + currentDateTime.format(dateTimeFormatter));

    }
}
