package com.example.springboot.oops;

public abstract class calculation {
    public static int average(int[] x){
        int sum =0;
        int avg =0;
        for(int i=0; i<x.length; i++){
            sum+=x[i];
            avg = sum/x.length;
        }
        return avg;
    }

    public abstract int Strings(String a, String b);
}
