/*Author: Nanda kumar.s
 *purpose:program to maintain a clinique.  
 * date:30.11.19
 * filename:cliniquecontroller.java
 */
package com.bridgelabz.cliniquemanage.controller;

import java.io.FileNotFoundException; 
import java.io.IOException;
import org.json.JSONException;
import org.json.simple.parser.ParseException;

import com.bridgelabz.cliniquemanage.Utility.Utility;
import com.bridgelabz.cliniquemanage.serviceimp.CliniqueImpl;

public class CliniqueController {

	public static void main(String[] args) throws Exception 
	{
		CliniqueImpl clinique=new CliniqueImpl();
		int runner=1;
        while(runner==1){
        System.out.println("--------------------------Enter an option------------------");
		System.out.println("1.Get doctor appointment\n"
				+ "2.search Doctor\n"
				+ "3.search Patient\n"
				+ "4.print report\n"
				+ "5.manage doctor\n"
				+ "6.manage patient\n"
				+ "7.save & Exit");
		switch(Utility.GetInt())
		{
		case 1:
			System.out.println("Enter the doctor's name");
			String doctor=Utility.GetLine();
			System.out.println("Enter the patient name");
			String patient=Utility.GetLine();
			clinique.getAppointment(doctor,patient);
			break;
		
		case 2:
			System.out.println("--------------------------Enter the search option------------------");
			System.out.println("1.search by name or id or specialization  \n2.search by availability");
			switch(Utility.GetInt())
			{
			case 1:
				System.out.println("Enter the doctor data");
				String doctordata=Utility.GetLine();
				clinique.searchDoctor(doctordata);
				break;
				
			case 2:
				System.out.println("The free doctors are");
				clinique.searchDoctorAvailability();
				break;
			
			default:
				System.out.println("Wrong choice");
			}
			break;
			
		case 3:
			System.out.println("Enter patient data");
			String patientdata=Utility.GetLine();
			clinique.searchPatient(patientdata);
			break;
			
		case 4:
			clinique.printReport();
			runner=0;
			break;
			
		case 5:
			System.out.println("--------------------------Make a choice------------------");
			System.out.println("1.add doctor \n 2.remove doctor");
			switch(Utility.GetInt())
			{
			case 1:
				clinique.addDoctor();
				break;
			case 2:
				System.out.println("Enter the doctor name");
				String name=Utility.GetLine();
				clinique.removeDoctor(name);
				break;
			default:
				System.out.println("Wrong choice");
			}
			break;
		
		case 6:
			System.out.println("--------------------------Make a choice------------------");
			System.out.println("\t1.add patient \n\t2.remove patient");
			switch(Utility.GetInt())
			{
			case 1:
				clinique.addPatient();
				break;
			case 2:
				System.out.println("Enter the patient name");
				String name=Utility.GetLine();
				clinique.removePatient(name);
				break;
			default:
				System.out.println("Wrong choice");
			}
			break;
		case 7:
			clinique.save("doctor");
			clinique.save("patient");
			System.out.println("Thank you!!!!");
			System.exit(0);
		}

        }
	}

}
