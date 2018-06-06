package classes;

import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checkingBal;
	private double savingsBal;
	public static int numOfAccts = 0;
	public static double totalMoney = 0;
	
//	constructors
	public BankAccount() {
		this.accountNumber = generateNum();
		this.checkingBal = 0;
		this.savingsBal = 0;
		numOfAccts++;
	}
	
//	mutators
	public void setCheckingBal(double value) {
		this.checkingBal = value;
		BankAccount.totalMoney = BankAccount.totalMoney + value;
	}
	
	public void setSavingsBal(double value) {
		this.savingsBal = value;
		BankAccount.totalMoney = BankAccount.totalMoney + value;
	}
	
	
//	accesors
	public double getCheckingBal() {
		return this.checkingBal;
	}
	
	public double getSavingBal() {
		return this.savingsBal;
	}
	
	public String getAccountNum() {
		return this.accountNumber;
	}
	
//	methods
	
	public void depositMoney(String acct, double value) {
		if(acct == "Checking") {
			addToChecking(value);
		} else if(acct == "Savings") {
			addToSaving(value);
		} else {
			System.out.println("Hey goofball wrong type of account");
		}
	}
	
	private void addToChecking(double value) {
		this.checkingBal = this.checkingBal + value;
		BankAccount.totalMoney = BankAccount.totalMoney + value;
	}
	
	private void addToSaving(double value) {
		this.savingsBal = this.savingsBal + value;
		BankAccount.totalMoney = BankAccount.totalMoney + value;
	}
	
	public void withdrawMoney(String acct, double value) {
		if(acct == "Checking") {
			minusChecking(value);
		} else if(acct == "Savings") {
			minusSaving(value);
		} else {
			System.out.println("Hey goofball wrong type of account");
		}
	}
	
	private void minusChecking(double value) {
		if((this.checkingBal - value) < 0) {
			System.out.println("The checking account can not go negative");
		} else {
			this.checkingBal = this.checkingBal - value;
			BankAccount.totalMoney = BankAccount.totalMoney - value;
		}
	}
	
	private void minusSaving(double value) {
		if((this.savingsBal - value) < 0) {
			System.out.println("The saving account can not go negative");
		} else {
			this.savingsBal = this.savingsBal + value;
			BankAccount.totalMoney = BankAccount.totalMoney + value;
		}
	}
	
	private static String generateNum() {
		String temp = " ";
		Random r = new Random();
		for(int x = 0; x < 10; x++) {
			temp = temp + (r.nextInt(10));
		}
		return temp.trim();
	}
	
	public static void displayAll() {
		System.out.println("The total number of accounts is " + numOfAccts);
		System.out.println("The total money of the account is " + totalMoney);
	}
	
	public void display() {
		System.out.println("The checking balance is: " + this.checkingBal);
		System.out.println("The savings balance is: " + this.savingsBal);
	}
	
	@Override
    public String toString(){
        return "BankAccount{" + "AccountNumber= " + accountNumber + " Checking Balance: " + checkingBal + " Saving Balance: " + savingsBal +  "}";
    }

}
