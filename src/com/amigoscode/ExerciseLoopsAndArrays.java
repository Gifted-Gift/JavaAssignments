package com.amigoscode;

public class ExerciseLoopsAndArrays {
    public static void main(String[] args){
        /*//Exercise 1:Make sure when the following code runs it only prints I love cats. Don't delete the any code.
        //Solnt 1:
        System.out.println("I love cats");
//        System.out.println("I hate cats");*/

        /* //Exercise 2:
            Write a program that compares two numbers. Use any comparison operator
            Create 3 variables.
            2 variables to store both numbers and 1 variable store the result
            Print the result
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
        System.out.println(result);*/

         /*  Exercise 3"
            Write a program that compares two String contents.
            Create 3 variables.
            2 to store both strings and 1 to store the result
            Print the result
         //Solnt 3:
        String firstString = "Nathan";
        String secondString = "Gift";
        String result;
        if (firstString.equals(secondString)){
            result = (firstString + " is same as " + secondString);
        }else{
            result = (firstString + " is different from " + secondString);
        }
        System.out.println(result);*/

        /* Exercise 4:
         Write a program that transform "Amigoscode" to "AMIGOSCODE"
        //Solnt 4:
        String outmessage = "Amigoscode";
        String result = String.format("Transformed message: %s", outmessage.toUpperCase());
        System.out.println(result);*/


        /*Exercise 5:
        // Write a program that transform "amigoscode" to "Amigoscode"
         //Solnt 5:
        String origMessage = "amigoscode";
        String TransMessage = String.format("Transformed message: %s", origMessage.substring(0,1).toUpperCase() + origMessage.substring(1));
        System.out.println(TransMessage);*/


       /*  Exercise 6:
            Write a program that compares two numbers. i.e x > y
            Create 3 variables.
            2 to store both numbers and 1 to store the result
            Print the result
          //Solnt 6:
        int x =4,y=4;
        String z;
        if (x>y){
            z = ("if part executed: " + x + " is greater than " + y);
        } else if (x<y) {
            z = ("else-if part executed: " + x + " is less than " + y);
        }else {
            z = ("else part executed: " + x + " is equal to " + y);
        }
        System.out.println(z);*/

        /*//Exercise 7:
        Make sure you have a class called Main
        Change package name to match yours
        Copy and paste this class to you IDE, spot and fix all errors and make sure the code runs and compiles.

        public class Main {
            static void main(String args) {
                System.out.println("Fixed");
            }
        Solnt 7;
        Note: this should be in a different class file by the way
        package com.amigoscode;

        public class Main {
            static void main(String args) {
                System.out.println("Fixed");
            }
        }
         */


        //Loops and Arrays Exercises.
        /*//Exercise 1
        declare an empty integer array of length = 3
        print the contents to the console
        Solnt 1:
        int[] myArray = new int[3];
        for (int i=0; i< myArray.length; i++){
            System.out.println("Index " + i + " is " + myArray[i]);
        };

        //or

        int[] mixArray = new int[3];
        System.out.println(Arrays.toString(mixArray));
        */

        /*//Exercise 2;
        //Continue from the Exercise 1
        // fill it with the number `4`
        // print the array to the console
        //Solnt 2:
        int[] myArray = new int[3];

        for (int i=0; i<myArray.length; i++){
            myArray[i] = 4;
            System.out.println("Index " + i + " is " + myArray[i]);
        }*/

        /*//Exercise 3:
        //Continuing from previous exercise
        // reassign the second value in the array to the number `17`
        // print the array to the console
        //Solnt 3:
        int[] myArray = new int[3];

        for (int i=0; i<myArray.length; i++){
            myArray[i] = 4;
            myArray[1] = 5;
            System.out.println("Index " + i + " is " + myArray[i]);
        }*/

        /*//Exercise 4:
        //What happens when you try to re assign index 5 to any integer?
        //in
        //int[] numbers = {1, 2, 3, 4, 5};
        //Solnt 4:
        //It will throw an error bcus the array index starts from 0 and ends in 4,
        //so index 5 is out of range

        //Exercise 5:
        // declare and initialize a String array which holds the values "a", "b", "c" and "d"
        // print the array to the console

        //Solnt 5:
        String[] myStringArray = {"a", "b", "c", "d"};
        System.out.println("First Array: " + Arrays.toString(myStringArray));
        //or printing with for loop
        for (int i=0; i<myStringArray.length; i++){
            System.out.println("Element " + i + " is " + myStringArray[i]);
        }*/

        /*//Exercise 6:
        // using your answer from Q5 above, create a second array which is initialized using your original array
        // hint: instead of using the `new` keyword, try simply giving the name of your original array
        // change the value at index 0 of the new array to "z"
        // print both of your arrays and compare

        //Solnt 6: Uncomment solnt 5 to use the array in it
        String[] secondArray = myStringArray;
        secondArray[0] = "z";
        System.out.println("\nSecond Array: " + Arrays.toString(secondArray));
        //or printing with for loop
        for (int i=0; i<myStringArray.length; i++){
            System.out.println("Element " + i + " is " + secondArray[i]);
        }
        */

        /*//Exercise 7:
        // using your answer to Q6, create another array which is A COPY off of your original array (using the `Arrays.copyOf()` method)
        // NOTE that the `.copyOf()` method accepts two arguments, first being the array that's being copied and second being the length of the new array
        // change the value at index 0 of the new array to "z"
        // print both of the arrays and compare
        // Have a play about with the second argument. What happens if it's greater or less than the length of the initial array?

        //Solnt 7:
        //Uncomment solnt 5 for this
        String[] copyArray = Arrays.copyOf(myStringArray, 3);//to play with the second argument, just change the number for the newlength to a num that's greater or less than the original array length
        //String[] copyArray = Arrays.copyOf(myStringArray, myStringArray.length);//using the original array's length.
        copyArray[0] = "z";
        System.out.println("\nCopycat Array: " + Arrays.toString(copyArray));
        //or
        for (int i=0; i<copyArray.length; i++){
            System.out.println("Element " + i + " is " + copyArray[i]);
        }*/

        /*//Exe 7b
        String[] a = {"a", "b", "c", "d"};
        // create a `for` loop which prints each item in the array
        //Solnt 7b
        for (int i=0; i< a.length; i++){
            System.out.println("Item " + (i+1) + " is " + a[i]);
        }
        //or using final
        for (final String s : a){
            System.out.println("S Item is " + s);
        }*/

        /*//Exercise 8:
        // create a for loop which goes from 0 to 10
        // print each value
        //Solnt 8:
        for(int i=0; i<=10; i++){
            System.out.println(i);
        }*/


        /*//Exercise 9:
        // create a for loop which goes from 10 down to 0
        // print each value
        //Solnt 9:
        for(int i=10; i>=0; i--){
            System.out.println(i);
        }*/

        //Exercise 10
        //Create a loop that adds all numbers 0-10 to an array then prints the array
        // create an array. Remember to manually set the size
        // create a for loop which goes from 0 to 10, adding each value to an array
        // print our array
        //solnt 10:
        /*int[] myArray = new int[11];

        for(int i=0; i<11; i++){
            myArray[i]= i;
        }
        System.out.println("Array contents: " + Arrays.toString(myArray));
        //or
        for(int i=0; i<myArray.length; i++){
            System.out.println("Element " + i + " is " + myArray[i] );
        }*/

        /*//Exercise 11
        //Create a loop that adds to a sum
        // create an array of n numbers
        // create a sum variable
        // create a loop
        // add each item to the sum value
        // outside the loop print the total sum

        //solnt 11:
        int n=10;
        int sum=0;
        int finalsum=0;
        int[] myArray = new int[n];
        for(int i=0; i<n; i++){
            myArray[i]=i;
            sum=sum+i;
        }
        System.out.println("Sum of " + String.join(",",(Arrays.toString(myArray))) + " equals to " + sum);
        for (final int i : myArray){
            finalsum+=i;
        }
        System.out.println("Final sum: "+ finalsum);
        */

        /*//Exercise 12
        //Create a loop that makes all words in an array uppercase, print the array
        //Start with the array: ["i", "sure", "do", "love", "bees"]. Create a for loop which makes each word uppercase in the array. Print the contents of the array in the terminal.
        //Hint: You could achieve this by either creating a second array which you add to, or by reassigning the values in the initial array.
        // create a for loop which goes through each string in our array
        // make each word uppercase
        // assign the value in the array to the uppercase string
        // print our resulting array

        //Solnt 12:
        String[] myArray = {"i", "sure", "do", "love", "bees"};
        for (int i=0; i<myArray.length; i++){
            myArray[i] = myArray[i].toUpperCase();
            System.out.println(myArray[i]);
        }*/

        /*//Exercise 13
        //Create a loop that capitalises each word in an array, prints the new array
        //
        //Start with the array: ["i", "sure", "do", "love", "bees"]. Create a for loop which makes each word uppercase in the array. Print the contents of the array in the terminal.
        //
        //Hint: You could make use of the .charAt() method to grab a specific character (letter) at the specified index Hint: You could make use of the .substring() method which works on strings to grab the part of a given string forward from the specified index

        // create a for loop which goes through each string in our array
        // grab the first letter of our word
        // capitalise the first letter
        // add the capitalised letter to the rest of the provided word
        // assign the value to an array
        // print our resulting array

        //Solnt:
        String[] word = {"i", "sure", "do", "love", "bees"};
        System.out.println("Camel Case word is:");
        for (int i=0; i<word.length; i++){
            String holder = word[i];
            word[i] = Character.toUpperCase(holder.charAt(0)) + holder.substring(1);
        }
        System.out.println(Arrays.toString(word));
        //or
        for (String holder: word){
            System.out.println(holder);
        }*/

        /*//Exercise 14
//        Write a program that reverses an array of Strings
//        String[] content = {"you", "are", "how", "hello"}
//        Tip. Use for loop and you to start at highest index.
//        Output should be: hello how are you?. Note question mark at the end
//
        //Solnt 14:
        String[] content =  {"you", "are", "how", "hello"};
        System.out.println("Content before reverse: \n" + Arrays.toString(content));
        System.out.println("Content after reverse:");
        String[] grab = new String[content.length];
        int j = content.length-1;
        for (int i=0; i<content.length; i++){
            grab[j] = content[i];
            j--;
        }
        System.out.println(String.join(" ", grab) + "?");
        */

        /*//Exercise 15:
        //Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01".
        //
        // Tip:
        // - String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        // - create variable to store result. double result = 0;
        // - convert string to array by using the String[] numbers = input.split(", ")
        // - then loop.
        // - convert each string to decimal and add to current result
        // - use Double.parseDouble(string) to convert a string to double
        //Solnt 15:
        String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        double result = 0.0;
        String[] numbers = input.split(", ");
        double num =0.0;
        for (String i : numbers){
            num = Double.parseDouble(i);
            result = result+num;
        }
        System.out.println("Total is: " +result);*/

        //public static void main(String[] args) {
        // Loop through the command-line arguments (args) and print each item
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
        // }
    }
}
