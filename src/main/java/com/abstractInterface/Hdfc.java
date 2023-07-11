package com.abstractInterface;

public class Hdfc extends Money {
    @Override
    public void accountno() {
        System.out.println("accountno in Hdfc...!");
    }

    @Override
    public void Nofwithdraws() {
        System.out.println("No. of withdraws in Hdfc...!");
    }

    @Override
    public void accbalance() {
        System.out.println("accbalance in Hdfc...!");
    }

    @Override
    public void money() {
        System.out.println("Money in Hdfc...!");
    }

    public static void main(String[] args) {
        System.out.println("main() method in Hdfc..!");
        Hdfc H = new Hdfc();
        H.accbalance();
        H.Nofwithdraws();
        H.customers();
        H.money();
        H.accountno();
        Bank.loans();
    }
}
