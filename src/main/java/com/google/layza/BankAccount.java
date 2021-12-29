package com.google.layza;

public class BankAccount {
    // instance variables
    double balance = 0.0;
    String owner = "NoName";

    //Default constructor for a bank account with zero balance
    public BankAccount() {}

    // Construct a balance account with a given initial balance and owner’s name
    public BankAccount(double initialBalance, String name)
    {
        balance = initialBalance;
        owner = name;
    }

    //Method for depositing money to the bank account
    public void deposit(double dAmount)
    {
        balance = balance + dAmount;
    }

    //Method for withdrawing money from the bank account
    public void withdraw(double balance)
    {
        this.balance = this.balance - balance;
    }

    //Main method for check the bank accounts
    public static void main(String[] args) {
        BankAccount testAccount = new BankAccount();
        testAccount.deposit(100);
        System.out.println(testAccount.owner + "balance after deposit: " + testAccount.balance);
        testAccount.withdraw(50);
        System.out.println(testAccount.owner + "'s account balance after withdraw "
                + testAccount.balance);

        BankAccount myAccount = new BankAccount(500, "Liza");
        myAccount.deposit(100);
        System.out.println(myAccount.owner + "balance after deposit: " + testAccount.balance);
        myAccount.withdraw(200);
        System.out.println(myAccount.owner + "'s account balance after withdraw "
                + myAccount.balance);
    }
}
