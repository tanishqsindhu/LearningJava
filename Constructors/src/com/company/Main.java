package com.company;

public class Main {

    public static void main(String[] args) {
	Bank bank = new Bank();
    bank.setBalance(1000);
    bank.toDepositFunds(1200);
    bank.toWithdrawalFunds(1100);
    }
}
