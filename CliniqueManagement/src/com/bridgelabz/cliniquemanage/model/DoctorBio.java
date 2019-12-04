package com.bridgelabz.cliniquemanage.model;

import org.json.JSONArray;

public class DoctorBio {
	private String Name;
	private String Specialization;
	private int id;
	private JSONArray availabilityAM;
	private JSONArray availabilityPM;
	@Override
	public String toString() {
		return "DoctorBio [Name=" + Name + ", Specialization=" + Specialization + ", id=" + id + ", availabilityAM="
				+ availabilityAM + ", availabilityPM=" + availabilityPM + "]";
	}
	public JSONArray getAvailabilityAM() {
		return availabilityAM;
	}
	public void setAvailabilityAM(JSONArray availabilityAM) {
		this.availabilityAM = availabilityAM;
	}
	public JSONArray getAvailabilityPM() {
		return availabilityPM;
	}
	public void setAvailabilityPM(JSONArray availabilityPM) {
		this.availabilityPM = availabilityPM;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSpecialization() {
		return Specialization;
	}
	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	


}
