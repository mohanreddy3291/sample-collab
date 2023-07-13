package com.java.oopsconcepts;

public class Test2 extends Test1{


    public static void main(String args[]){

        Test1 t1 = new Test1();
        t1.display();
        // Inheritance
        System.out.println(Test1.sname);
        System.out.println(t1.sno);
        Test1.say();
        t1.display(15);
        t1.display(22, "java");
        //Polymorphism
        //Method Overloading
        System.out.println("Method Overloading");
        t1.display(25);
        t1.display(20,"Pooja");
        int xvalue = Integer.parseInt(args[0]);
        float a = Float.parseFloat(args[1]);
        String b = args[2];
        //Method Overriding
        System.out.println("Method Overriding");
        t1.display(xvalue);
        t1.display(a,b);

    }


}
