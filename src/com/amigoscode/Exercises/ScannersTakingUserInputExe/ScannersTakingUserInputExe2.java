package com.amigoscode.Exercises.ScannersTakingUserInputExe;

import java.util.Scanner;

public class ScannersTakingUserInputExe2 {
    public static void main(String[] args){
        //Exe 2;
        //  Write a program that receives numbers as program arguments and prints to console if numbers are even or odd
        //You might compile and run the program via command line or by editing configuration and pass program arguments
        //Solnt 2:
        ///beginning of amigoscode solnt
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
        }
    }
}
