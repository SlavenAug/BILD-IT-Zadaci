/*
 * (The Account class) Design a class named Account that contains:
 * - A private int data field named id for the account (default 0).
 * - A private double data field named balance for the account (default 0).
 * - A private double data field named annualInterestRate that stores the current
 * interest rate (default 0). Assume all accounts have the same interest rate.
 * - A private Date data field named dateCreated that stores the date when the
 * account was created.
 * - A no-arg constructor that creates a default account.
 * - A constructor that creates an account with the specified id and initial balance.
 * - The accessor and mutator methods for id, balance, and annualInterestRate.
 * - The accessor method for dateCreated.
 * - A method named getMonthlyInterestRate() that returns the monthly
 * interest rate.
 * - A method named getMonthlyInterest() that returns the monthly interest.
 * - A method named withdraw that withdraws a specified amount from the
 * account.
 * - A method named deposit that deposits a specified amount to the account.
 */
package zadaci_04_02_2016;

import java.sql.Date;

public class Zad4_AccountClass {

	public static void main(String[] args) {
		Account acc = new Account(1122, 20000);
		acc.setAnnualInterestRate(4.5);
		acc.withdraw(2500);
		System.out.println(acc);
		System.out.println("Monthly interest,:  " + acc.getMonthlyInterestRate());
	}

}

class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	Date dateCreated;

	public Account() {
		dateCreated = new Date(id);
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		dateCreated = new Date(id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate / 100.0;
	}

	public Date getDate() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12.0;
	}

	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}

	// Metoda za podizanje novca.
	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("You cannot withdraw that amount of money! Your balance is: " + balance);
		} else {
			balance -= amount;
		}
	}

	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public String toString() {
		return "ID:\t\t" + id + "\nbalance:\t" + balance + "\nDate created:\t" + dateCreated + "mon";
	}

}
