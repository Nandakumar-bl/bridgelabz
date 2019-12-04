/*Author: Nanda kumar.s
 *purpose:implementation program for clinique management.  
 * date:30.11.19
 * filename:CliniqueImpl.java
 */
package com.bridgelabz.cliniquemanage.serviceimp;

import java.io.FileNotFoundException; 
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.cliniquemanage.Utility.Utility;
import com.bridgelabz.cliniquemanage.model.DoctorBio;
import com.bridgelabz.cliniquemanage.model.PatientBio;
import com.bridgelabz.cliniquemanage.service.CliniqueManagement;

public class CliniqueImpl implements CliniqueManagement
{
	JSONParser parser=new JSONParser();
	String cliniquespecial="";
	JSONArray doctors;
	JSONArray patients;
	String populardoctor;
	String popularspecialization;
	DoctorBio Doc=new DoctorBio();
	PatientBio patientbio=new PatientBio();
	public CliniqueImpl() throws JSONException, FileNotFoundException, IOException, ParseException 
	{
		String doctor=parser.parse(new FileReader("doctors.json")).toString();
		doctors=new JSONArray(doctor);
		String patient=parser.parse(new FileReader("patients.json")).toString();
		patients=new JSONArray(patient);
	}
	
	public void getAppointment(String doctor,String patient) throws Exception
	{
		JSONObject object=new JSONObject();
		if(checkDoctor(doctor) && checkPatient(patient))
		{
			for(int i=0;i<doctors.length();i++)
			{
				object=doctors.getJSONObject(i);
				if(object.get("name").equals(doctor))
				{
					if(Doc.getAvailabilityAM().length()<5)
					{
						Doc.setAvailabilityAM(Doc.getAvailabilityAM().put(patientbio.getName()));
						object.put("availabilityAM",Doc.getAvailabilityAM());
						System.out.println("you got an appointment in morning with "+Doc.getName());
					}
					else if(Doc.getAvailabilityPM().length()<5)
					{
						Doc.setAvailabilityAM(Doc.getAvailabilityAM().put(patientbio.getName()));
						object.put("availabilityPM",Doc.getAvailabilityPM());
						System.out.println("you got an appointment in morning with "+Doc.getName());
					}
					else
						System.out.println("Doctor is busy try another doctor");
				}
				
			}
		}
	}
	
	public void searchPatient(String patientdata) throws Exception
	{
		int count=0;
		JSONObject object=new JSONObject();
		for(int i=0;i<patients.length();i++)
		{
			object=patients.getJSONObject(i);
			if(object.getString("name").equals(patientdata) || object.getString("mobilenumber").equals(patientdata) || 
					 object.getString("id").equals(patientdata) || object.getString("age").equals(patientdata))
				{
				setPatient(object);
				System.out.println(patientbio);
				count++;
				}
	  }
		if(count==0)
			System.out.println("No doctor available for this data");
	}
	public void searchDoctor(String docdata) throws Exception
	{
		int count=0;
		JSONObject object=new JSONObject();
		for(int i=0;i<doctors.length();i++)
		{
			object=doctors.getJSONObject(i);
			if(object.get("name").equals(docdata) || object.getString("id").equals(docdata) || 
					                      object.get("specialization").equals(docdata))
				{
				setDoctor(object);
				System.out.println(Doc);
				count++;
				}
	  }
		if(count==0)
			System.out.println("No doctor available for this data");
	}
	public void searchDoctorAvailability() throws Exception
	{
		int count=0;
		JSONObject object=new JSONObject();
		for(int i=0;i<doctors.length();i++)
		{
			object=doctors.getJSONObject(i);
			if(object.getJSONArray("availabilityAM").length()<5 || object.getJSONArray("availabilityPM").length()<5)
			{
				count++;
				System.out.println(object);
			}
		}
		if(count==0)
			System.out.println("No doctors available");
		
	}
	
	public boolean checkDoctor(String doctor) throws Exception
	{
		JSONObject object=new JSONObject();
		for(int i=0;i<doctors.length();i++)
		{
			object=doctors.getJSONObject(i);
			if(object.get("name").equals(doctor))
			{
				setDoctor(object);
				return true;
			}
		}
		System.out.println("No doctor in that name");
		return false;
	}
	public void setPatient(JSONObject object) throws JSONException
	{
		patientbio.setName(object.get("name").toString());
		patientbio.setId(object.getInt("id"));
		patientbio.setMobilenumber(object.getLong("mobilenumber"));
		patientbio.setAge(object.getInt("age"));
	}
	public void setDoctor(JSONObject object) throws Exception
	{
		Doc.setName(object.get("name").toString());
		Doc.setId(object.getInt("id"));
		Doc.setSpecialization(object.get("specialization").toString());
		Doc.setAvailabilityAM(object.getJSONArray("availabilityAM"));
		Doc.setAvailabilityPM(object.getJSONArray("availabilityPM"));
	}
	public boolean checkPatient(String patient) throws JSONException
	{
		JSONObject object=new JSONObject();
		for(int i=0;i<patients.length();i++)
		{
			object=patients.getJSONObject(i);
			if(object.get("name").equals(patient))
			{
				setPatient(object);
				return true;
			}
		}
		System.out.println("No patient available in this name");
		return false;
	}
	
	public void addDoctor() throws Exception
	{
		JSONObject json=new JSONObject();
		System.out.println("Enter the doctor name");
		json.put("name",Utility.GetLine());
		System.out.println("enter the dcotor id");
		json.put("id",Utility.GetInt());
		System.out.println("Enter the doctor speciality");
		json.put("specialization",Utility.GetLine());
		json.put("availabilityAM",new JSONArray());
		json.put("availabilityPM",new JSONArray());
		doctors.put(json);
		save("doctor");
	}
	
	public void removeDoctor(String doctor) throws Exception
	{
		JSONObject object=new JSONObject();
		for(int i=0;i<doctors.length();i++)
		{
			object=doctors.getJSONObject(i);
			if(object.get("Name").equals(doctor))
			{
			  doctors.remove(i);
			}
		}
		save("doctor");
	}
	public void removePatient(String Patient) throws Exception
	{
		JSONObject object=new JSONObject();
		for(int i=0;i<patients.length();i++)
		{
			object=patients.getJSONObject(i);
			if(object.get("name").equals(Patient))
			{
			  patients.remove(i);
			}
		}
		save("patient");
	}
	
	public void addPatient() throws Exception
	{
		JSONObject json=new JSONObject();
		System.out.println("Enter the Patient name");
		json.put("name",Utility.GetLine());
		System.out.println("enter the patient id");
		json.put("id",Utility.GetInt());
		System.out.println("Enter the age");
		json.put("age",Utility.GetInt());
		System.out.println("Enter the mobileNumber");
		json.put("mobilenumber",Utility.Getlong());
		patients.put(json);
		save("patient");
	}
	
	public void printReport() throws Exception
	{
	
		JSONObject popular=doctors.getJSONObject((int)Math.random()*doctors.length());
		populardoctor=popular.getString("name");
		JSONObject popularSpec=doctors.getJSONObject((int)Math.random()*doctors.length());
		popularspecialization=popularSpec.getString("specialization");
		System.out.println("Popular doctor:"+populardoctor+"\n popularspecialization:"+popularspecialization);
		JSONObject object=new JSONObject();
		System.out.println("----------------DOCTORS in clinique------------------");
		for(int i=0;i<doctors.length();i++)
		{
			object=doctors.getJSONObject(i);
			System.out.println(object);
		}
		System.out.println("-----------------------------------------------------\n");
		System.out.println("-----------------PATIENTS in clinique----------------");
		for(int i=0;i<patients.length();i++)
		{
			object=patients.getJSONObject(i);
			System.out.println(object);
		}
		
	}
	
	public void save(String added) throws Exception
	{
		if(added.equals("patient"))
		{
			FileWriter tofile=new FileWriter("patients.json");
		    tofile.write(patients.toString());
			tofile.flush();
			tofile.close(); 
		}
		else
		{
			FileWriter tofile=new FileWriter("doctors.json");
			tofile.write(doctors.toString());
			tofile.flush();
			tofile.close();
		}
		
	}
}
