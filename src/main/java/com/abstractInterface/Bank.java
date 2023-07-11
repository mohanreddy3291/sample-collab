package com.abstractInterface;

public interface Bank
{
    public void accountno();
    public static void loans()
    {
        System.out.println("loans in Bank...!");
    }
    default void customers()
    {
        System.out.println("customers in Bank...!");
    }

}

