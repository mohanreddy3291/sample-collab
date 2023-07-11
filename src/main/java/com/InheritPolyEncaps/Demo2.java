package com.InheritPolyEncaps;

public class Demo2 extends Demo1
{
    //Method Over-riding
    public void add(int c)
    {
        System.out.println("addition() method in Demo2...!");
        System.out.println(c);
    }
    public void display()
    {
        System.out.println("display() method in Demo2...!");
        //Inheritance
        System.out.println(a+"   "+b);
        s1();
        s2();
        //Method Overloading
        Demo1 dem1=new Demo1();
        dem1.add(3);
        dem1.add(4,5);
        //Method Over-riding
        Demo1 dem11=new Demo2();
        dem11.add(6);
        //Encapsulation
        Demo1 dem111=new Demo1();
        dem111.setF(7);
    }
    public static void main(String[] args)
    {
        System.out.println("main() method in Demo2...!");
        Demo2 dem2=new Demo2();
        dem2.display();
    }
}


