package controllers;

import classes.BankAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount acctA = new BankAccount();
		System.out.println("This is the first account" + acctA);
		acctA.setCheckingBal(200.00);
		acctA.setSavingsBal(1000.00);
		System.out.println("This is the first account" + acctA);
		acctA.depositMoney("Checking", 65.50);
		acctA.depositMoney("Savings", 500.55);
		System.out.println("This is the first account" + acctA);
		acctA.withdrawMoney("Checking", 10.25);
		acctA.withdrawMoney("Savings" , 100.72);
		acctA.display();
		BankAccount acctB = new BankAccount();
		System.out.println("This is the second account" + acctB);
		acctB.setCheckingBal(150.00);
		acctB.setSavingsBal(10000.00);
		System.out.println("This is the second account" + acctB);
		acctA.displayAll();
	}

}
