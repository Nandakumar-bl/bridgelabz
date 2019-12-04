package com.bridgelabz.cliniquemanage.model;

public class PatientBio {
	private String name;
	private int id;
	private int age;
	private long mobilenumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "PatientBio [name=" + name + ", id=" + id + ", mobilenumber=" + mobilenumber + ", age=" + age + "]";
	}
	

}
