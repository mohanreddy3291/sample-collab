package com.oops;

public class Encapsulation {

    private int bankbalance;
    public int getBankbalance() {
        return bankbalance;
    }

    public void setBankbalance(int bankbalance) {
        this.bankbalance = bankbalance;
    }



    public void checkbalance(){
        System.out.println(bankbalance);
    }
}
