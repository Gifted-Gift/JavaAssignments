package com.amigoscode.Exercises.ConditionalExe;

public class ConditionalExe8 {
    public static void main (String[] args){
        //Exe 8: An if within a for loop
        //In this final example, let's go one more step further and introduce a for loop to our previous answer. The idea is to use a for loop to check if the provided character is present at any point within our word.
        //Solnt 8:
        String word = "Hello world!";
        // Specify the character to check for (convert to lowercase for case-insensitive check)
        char charac = 'l';

        // Convert the specified character to lowercase for case-insensitive check
        char charsLower = Character.toLowerCase(charac);

        // Use a for loop to check if the specified character is present in the word
        boolean found = false;
        for (int i=0; i<word.length(); i++){
            char currChar = Character.toLowerCase(word.charAt(i));
            if(currChar== charsLower) {
                found = true;
                break;//Exits the loop early as the character is found
            }
        }
        // Check if the character was found and print the result
        if (found){
            System.out.println("The sting contains '" + charac + "' (case-insensitive)" );
        }else{
            System.out.println("The sting doesn't contain '" + charac + "' (case-insensitive)" );
        }
    }
}
