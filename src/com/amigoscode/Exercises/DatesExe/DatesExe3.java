package com.amigoscode.Exercises.DatesExe;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatesExe3 {
    public static void main(String[] args){
        //Exe 3: Add 100 days to your date of birth and print it
        //Solnt 3:
        int year = 1995;
        int month = 3;
        int day = 6;
        int addedDays = 100;
        LocalDate dob = LocalDate.of(year, month, day);
        LocalDate newDate = dob.plusDays(addedDays);

        //using DateTimeFormatter
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println("New Date of Birth after adding 100: " + newDate.format(dateTimeFormatter));

    }
}
