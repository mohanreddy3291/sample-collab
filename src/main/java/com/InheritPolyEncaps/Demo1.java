package com.InheritPolyEncaps;

public class Demo1
{
    //Inheritance
    public static int a=1;
    public int b=2;
    public void s1()
    {
        System.out.println("s1 method() in Demo1...!");
    }
    public static void s2()
    {
        System.out.println("s2 method() in Demo1...!");
    }
    //Method Overloading
    public void add(int c)
    {
        System.out.println("add() method-1 in Demo1...!");
        System.out.println(c);
    }
    public void add(int d, int e)
    {
        System.out.println("add() method-2 in Demo1...!");
        System.out.println(d+"   "+e);
    }
    //Encapsulation
    private int f;
    public int getF()
    {
        return f;
    }
    public void setF(int f)
    {
        this.f = f;
        System.out.println("Encapsulation in Demo1...!");
        System.out.println(f);
    }
}

