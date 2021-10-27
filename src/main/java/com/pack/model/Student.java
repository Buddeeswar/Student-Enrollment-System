package com.pack.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="stud1234")
public class Student {
	@Id
	private Integer stid;
	@NotEmpty
	@Size(min=4,max=10)
	private String name;
	@NotNull(message="age cant be null")
	@Min(value=19)
	@Max(value=29)
	private Integer age;
	@NotEmpty(message="address cant be empty")
	private String address;
	@NotEmpty
	private String gender;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@NotNull
	private Date dob;
	@NotEmpty
	private String email;
	public Integer getStid() {
		return stid;
	}
	public void setStid(Integer stid) {
		this.stid = stid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public Student(Integer stid, String name, Integer age, String address, String gender, Date dob, String email) {
		super();
		this.stid = stid;
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
		this.dob = dob;
		this.email = email;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
