package com.example.springboot;

public class Sbi implements Bank,Atm{
    public void customer()
    {
        System.out.println("customer");
    }
    public void withdraw()
    {
        System.out.println("withdraw");
    }
    public void changepin()
    {
        System.out.println("chagepin");
    }
    public void checkbalance()
    {
        System.out.println("checkbalance");
    }
   public static void main(String args[])
   {
       Sbi obj = new Sbi();
       obj.customer();
       obj.changepin();
       obj.checkbalance();
       Bank.deposit();
   }
}
