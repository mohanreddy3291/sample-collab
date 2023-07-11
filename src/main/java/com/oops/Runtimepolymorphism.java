package com.oops;

public class Runtimepolymorphism {
    public void substarction(int a, int b){
        System.out.println(a -b);
    }

    public static void maim(String args[]){
        Runtimepolymorphism run =new Runtimepolymorphism();
        run.substarction(50,100);
    }
}
