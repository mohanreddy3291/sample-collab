package com.oops;

public class Hdfc implements  newbank,Atm{

    public void Customer(){
        System.out.println("Customer");
    }
     public void deposit(){
    System.out.println("deposit");
    }
   public void Withdraw(){
    System.out.println("Withdraw");
    }
  public void pin(){
    System.out.println("pin");
}
  public void checkbalance(){
    System.out.println("checkbalance");
    }
public static void main(String[]args) {
    Hdfc H = new Hdfc();
    H.Customer();
    H.deposit();
    H.Withdraw();
    H.pin();
    H.checkbalance();
    newbank.check();
}


}