package com.qa.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class Person {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	@Column(length = 50)
	String firstName;
	@Column(length = 50)
	String lastName;
	@Column(length = 6)
	String accountNumber;
}
