package com.amigoscode;

import java.util.Arrays;

public class ClaasesAndMethodsMain {
    public static void main(String[] args){

        //CLASSES
        //calling the cat class
/*//        Cat rose = new Cat();//Cat cat = new Cat(); won't work bcus the Cat class is not stated to be static, so we make it static, since the Cat class is inside a class called Main
//        Cat rose = new Cat();//this is calling the setter method, when we haven't created the constructor
//        rose.setName("Rose");//So using the setter method, we have to create the instance first then assign the value here,
        //but when constructor have been created we create the instance and assign the value in one line
        Cat rose = new Cat("Rose", 2);//Constructors allows you to pass the values at the point of initialization of your object
        //If you dont specify a constructor, then java gives you a default constructor,
        //that you can use, like u used when calling the setter and getter class
//        Cat rose = new Cat();
        rose.meow();
        System.out.println(rose.getName());
        System.out.println(rose.getAge());

        System.out.println();

        //same for the star instance,
        Cat star = new Cat();//for this star object to work, we have to create the constructor we zero aegument
        star.setName("Star");
        star.meow();
        System.out.println(star.getName());

        Cat jupitar = new Cat("Jupitar");//for this star object to work, we have to create the constructor we zero aegument
        System.out.println(jupitar.getName());
        System.out.println(jupitar.getAge());
        System.out.println();

        //Let's say we want to print the string representation for one object
        Cat rosse = new Cat("Rosse", 2, "Blue");
        System.out.println(rosse.getName());
        System.out.println(rosse.getAge());
        System.out.println(rosse.getColor());
        System.out.println(rosse + "\n");//If we want to print the Stirng rep,
        //we need to override a method called toString, we do this in our class Cat

        //lets say we want to print the 3 objects Rossy, Stary, and Jupitary
        Cat rossy = new Cat("Rossy", 2, "Blue");
        System.out.println(rossy);


        Cat stary = new Cat();
        System.out.println(stary);

        Cat jupitary = new Cat("Juitary");
        System.out.println(jupitary);*/

        Cat rose1 = new Cat("Rose", 2, "Blue");
        System.out.println(rose1);

        Cat rose2 = new Cat("Rose", 2, "Blue");
        System.out.println(rose2);

        System.out.println(rose1==rose2);//this compares the address, so it would return false bcus they are point to 2 diff refs
        //but if we say rose2 = rose1, then the will pointing to the exact same ref
//        rose2 = rose1;
//        System.out.println(rose1==rose2);//this will noe return true bcus of the rose2=rose1; above
//        System.out.println(rose1.equals(rose2));//this returns false bcus the default/inherited .equals for the cat class which we haven't overwritten is using ==, i.e
        //public boolean equals(Object obj) {return (this == obj);}, this is what I copied from the obj class to see it
        System.out.println(rose1.equals(rose2));// now I have created the constructor for .equals, ny letting intellij generate for me free y type equals and select

/*
        String[] names = {"Foo", "Bar"};
//        System.out.println(names);// this brings [Ljava.lang.String;@7ef20235
        //to get the string rep, we rep it in string
        System.out.println(Arrays.toString(names));//this is same thing we are doing to our object call of the Cat class
*/

        Cat[] cats = {rose1, rose2};

//        Person alex = new Person(
//                "Alex",
//                "Montana",
//                Gender.MALE
//        );

        Person alex = new Person(
                "Alex",
                "Montana",
                Gender.MALE,
                cats
        );
        System.out.println(alex);


    }
}
