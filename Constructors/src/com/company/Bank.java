package com.company;

public class Bank {
    int accountNumber;
    double balance;
    String customerName;
    String email;
    int phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void toDepositFunds(double depositFunds){
        balance+=depositFunds;
        System.out.println(balance);
    }
    public void toWithdrawalFunds(double withdrawalFunds){
        if (this.balance-withdrawalFunds>=0) {
            balance -= withdrawalFunds;
            System.out.println(balance);
        }else{
            System.out.println("Insufficient Funds");
        }
    }
}
