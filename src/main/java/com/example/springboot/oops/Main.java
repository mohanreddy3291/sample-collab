package com.example.springboot.oops;

public class Main extends calculation {

    @Override
    public int Strings(String a, String b){
        int x = a.length()+b.length();
        return x;
    }

    public static int average(int a, int b, int c){
        int x = a+b+c/3;
        return x;
    }
    public static void main(String[] args) {
        Main main = new Main();
        int lengthOfStrings = main.Strings("gerald","robert");
        System.out.println("Length of two Strings: "+lengthOfStrings);
        int[] arr ={3,7,5,1,9,4};
        int avg = average(arr);
        System.out.println("calculation class avg method: "+avg);
        int average = average(34,55,97);
        System.out.println("Main class avg method: "+average);
    }
}