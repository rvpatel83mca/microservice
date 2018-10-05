package com.example.demo.to;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_tbl")
public class User {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)	
private Integer userID;

public Integer getUserID() {
	return userID;
}
public void setUserID(Integer userID) {
	this.userID = userID;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
private String firstName;
private String lastName;
}
