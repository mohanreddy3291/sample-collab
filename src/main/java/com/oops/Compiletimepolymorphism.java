package com.oops;

public class Compiletimepolymorphism {

    public void addition(int a, int b) {
        System.out.println(a + b);
    }
    public void addition(int a, int b, int c){
        System.out.println(a+b+c);

    }
    public static void main(String args[]){
        Compiletimepolymorphism compile = new Compiletimepolymorphism();
        compile.addition(10,20);
        compile. addition (10,20,30);
    }
}
