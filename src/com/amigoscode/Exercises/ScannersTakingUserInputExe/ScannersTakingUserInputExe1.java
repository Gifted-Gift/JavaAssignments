package com.amigoscode.Exercises.ScannersTakingUserInputExe;

import java.util.Scanner;

public class ScannersTakingUserInputExe1 {
    public static void main(String[] args){
        //Exe 1:Take an input string from the user (from the terminal) and print it back out all in upper case
        //Solnt 1:
        Scanner scann = new Scanner(System.in);
        System.out.println("I am gonna perform magic, enter anything in lowercase and I will print it back in uppercase!");
        String input = scann.nextLine();
        String upperInput = input.toUpperCase();
        System.out.println(upperInput);
        scann.close();
    }
}
