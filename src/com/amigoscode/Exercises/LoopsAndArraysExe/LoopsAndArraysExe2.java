package com.amigoscode.Exercises.LoopsAndArraysExe;

public class LoopsAndArraysExe2 {
    public static void main(String[] args){
        /*//Exercise 2:
            Write a program that compares two numbers. Use any comparison operator
            Create 3 variables.
            2 variables to store both numbers and 1 variable store the result
            Print the result*/
        //Solnt 2:
        int num1 = 3;
        int num2 = 3;
//        boolean result = (num1==num2);
//        System.out.println(result);
        String result;
        if (num1 > num2){
            result = ("Number " + num1 + " is greater than Number" + num2);
        } else if (num1 < num2) {
            result = ("Number " + num1 + " is less than Number " + num2);
        }else{
            result = ("Number " + num1 + " is equal to Number " + num2);
        }
        System.out.println(result);
    }
}
