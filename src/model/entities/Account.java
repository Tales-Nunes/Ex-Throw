package model.entities;

import model.exceptions.DomainException;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;
    public Account(){}
    public Account(int number, String holder, double balance, double withdrawLimit){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this. withdrawLimit = withdrawLimit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }


    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
    public void withdraw(double amount) throws DomainException{
        if(getBalance() <= 0) {
            throw new DomainException("Not enough balance");
        }
        if(amount > getWithdrawLimit()){
            throw new DomainException("The amount exceeds withdraw limit");
        }
        this.balance -= amount;
    }
}
