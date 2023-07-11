package com.abstractInterface;

public class Sbi extends Money
{
    @Override
    public void accountno()
    {
        System.out.println("accountno in sbi...!");
    }
    @Override
    public void Nofwithdraws()
    {
        System.out.println("No. of withdraws in sbi...!");
    }
    @Override
    public void accbalance()
    {
        System.out.println("accbalance in sbi...!");
    }
    @Override
    public void money()
    {
        System.out.println("Money in sbi...!");
    }
    public void display()
    {
        accbalance();
        Nofwithdraws();
        customers();
        money();
        accountno();
        Bank.loans();
    }
    public static void main(String[] args)
    {
        System.out.println("main() method in Hdfc..!");
        Sbi S=new Sbi();
        S.display();
    }

}
