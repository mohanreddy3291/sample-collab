package com.example.springboot;

public abstract class Computer {
        abstract void cpu();
        abstract void memory();
        public void  keyboard()
        {
            System.out.println("keyboard");
        }
        public static void monitor()
        {
            System.out.println("monitor");
        }



    }

