package com.qa.app;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AccountService {
	
	private Map<String, Account> accountsMap = new HashMap<String, Account>();
	private ObjectMapper objmap = new ObjectMapper();
	public Account getAccount(String accountnumber) {
		return accountsMap.get(accountnumber);
	}
	
	public String addAccount(String firstname, String lastname, String accountnumber) {
		Account newAccount = new Account(firstname, lastname, accountnumber);
		
		accountsMap.put(accountnumber, newAccount);
		
		return "Account has been added";
	}
	
	public String javaToJSON() throws JsonProcessingException {
		System.out.println(objmap.writeValueAsString(accountsMap.values()));
		return "Done";
	}

	public int getSum(String firstname) {
		return (int) accountsMap.values().stream().filter(i->i.getFirstName().equals(firstname)).count();
	}
	
}
