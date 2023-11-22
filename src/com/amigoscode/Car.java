package com.amigoscode;

import java.math.BigDecimal;


public class Car {

    private String regNumber;
    private BigDecimal price;

    //No arg constructor
    public Car(){

    }
}


//Java beans is a class that has to obey 3 contrains so that other frames can do certain things with it
//For Java bean:
//A class must have no arg constructor e.g public Car(){}
//All fields must be private, (e.g private String regNumber; private BigDecimal price;) and the way you can access the private fields is through getters and setters
//The class should implement Serializable, Serializable means the class can be stored to streams, e.g a disc, file, databases etc
//The beans class is dependent on a framework
