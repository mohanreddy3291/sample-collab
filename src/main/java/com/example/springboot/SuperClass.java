package com.example.springboot;

public class SuperClass {

        public void addition()
        {
            System.out.println("addition");
        }
        public void addition(int a,int b)
        {
            System.out.println(a+b);
        }
        public static void substraction()
        {
          System.out.println("substraction");
        }
        public static void main(String args[])
        {
            SuperClass obj = new SuperClass();
            obj.addition();
            obj.addition(10,20);
            substraction();
        }
    }

