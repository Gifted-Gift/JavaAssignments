package com.amigoscode;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Scanners_Taking_User_Input {
    public static void main(String[] args){

        /*//Exe 1:Take an input string from the user (from the terminal) and print it back out all in upper case
        //Solnt 1:
        Scanner scann = new Scanner(System.in);
        System.out.println("I am gonna perform magic, enter anything in lowercase and I will print it back in uppercase!");
        String input = scann.nextLine();
        String upperInput = input.toUpperCase();
        System.out.println(upperInput);
        scann.close();*/

        //Exe 2;
        //  Write a program that receives numbers as program arguments and prints to console if numbers are even or odd
        //You might compile and run the program via command line or by editing configuration and pass program arguments
        //Solnt 2:
        /*///beginning of amigoscode solnt
        // Check if the program was run with arguments
        if (args.length == 0) {
            System.out.println("Please provide numbers as program arguments.");
            return;
        }
        for (String arg : args) {
            try {
                int number = Integer.parseInt(arg);
                if (number % 2 == 0) {
                    System.out.println(number + " is even.");
                } else {
                    System.out.println(number + " is odd.");
                }
            } catch (NumberFormatException e) {
                System.out.println(arg + " is not a valid integer.");
            }
        }/////end of amigoscode solnt
        //my solnt: to run in intellij
        Scanner scann = new Scanner(System.in);
        int n=0;
        int[] number = new int[10];
        for (int i=0; i<number.length; i++){
            number[i] = scann.nextInt();
            if((number[i] % 2) == 0){
                System.out.println("Number " + number[i] + " is evem");
            }else {
                System.out.println("Number " + number[i] + " is odd");
            }
        }*/

        /*//Exe 3:
        // Write a program that takes an input number from the console and prints if number is prime
        // Create a method to check if number is prime then use against the input
        //Solnt 3:
        Scanner scann = new Scanner(System.in);
        System.out.println("Enter a number to check if its prime");
        int numb = scann.nextInt();
        boolean isPrimeNum = isPrime(numb);// refer to method isPrime below
        if(isPrimeNum){
            System.out.println(numb + " is a prime number,");
        }else{
            System.out.println(numb + " is not a prime number,");
        }*/

        /*//Exe 4:
        //Write a method that displays random joke to the user.
        //    Your program should stop displaying jokes when use inputs no.
        //    For e.g
        //    Want to hear a joke? Yes/No
        //        if yes then display joke and repeat same question
        //        if no then program should exit

        //Solnt 4: restudy it and 3 too
        String[] jokes ={
                "Why don't scientists trust atoms? Because they make up everything!",
                "Why don't some couples go to the gym? Because some relationships don't work out!",
                "What do you call fake spaghetti? An impasta!",
                "Why don't skeletons fight each other? They don't have the guts!",
                "Why did the scarecrow win an award? Because he was outstanding in his field!",
                "Did you hear about the mathematician who's afraid of negative numbers? He'll stop at nothing to avoid them!",
                "Why don't some couples go to the gym? Because some relationships don't work out!",
                "Why was the math book sad? It had too many problems.",
                "Why did the bicycle fall over? Because it was two-tired!",
                "Why don't some fish play piano? You can't tuna fish!"
        };

        Random random = new Random();
        Scanner scann = new Scanner(System.in);

        while (true) {
            System.out.print("Want to hear a joke? (Yes/No): ");
            String input = scann.nextLine().trim().toLowerCase();

            if (input.equals("no")) {
                System.out.println("Alright, goodbye!");
                break;
            } else if (input.equals("yes")) {
                int randomNumber = random.nextInt(jokes.length);
                System.out.println(jokes[randomNumber]);
            } else {
                System.out.println("Invalid input. Please enter 'Yes' or 'No'.");
            }
        }

        scann.close();*/

    }

    /*//method used in exe 3
    public static boolean isPrime(int num){
        //Since 1 is not a prime number and less than 1 isn't
        if(num<=1){
            return false;
        }

        // Check for divisors from 2 to the square root of the number
        for(int i=2; i<= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }

        return true;

    }*/
}
