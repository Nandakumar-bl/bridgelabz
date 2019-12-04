/*Author: Nanda kumar.s
 *purpose:program to maintain address book.  
 * date:30.11.19
 * filename:AddressBookController.java
 */
package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.Utility.Utility;
import com.bridgelabz.addressbook.serviceImpl.AddressBookImp;

public class AddressBookController {

	public static void main(String[] args) throws Exception
	{
		AddressBookImp addressbook=new AddressBookImp();
		int runner=1;
		while(runner==1){
			System.out.println("-----------------------ADDRESS BOOK--------------------------------");
			System.out.println(  "\t1.Create new address book\n"
					           + "\t2.open Exsisting address book\n"
					           + "\t3.Exit");
			switch(Utility.GetInt())
			{
			case 1:
				System.out.println("Enter the new Address book name");
				String file=Utility.GetLine();
				addressbook.CreateAddressbook(file);  
				System.out.println("Address book created");
				break;
				
			case 2:
				System.out.println("Enter the exsisting address book name");
				String filename=Utility.GetLine();
				addressbook.ExsistingAddressbook(filename);
				int run=0;
					while(run==0)
					{
					System.out.println("------------------Enter an option-----------------------");
					System.out.println("1.add person\n"
							          +"2.remove person\n"
							          + "3.check details\n"
							          + "4.manage details\n"
							          + "5.save\n"
							          + "6.exit");
					switch(Utility.GetInt())
					{
					case 1:
						addressbook.add();
						System.out.println("successfully added");
						break;
					
					case 2:
						System.out.println("Enter the person name to remove the details from address book");
						String name=Utility.GetLine();
						addressbook.remove(name);
						System.out.println("successfully removed");
						break;
					case 3:
						System.out.println("Enter a person name to check his details");
						String checkdetais=Utility.GetLine();
						addressbook.GetDetails(checkdetais);
						break;
					case 4:
						System.out.println("Enter the person name to change details");
						String change=Utility.GetLine();
						if(addressbook.check(change))
						{
						System.out.println("-------------------select one------------------------");
						System.out.println("1.change firstname\n2.change lastname\n3.change city\n4.change address\n"
								+ "5.change state\n6.change zip\n7.change phonenumber");
						switch(Utility.GetInt())
						{
						case 1:
							System.out.println("Enter new firstname");
							String firstname=Utility.GetLine();
							addressbook.changingvalue(change,"firstname",firstname);
							break;
						case 2:
							System.out.println("Enter new lastname");
							String lastname=Utility.GetLine();
							addressbook.changingvalue(change,"lastname",lastname);
							break;
						case 3:
							System.out.println("Enter new city");
							String city=Utility.GetLine();
							addressbook.changingvalue(change,"city",city);
							break;
						case 4:
							System.out.println("Enter new address");
							String address=Utility.GetLine();
							addressbook.changingvalue(change,"address",address);
							break;
						case 5:
							System.out.println("Enter new state");
							String state=Utility.GetLine();
							addressbook.changingvalue(change,"state",state);
							break;
						case 6:
							System.out.println("Enter new zip");
							long zip=Utility.Getlong();
							addressbook.changingvalue(change,"zip",zip);
							break;
						case 7:
							System.out.println("Enter new phone number");
							long phone=Utility.Getlong();
							addressbook.changingvalue(change,"phonenumber",phone);
							break;
						default:
							System.out.println("wrong choice");
						}
						}
						break;
					case 5:
						addressbook.save();
						break;
					case 6:
						System.out.println("Bye...........");
						run=1;
						runner=0;;
						break;
					}
					}
					break;
			case 3:
				System.out.println("ThankYou!!!!!");
				System.exit(0);
				break;
			default:
				System.out.println("Wrong choice!!!!!");
             }
		}
		
     }
}
