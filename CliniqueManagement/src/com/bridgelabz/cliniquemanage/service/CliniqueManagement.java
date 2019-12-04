package com.bridgelabz.cliniquemanage.service;

public interface CliniqueManagement 
{
	public void getAppointment(String doctor,String patient) throws Exception;
	public void searchDoctor(String docdata) throws Exception;
	public void searchPatient(String patientdata) throws Exception;
	public void printReport() throws Exception;
	public void save(String added) throws Exception;
	
}
