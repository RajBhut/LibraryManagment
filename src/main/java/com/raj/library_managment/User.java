package com.raj.library_managment;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;



@Entity
public class User {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public int user_id ;

public String user_name;


public String password;
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public int getUser_id() {
	return user_id;
}

public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public User( String user_name, String password) {
	super();
	
	this.user_name = user_name;
	

	this.password = password;
}


	
}
