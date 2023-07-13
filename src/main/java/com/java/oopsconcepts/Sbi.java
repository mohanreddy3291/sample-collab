package com.java.oopsconcepts;

public class Sbi extends Bank {

    @Override
    public void name() {
      String pname = "Pooja";
      System.out.println(pname);
    }

    @Override
    public void number() {
        long pno = 1234567;
        System.out.println(pno);


    }

    @Override
    public void transactions() {

    }

    @Override
    public void loans() {

    }

    public static void main(String[] args) {
        Sbi sb = new Sbi();
        PersonalInfo.account();
        sb.name();
        sb.number();
        sb.say();
    }
}
