package com.qa.app;

import java.util.HashMap;
import java.util.Map;

public class AccountService {
	
	private Map<String, Account> accounts = new HashMap<String, Account>();
	
	public Account getAccount(String accountnumber) {
		return accounts.get(accountnumber);
	}
	
	public String addAccount(String firstname, String lastname, String accountnumber) {
		Account newAccount = new Account(firstname, lastname, accountnumber);
		
		accounts.put(accountnumber, newAccount);
		
		return "Account has been added";
	}

}
