package Challeng13.Bank;

import java.sql.SQLOutput;

public class BankAccount {
    private final int accountNumber;
    private final String name;
    private double balance;

    public BankAccount(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 1000;
    }

    public void deposit(double money) {
        System.out.println("Balance before deposit: " + balance);
        if(balance <= 0) {
            System.out.println("balance not accurate");
        } else if (money <= 0) {
            System.out.println("Not allowed");
        } else {
            balance += money;
        }
        System.out.println("Balance: " + balance);
    }

    public void withdraw(double money) {
        if(balance == 0) {
            System.out.println("You cannot withdraw balance nil");
        } else if (money == 0) {
            System.out.println("You did not withdraw any money");
        } else {
            balance -= money;
        }
    }
}
