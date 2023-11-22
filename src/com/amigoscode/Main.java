package com.amigoscode;

import java.io.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       /* // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //System.out.println("Hello Java");
//        System.out.println(10+10);
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }*///IntelliJ auto code ends here

        /*//STRINGS
        String name1 = "Jamila";
        String name2 = "Jamila";
        //name2 = "Alex";
        String name3 = new String("Jamila");
        System.out.println("String equality with ==");
        System.out.println(name1==name2);
        System.out.println(name1 == name3);
        System.out.println("String equality with .equals");
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));
        // when comparing strings, dnt use == use >equals
        //If u use == it would check whether the reference of two variables points to the same object in memory
        //.equals compares the content within variables

        String number = String.valueOf(1);
        System.out.println(number);
        String format = String.format("Number %s", number);//this allows me to have %s as a placeholder to a string template,
        System.out.println(format);//so this will display Number 1, so its like using System.out.println("Number " + number);
        String[] names = {"Jamila", "Alex", "Aisha"};
        String join = String.join(",", names);//.join allows you to pass a delimiter to a string
        System.out.println(join);//so this will print Jamila,Alex,Aisha
        String join2 = String.join(" | ", names);//.join allows you to pass a delimiter to a string
        System.out.println(join2);//so this will print Jamila | Alex | Aisha
        */

        /*//WORKING WITH DATES AND TIME
        //LocalDateTime gives you date and time
        LocalDateTime now = LocalDateTime.now();//LocalDateTime using the import java.time.LocalDateTime;
        System.out.println("Date-Time series:");
        System.out.println("The exact current date and time is " + now);
        System.out.println(String.format("The current month is %s",now.getMonth()));
        System.out.println("The exact current day of the year is " + now.getDayOfYear());
        System.out.println("The exact current day of the week is " + now.getDayOfWeek());
        System.out.println("The exact current hour is " + now.getHour());
        System.out.println("The exact current minute is " + now.getMinute());
        System.out.println("The exact current second is " + now.getSecond());
        System.out.println("The exact current date time minus 5 days is " + now.minusDays(5));
        System.out.println();

        //If you want ony date then you use LocalDate
        LocalDate nowDate = LocalDate.now();//LocalDateTime using the import java.time.LocalDateTime;
        System.out.println("Date Only series:");
        System.out.println("The exact current date is " + nowDate);
        System.out.println(String.format("The current month is %s",nowDate.getMonth()));
        System.out.println("The exact current day of the year is " + nowDate.getDayOfYear());
        System.out.println("The exact current day of the week is " + nowDate.getDayOfWeek());
        System.out.println("The exact current date minus 5 days is " + nowDate.minusDays(5));
        System.out.println();

        //If ypu want to work with only time, you use LocalTime
        LocalTime localTime = LocalTime.now();
        System.out.println("Time only series");
        System.out.println(localTime);
        System.out.println();

        LocalDateTime someDate = LocalDateTime.of(
                2023,
                Month.DECEMBER,
                1,
                14,
                55,
                44,
                905
        );

        Timestamp someTime = Timestamp.valueOf(someDate);
        System.out.println("Past date created");
        System.out.println(someDate);
//        System.out.println(Instant.now().plus(Duration.ofHours(1)));
        System.out.println(someTime);
        System.out.println(new Timestamp(new Date().getTime()));
        */

        //TRYING ZONEID
//      ZoneId.getAvailableZoneIds();//ZoneId is a class
        /*LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowInAustraliaSydney =
        LocalDateTime.now(ZoneId.of("Australia/Sydney"));
        LocalDateTime nowInCanadaCentral =
        LocalDateTime.now(ZoneId.of("Canada/Central"));
        System.out.println(now);
        System.out.println(nowInAustraliaSydney);
        System.out.println(nowInCanadaCentral);
        for (String zone : ZoneId.getAvailableZoneIds()){
            System.out.println(zone);
        }//This for is to print al the Zones in the ZoneId class

        System.out.println("ZonedDateTime: " + ZonedDateTime.now());// To pick the zone date time and zone for ur current zone
        System.out.println("LocalDateTime: " + LocalDateTime.now());
        System.out.println("Instant: " + Instant.now());


        // Get the current day and month
//        LocalDate currentDate = LocalDate.now();
//        int currentDay = currentDate.getDayOfMonth();
//        int currentMonth = currentDate.getMonthValue();
//        System.out.println("DDD: "+ currentDay + currentMonth);
        */


        /*//DOUBLE VS BIGDECIMAL
        double numb1 = 0.02;
        double numb2 = 0.03;
        double result = numb2 - numb1;
        System.out.println(result);//The result would be 0.009999999999999998, bcus of double
        //So do not use double for money in your code
        //The data type to use is BigDecimal, you wou do = new BigDecimal("0.02"), you should pass the value as string

        BigDecimal number1 = new BigDecimal("0.02");
        BigDecimal number2 = new BigDecimal("0.03");
        BigDecimal results = number2.subtract(number1);
        System.out.println(results);
        BigDecimal number = BigDecimal.TEN;
        System.out.println(number);
        System.out.println(number.add(BigDecimal.ONE));
        System.out.println(number.max(BigDecimal.ZERO));//max, will print the number that is bigger so 10
        System.out.println(number.compareTo(BigDecimal.ZERO));//So this will compare the value of number, which is 10 to zero, and print 1 since 10 is bigger, if its was smaller it will print -1, if they are same, it will print 0
        System.out.println(number.compareTo(new BigDecimal("11")));
        System.out.println(number.compareTo(BigDecimal.TEN));
        */

        /*//USING SCANNER CLASS
        System.out.println("Hello, what is your name?");
        Scanner scannerinput = new Scanner(System.in);
        //System.in is used so that the Scanner class can be used to read not only from the terminal but from other sources as well, such as from a file or stream.
        String input = scannerinput.nextLine();
        System.out.println("Hello " + input);

        System.out.println("What is your age?");
        int age = scannerinput.nextInt();
        if(age<16){
            System.out.println("Awwwww, you are a child!");
        }else {
            System.out.println("Congrats, you are an adult!");
        }*/

        /*//HANDLING EXCEPTIONS
        //to handle exceptions u use the try and catch box
        try{
            int number = Integer.parseInt("1x");
            System.out.println(number);
            for (int i =10; i>0; i--){
                System.out.println(10/ i);
            }
            System.out.println("end");
//        }catch (NumberFormatException e){
//            System.out.println("Failed to parse 1x");
//        }catch (ArithmeticException e){
//            System.out.println("Cannot divide by 0");
        }
        //U can have as many catch as you want.
        //You can also combine you catch into one using the or symbol |
        catch (NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();
            System.out.println(e.getClass());
        }
        //When you don't know the type of exception that will be thrown, use Exception in you catch
        catch (Exception e){//catch all exception
            System.out.println("Catch all exceptions");
            System.out.println(e.getMessage());
        }finally {//The finally part will always run regardless of the exception
            //it is mainly used for clan up purposes
            System.out.println("Finally always run :)");
        }*/

        //checked exceptions are compile exceptions. they must be fixed bfor the code can compile
//        File file = new File("src/foo.txt");
//        if (!file.exists()){
//            file.createNewFile();
//        }
        //we can use try and catch to catch it
//        try {
//            File file = new File("src/foo.txt");
//            if (!file.exists()){
//                file.createNewFile();
//            }
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        //Throwing an exception
//        System.out.println(divide(10, 0));//uses the double divide method below

//        //calling my own created exception that calls my created exception class
//        System.out.println(unCheckedDivide(10,0));//using the int unCheckedDivide method below

        //calling my own created exception that calls my created exception class
//        try {
//            System.out.println(checkedDivide(10,0));//using the int checkedDivide method below
//        } catch (MyCheckedException e) {
////            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }*/

        /*//WORKING WITH FILES
        //to create a file, u use the File class, and it comes from java.io
        //because if the file does not exist, it will throw a checked exception, ioexception
        //we have to deal with it first using a try catch
        *//*try{
            File file = new File("src/foo.txt");
            if (!file.exists()){
                file.createNewFile();
            }
//            if(file.exists()){
//                file.delete();
//            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }*//*
        //I wanna put the create file in a method, hence I commented the above create file code lines
        //So now I will call the createFile method
        File file = createFile("src/foo.txt");

        //WRITING TO A FILE
        *//*try {
            FileWriter fileWriter = new FileWriter(file, true);
            //FileWriter fileWriter = new FileWriter(file); means everytime you write to the file, it overwrutes what was there
            //to append to it, you use FileWriter fileWriter = new FileWriter(file, true);
            PrintWriter writer = new PrintWriter(fileWriter);//the PrintWriter allows us to actually write to the file
            writer.println("Jamila");//writing using the writer now
//            writer.println("");
//            writer.println("Code");
            //after writing to the file, we need to flush
            writer.flush();//flush mean we basically flush the items into the file
            //and also we need to close
            writer.close();//and we close because we no longer need the writer


        }catch (IOException e){
            System.out.println(e.getMessage());
        }*//*
        //Now I want to put the write to file in a private method, hence I commented out the try catch the is writing to file
        //So now I will call writeToFile method
        writeToFile(file, true);//calling the writeToFile method below, and appending if i use true
//        writeToFile(file, false);

        //READING FROM A FILE
        //To read from a file, we will use the scanner class
        try {
            Scanner scann = new Scanner(file);//we surround with a try catch bcus it can throw a file now found error
            while (scann.hasNext()){
                System.out.println(scann.nextLine());
            }
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }*/

    }

   /* //Creating an exception method, that uses inbuilt exceptions
    public static double divide(int a, int b){

        if (b==0){
            throw new IllegalArgumentException("Cannot divide by 0");
        }
        return a/b;
    }*/


    /*//Creating an exception method, that uses my unchecked exception class
    public static int unCheckedDivide(int a, int b){
        if(b==0){
            throw new MyUnCheckedException("Cannot divide by 0");
        }
        return a/b;
    }*/

    /*//Creating an exception method, that uses my checked exception class
    public static int checkedDivide(int a, int b) throws MyCheckedException{
        if(b==0){
            throw new MyCheckedException("Cannot divide by 0");
        }
        return a/b;
    }*/

    /*private static File createFile(String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            return file;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }

    }*/

   /* private static void  writeToFile(File file, boolean append){
        *//*try {
            FileWriter fileWriter = new FileWriter(file, true);
            //FileWriter fileWriter = new FileWriter(file); means everytime you write to the file, it overwrutes what was there
            //to append to it, you use FileWriter fileWriter = new FileWriter(file, true);
            PrintWriter writer = new PrintWriter(fileWriter);//the PrintWriter allows us to actually write to the file
            writer.println("Jamila");//writing using the writer now
//            writer.println("");
//            writer.println("Code");
            //after writing to the file, we need to flush
            writer.flush();//flush mean we basically flush the items into the file
            //and also we need to close
            writer.close();//and we close because we no longer need the writer


        }catch (IOException e){
            System.out.println(e.getMessage());
        }*//*

        //Lets see how to us try with resources so we dnt have to flush and close explicitly
        //Since the writer class implements Appendable, Closeable, Flushable
        //And anything that uses Closeable, Flushable means that we can use try with resources
        //so we dnt have to flush nor close, the try with resources caters for that for us
        try(
                FileWriter fileWriter = new FileWriter(file, true);
                PrintWriter writer = new PrintWriter(fileWriter);
                ){
            writer.println("Bianca");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }*/

    /*static class Cat{
        private String name;///property of the class
        public void meow(){//meow method which is the behaviour
            System.out.println(name+ ": meow...");
        }
    }*/

}