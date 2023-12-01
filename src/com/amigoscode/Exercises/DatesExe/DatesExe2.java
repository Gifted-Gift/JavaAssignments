package com.amigoscode.Exercises.DatesExe;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatesExe2 {
    public static void main(String[] args){
        //Exe 2: Represent your date of birth using LocalDate
        //Solnt 2:
        int year = 1995;
        int month = 3;
        int day = 6;

        LocalDate dob = LocalDate.of(year, month, day);
        System.out.println(dob);

        //using DateTimeFormatter
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy");

        System.out.println("Date of Birth: " + dob.format(dateTimeFormatter));

    }
}
