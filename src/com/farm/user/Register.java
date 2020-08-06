package com.farm.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="register")
public class Register {
	@Id
	@Column
	private String email;
	
	@Column
	private String fullname;
	
	@Column
	private String password;
	
	@Column
	private String phone;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Register [email=" + email + ", fullname=" + fullname + ", password=" + password + ", phone=" + phone
				+ "]";
	}
	
	
	
}
