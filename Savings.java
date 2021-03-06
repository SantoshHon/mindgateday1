package com.mindgate.pojo;

public class Savings extends Account {
	private boolean isSalary;

	public Savings() {
		System.out.println("Default constructor of Savings");
	}

	public Savings(int accountNumber, String name, double balance, boolean isSalary) {
		super(accountNumber, name, balance);
		this.isSalary = isSalary;
		System.out.println("Overloaded Constructor of Savings");
	}

	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}



}
