package com.java.oopsconcepts;

public interface PersonalInfo {
    public abstract void name();
    public abstract void number();
    public static void account(){
        System.out.println("Account holder");
    }
    default void say(){
        System.out.println("Default method to use in any class");

    }
}
