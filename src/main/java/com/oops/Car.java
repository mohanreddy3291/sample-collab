package com.oops;

public class Car extends Vehicle {

    public void dieseltank(){
        System.out.println("diesel");
    }
    public static void main (String[]args)
    {
        Car c = new Car();
        c.dieseltank();
        c.engine();
        c. wheels();
    }


}

