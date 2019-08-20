package com.example.bean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.validation.CourseCode;

public class student {
	@NotNull()
	@Size(min=1,message="is required")
	@CourseCode(value="COM",message="should start with \"COM\"")
	private String firstName;
	private String lastName;
	
	public student() {
		
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
	
	
}
