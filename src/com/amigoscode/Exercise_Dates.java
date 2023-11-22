package com.amigoscode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Exercise_Dates {
    public static void main(String[] args){
        /*//Exe 1:Print today's Date and Time using LocalDate and LocalDateTime
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
*/

        /*//Exe 2: Represent your date of birth using LocalDate
        //Solnt 2:
        int year = 1995;
        int month = 3;
        int day = 6;

        LocalDate dob = LocalDate.of(year, month, day);
        System.out.println(dob);

        LocalDate dobt = LocalDate.of(year, month, day);
        //using DateTimeFormatter
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy");

        System.out.println("Date of Birth: " + dobt.format(dateTimeFormatter));
*/

        /*//Exe 3: Add 100 days to your date of birth and print it
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
*/

        /*//Exe 4: Write a method that calculate age on any given date
        //Solnt 4: Uncomment the method calculateAge
        int year = 1995;
        int month = 3;
        int day = 6;
        LocalDate currentDate = LocalDate.now();
        LocalDate dob = LocalDate.of(year, month, day);
        int age = calculateAge(dob, currentDate);
        System.out.println("Age: " + age);*/

    }

    /*private static int calculateAge(LocalDate dob, LocalDate currentDate) {
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
    }*/

}
