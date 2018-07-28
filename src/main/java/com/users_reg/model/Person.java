package com.users_reg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author pankaj
 *
 */
@Entity
@Table(name="PERSON")
public class Person {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String fname;
	private String lname;
	private String phone;
	private String password;
	private String email;
	private String token;
	private String provider;

	


	
	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getFname() {
		return fname;
	}





	public void setFname(String fname) {
		this.fname = fname;
	}





	public String getLname() {
		return lname;
	}





	public void setLname(String lname) {
		this.lname = lname;
	}





	public String getPhone() {
		return phone;
	}





	public void setPhone(String phone) {
		this.phone = phone;
	}





	public String getPassword() {
		return password;
	}





	public void setPassword(String password) {
		this.password = password;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public String getToken() {
		return token;
	}





	public void setToken(String token) {
		this.token = token;
	}





	public String getProvider() {
		return provider;
	}





	public void setProvider(String provider) {
		this.provider = provider;
	}





	@Override
	public String toString() {
		return "Person [id=" + id + ", fname=" + fname + ", lname=" + lname + ", phone=" + phone + ", password="
				+ password + ", email=" + email + ", token=" + token + ", provider=" + provider + "]";
	}





	
}
