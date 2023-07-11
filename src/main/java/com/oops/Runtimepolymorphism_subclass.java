package com.oops;

public class Runtimepolymorphism_subclass extends Runtimepolymorphism  {
    public void substarction(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String []args) {
        Runtimepolymorphism obj = new Runtimepolymorphism_subclass();
        obj.substarction(10,20);
    }
}
