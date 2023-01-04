package com.tut;

import javax.persistence.Entity;
import javax.persistence.Id;

//(name = "student_details") use for replace main entity
//@Table(name = "student")use for renaming table
@Entity
public class Student {
	//use to make PK
	@Id
	private int id;
	private String name;
	private String city;
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getid() {
		return id;
	}
	public void getid(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.city+":"+this.name+":"+this.id+":";
	}
	
	
}
