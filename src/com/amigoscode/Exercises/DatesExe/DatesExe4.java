package com.amigoscode.Exercises.DatesExe;

import java.time.LocalDate;
import java.time.Period;

public class DatesExe4 {
    public static void main (String[] args){
        //Exe 4: Write a method that calculate age on any given date
        //Solnt 4: Uncomment the method calculateAge
        int year = 1995;
        int month = 3;
        int day = 6;
        LocalDate currentDate = LocalDate.now();
        LocalDate dob = LocalDate.of(year, month, day);
        int age = calculateAge(dob, currentDate);
        System.out.println("Age: " + age);
    }

    private static int calculateAge(LocalDate dob, LocalDate currentDate) {
        // hint: subtract todays date[year] - date[year]

        // Calculate the period between the birth-date and current date
        Period period = Period.between(dob, currentDate);

        // Get the years from the period
        int years = period.getYears();

        // Get the months from the period
        int months = period.getMonths();

        // Get the days from the period
        int days = period.getDays();

        // Adjust the age based on the months and days
        if (months < 0 || (months == 0 && days < 0)) {
            years--;
        }

        return years;
    }
}
