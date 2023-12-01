package com.amigoscode.Exercises.ConditionalExe;

public class ConditionalExe3 {

    public static void main (String[] args){
        //Exe 3: Comparison of String Part II
        //Repeat the same exercise as above, but this time ensure that you are creating a new string object for both variables (e.g. String myString = new String("Hello!"))
        //Solnt 3:
        String x = new String("HelLo"),
                y = new String("Hello");
        if (x.equalsIgnoreCase(y)) {
            System.out.println(x + " = " + y + ", so condition is true.");
        }
    }
}
