package com.amigoscode.Exercises.ConditionalExe;

public class ConditionalExe7 {
    public static void main (String[] args){
        //Exe 7: Checking the first letter of a string
        // create a String variable and assign it a value
        // create an `if` statement which grabs the first letter of your word and compares it against a Character value
        // print something to the console if the condition is met
        String word = "Hello";
        char charac = 'h';
        if(word.charAt(0)== charac){
            System.out.println("The sting starts with " + charac);
        }else{
            System.out.println("The sting doesn't starts with " + charac);
        }
        //to make is case-insensitive
        char charsLower = Character.toLowerCase(charac);
        char frirstcharLower = Character.toLowerCase(word.charAt(0));
        if(frirstcharLower== charsLower){
            System.out.println("The sting starts with '" + charac + "' (case-insensitive)" );
        }else{
            System.out.println("The sting doesn't starts with '" + charac + "' (case-insensitive)" );
        }
    }
}
