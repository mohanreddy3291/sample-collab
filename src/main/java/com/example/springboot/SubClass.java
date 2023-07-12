package com.example.springboot;

import org.hibernate.mapping.Subclass;

public class SubClass extends SuperClass {
    public void addition()
    {
        System.out.println("sub   addition");
    }
    public static void main(String args [])
    {
        SubClass obj = new SubClass();
        obj.addition();
        obj.addition();
        substraction();
        obj.addition(30,40);

        SuperClass obj1 = new SuperClass();
        obj1.addition();
    }
}
