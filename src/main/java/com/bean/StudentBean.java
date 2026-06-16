package com.bean;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class StudentBean {

	@NotBlank(message = "First Name is required")
	@Pattern(regexp = "[a-zA-Z]+",message = "First Name is invalid")
	private String firstName;

	@NotBlank(message="Email is required")
	private String email;
	
	@NotNull(message="Roll Number is required")
	private Integer rollNum;

	@NotBlank(message="Password is required")
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getRollNum() {
		return rollNum;
	}

	public void setRollNum(Integer rollNum) {
		this.rollNum = rollNum;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
