package com.amigoscode;

public class Exercise_Conditional {
    public static void main (String[] args){
        /*//Examples:
        boolean numberCheck = 5 >= 4;

        System.out.println(numberCheck);

        int ourNumber = 9;

        boolean numberCheck2 = ourNumber == 5;

        System.out.println(numberCheck2);
        numberCheck = (ourNumber > 10 || ourNumber < 7);
        System.out.println(numberCheck);*/

        /*//Exe 1: An if statement
        //Simply create an if statement which checks if an Integer-type variable is equal to another
        //Sont 1;
        int x=6 , y=9;
        if (x==y){
            System.out.println(x + " = " + y + ", so condition is true.");
        }*/

        /*//Exe 2: Comparison of Strings Part I
        //In this exercise, please use the shortened form of declaring a String-type variable (e.g. String myString = "Hello!")
        //Solnt 2:
        String x = "Hello", y = "Hello";
        if (x==y){
            System.out.println(x + " = " + y + ", so condition is true.");
        }*/

        /*//Exe 3: Comparison of String Part II
        //Repeat the same exercise as above, but this time ensure that you are creating a new string object for both variables (e.g. String myString = new String("Hello!"))
        //Solnt 3:
        String x = new String("Hello"),
                y = new String("Hello");
        if (x.equalsIgnoreCase(y)){
            System.out.println(x + " = " + y + ", so condition is true.");
        }*/

        /*//Exe 4: Greater than >
        //Similar to Question 1, now create an if statement which checks if one Integer value is greater than the other. Include an else statement here for if the condition is not satisfied.
        //Solnt 4:
        int x=4, y=6;
        if(x>4){
            System.out.println(x);
        }else{
            System.out.println(y);
        }*/

        /*//Exe 5: Logical AND &&
        //Expanding on your answer to Question 4, create a third Integer value and modify your if statement to check if the first value is greater than the second and less than the third.
        //Solnt 5:
        int x=4, y=5, z=6;
        if (x>y && x<z){
            System.out.println(x + " > " + y + " && < " + z);
        }else{
            System.out.println(x + " does not meet the condition");
        }*/

        /*//Exe 6: Logical OR ||
        //Modify your answer to Question 5 to instead use an OR operator. Play about with the values assigned to your three variables, noting how the behaviour changes.
        //Solnt 6:
        int x=4, y=10, z=2;
        if (x>y || x<z){
            System.out.println(x + " > " + y + " or < " + z);
        }else{
            System.out.println(x + " does not meet the condition");
        }*/

        /*//Exe 7: Checking the first letter of a string
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
        }*/

        /*//Exe 8: An if within a for loop
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
        }*/

        /*//Exe 9: Even numbers
        // create a for loop which goes from 0 to 20
        // print each even value

        //Solnt 9:
        for(int i=0; i<=20; i++){
            if(i % 2 ==0){// Check if the current value is even (divisible by 2),
                //if its not divisible by 2 then its old i % 2 !=0
                System.out.println(i);
            }
        }*/
    }
}
