package com.amigoscode.Exercises.ConditionalExe;

public class ConditionalExe9 {
    public static void main (String[] args){
        //Exe 9: Even numbers
        // create a for loop which goes from 0 to 20
        // print each even value

        //Solnt 9:
        for(int i=0; i<=20; i++){
            if(i % 2 ==0){// Check if the current value is even (divisible by 2),
                //if its not divisible by 2 then its old i % 2 !=0
                System.out.println(i);
            }
        }
    }
}
