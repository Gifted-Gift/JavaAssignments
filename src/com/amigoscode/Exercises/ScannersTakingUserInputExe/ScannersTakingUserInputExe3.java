package com.amigoscode.Exercises.ScannersTakingUserInputExe;

import java.util.Scanner;

public class ScannersTakingUserInputExe3 {
    public static void main(String[] args){
        //Exe 3:
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
        }
    }

    //method used in exe 3
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

    }
}
