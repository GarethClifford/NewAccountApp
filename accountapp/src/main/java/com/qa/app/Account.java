package com.qa.app;

public class Account extends Person{

	
	public Account() {
		
	}
	
	public Account(String firstname, String lastname, String accountnumber) {
		super.firstName = firstname;
		super.lastName = lastname;
		super.accountNumber = accountnumber;
		
	}
	
	public String setFirstName(String name) {
		super.firstName = name;
		return "Name has been changed";
	}
	
	public String getFirstName() {
		return super.firstName;
	}
	public String getLastName() {
		return super.lastName;
	}

	public String getAccountNumber() {
		return super.accountNumber;
	}
	
	
}
