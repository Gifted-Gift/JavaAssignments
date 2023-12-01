package com.amigoscode.Exercises.ConditionalExe;

public class ConditionalExe6 {
    public static void main (String[] args){
        //Exe 6: Logical OR ||
        //Modify your answer to Question 5 to instead use an OR operator. Play about with the values assigned to your three variables, noting how the behaviour changes.
        //Solnt 6:
        int x=4, y=10, z=2;
        if (x>y || x<z){
            System.out.println(x + " > " + y + " or < " + z);
        }else{
            System.out.println(x + " does not meet the condition");
        }
    }
}
