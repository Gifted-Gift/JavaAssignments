package com.amigoscode;

import java.util.Objects;

//POJO
public class Cat{
    private String name;///property of the class
    private int age;
    private String color;

    public Cat(String name, int age, String color){
        this(name,age);//this looks for the constructor with the 2 param/properties and that sets the name and age
        this.color = color;
    }

    //let's create a constructor for this class
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Cat() {

    }

    //Lets say when aa new cat is born, we want the age to be passed automatically, if the user does not pass the age
    //so we create a third constructor
    public Cat(String name){
        this.name = name;
        this.age = 0;//we make the default value to be 0
    }


//    public Cat(){}//this is how the java default constructor is,
    //if we make it private, calling it in another class would throw error
//    private Cat(){}//bcus we have set the default constructor to private,
    //so we we dnt specify a constructor, java gives us one by default

    public void meow(){//meow method which is the behaviour
        System.out.println(name+ ": meow...");
    }

    //setter for name
    public void setName(String name) { //this is known as a setter method
        this.name = name;
    }

    //getter for name
    public String getName() {//this is the getter method for the property of ths class
        return this.name;
    }

   //getter for age
    public int getAge() {
        return age;
    }

    //setter for age
    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /*public String toString(){//Overriding the toString method
//        return "Hello";
        return "Name: " + name +
                " | Color: " + color +
                " | Age: " + age;
    }*/

    @Override //this keyword @Override, is just for readability
    //If it is removed it won't change anything,
    //it means the below method overrides the toSti=ring method from the parent class, and we are defining our own implementation
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }


    //ensure to let the ide generate the equals override method for you
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name) &&
                Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }
}
