package com.bridgelabz.addressbook.model;

public class Details {
	
	private String firstname;
	private String lastname;
	private String address;
	private String city;
	private String state;
	private long zip;
	private long phonenumber;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "Details [firstname=" + firstname + "\n lastname=" + lastname + "\n address=" + address + "\n city=" + city
				+ "\n state=" + state + "\n zip=" + zip + "\n phonenumber=" + phonenumber + "]";
	}
}
