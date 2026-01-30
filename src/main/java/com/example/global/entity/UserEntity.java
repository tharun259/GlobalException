package com.example.global.entity;

import java.util.Date;

import com.example.global.PasswordValidate;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
 
@Entity
@Table(name="usertable")
public class UserEntity {
	@Id
	@NotNull(message="user id field cannot be null")
	private String uid;
	@Column
	private String lname;
	@NotBlank(message="User name is made of only blank spaces")
	@NotNull(message ="user first name cannot be null")
	private String fname;
	@NotNull(message="DOB cannot be null")
	@Past(message="DOB cannot be a future")
	private Date dob;
	@Email(message="invalid email")
	private String email;
	@PasswordValidate
	private String password;
	@Positive
	private float salary;
	@Min(value=0,message="cannot be negative")
	@Max(value=0,message="cannot exceed 100")
	private int marks;
	@Pattern(regexp = "[0-9]{10}",message="Invalid phone number")
	private String phoneno;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
	
}
 