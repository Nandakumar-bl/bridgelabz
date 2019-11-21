/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to get and set the userdetails for the regex Function program
 * FileName -  UserDetails.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.algorithm;
public class UserDetails{
	private String fName;
	private String lName;
	private String mobileNo;
	private String date;

	public UserDetails(){
	}

	public void setfName(String fName){
		this.fName=fName;
	}

	public void setlName(String lName){
		this.lName=lName;
	}

	public void setmobileNo(String mobileNo){
		this.mobileNo=mobileNo;
	}

	public void setdate(String date){
		this.date=date;
	}

	public String getfName(){
		return fName;
	}

	public String getlName(){
		return lName;
	}

	public String mobileNo(){
		return mobileNo;
	}

	public String date(){
		return date;
	}
}
