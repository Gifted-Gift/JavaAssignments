package com.amigoscode.Exercises.ConditionalExe;

public class ConditionalExe5 {
    public static void main (String[] args){
        //Exe 5: Logical AND &&
        //Expanding on your answer to Question 4, create a third Integer value and modify your if statement to check if the first value is greater than the second and less than the third.
        //Solnt 5:
        int x=4, y=5, z=6;
        if (x>y && x<z){
            System.out.println(x + " > " + y + " && < " + z);
        }else{
            System.out.println(x + " does not meet the condition");
        }
    }
}
