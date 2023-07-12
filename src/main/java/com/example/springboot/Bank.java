package com.example.springboot;

public interface Bank {
    abstract void customer();
    public abstract void withdraw();
    public static void deposit()
    {
        System.out.println("deposit");
    }
}
