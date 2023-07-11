package com.example.springboot.oops;

public class child extends parent{
    public static void main(String[] args) {
        child A = new child();
        A.setName("Emma");
        A.setAge(21);
        System.out.println("Name: "+A.getName());
        System.out.println("Age: "+A.getAge());
    }
}
