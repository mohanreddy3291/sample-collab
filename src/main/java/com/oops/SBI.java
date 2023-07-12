package com.oops;

public class SBI extends Bank
{
    @Override
    public void Customer() {
        System.out.println("Customer");

    }
    public void  Withdraw(){
    System.out.println("Withdraw");
    }
    public void deposit(){
System.out.println("deposit");
    }
    public static void main (String args[]){
        SBI S= new SBI();
        S.Customer();
        S.Withdraw();
        S.deposit();
        S.manager();
    }
}
