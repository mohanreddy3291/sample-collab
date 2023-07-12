package com.example.springboot;

public class Laptop extends Computer {
        public void battery()
        {
            System.out.println("battery");
        }
        public void cpu()
        {
            System.out.println("cpu");
        }
        public void memory()
        {
            System.out.println("memory");
        }

        public static void main(String args[])
        {
            Laptop obj = new Laptop();
            obj.battery();
            obj.cpu();
            obj.memory();
            obj.keyboard();
            monitor();

        }
    }



