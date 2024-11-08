package com.files;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        Map<String, Adding> addressBooks = new HashMap<>();
	        
	        while(true) {
	        	 System.out.println("Select your operation:");
	             System.out.println("Press 1 to create a new address book");
	             System.out.println("Press 2 to select an address book");
	             System.out.println("Press 3 to exit");
                    

	             int choice = sc.nextInt();
	             sc.nextLine(); 

	             switch (choice) {
	                 case 1:
	                     System.out.println("Enter a name for the new address book:");
	                     String bookName = sc.nextLine();
	                     if (addressBooks.containsKey(bookName)) {
	                         System.out.println("Address book with this name already exists.");
	                     } else {
	                         addressBooks.put(bookName, new Adding());
	                         System.out.println("Address book '" + bookName + "' created successfully.");
	                     }
	                     break;
	                    
	                 case 2:
	                     System.out.println("Enter the name of the address book you want to access:");
	                     String selectedBook = sc.nextLine();
	                     Adding selectedAddressBook = addressBooks.get(selectedBook);
	                     
	                     if (selectedAddressBook == null) {
	                         System.out.println("Address book not found.");
	                         break;
	                     } 
	                     
	                     while (true) {
	                         System.out.println("Select your operation:");
	                         System.out.println("Press 1 to add new contact");
	                         System.out.println("Press 2 to edit contact");
	                         System.out.println("Press 3 to delete contact");
	                         System.out.println("Press 4 to view contacts");
	                         System.out.println("Press 5 to go back");

	                         int operation = sc.nextInt();
	                         sc.nextLine(); 
	                         switch (operation) {
	                            case 1:
	                                System.out.println("Enter details for a new contact:");
	                                System.out.println("Enter first name:");
	                                String firstName = sc.nextLine();

	                                System.out.println("Enter last name:");
	                                String lastName = sc.nextLine();

	                                System.out.println("Enter address:");
	                                String address = sc.nextLine();

	                                System.out.println("Enter city:");
	                                String city = sc.nextLine();

	                                System.out.println("Enter state:");
	                                String state = sc.nextLine();

	                                System.out.println("Enter zip code:");
	                                int zip = sc.nextInt();
	                                sc.nextLine(); 

	                                System.out.println("Enter phone number:");
	                                long phoneNumber = sc.nextLong();
	                                sc.nextLine();  

	                                System.out.println("Enter email:");
	                                String email = sc.nextLine();

	                                Contacts contact = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email);
	                                selectedAddressBook.add(contact);

	                                System.out.println("Contact added successfully!");
	                                break;

	                            case 2:
	                                System.out.println("Enter the first name of the contact to edit:");
	                                String editFirstName = sc.nextLine();

	                                System.out.println("Enter the last name of the contact to edit:");
	                                String editLastName = sc.nextLine();

	                                selectedAddressBook.edit(editFirstName, editLastName);
	                                selectedAddressBook.display();
	                                break;

	                            case 3:
	                                System.out.println("Enter the first name of the contact to delete:");
	                                String deleteFirstName = sc.nextLine();

	                                System.out.println("Enter the last name of the contact to delete:");
	                                String deleteLastName = sc.nextLine();

	                                selectedAddressBook.delete(deleteFirstName, deleteLastName);
	                                selectedAddressBook.display();
	                                break;

	                            case 4:
	                                selectedAddressBook.display();
	                                break;

	                            case 5:
	                                System.out.println("Returning to main menu...");
	                                break;

	                            default:
	                                System.out.println("Invalid option. Try again.");
	                        }
	                        if (operation == 5) break;
	                    }
	                    break;

	                case 3:
	                    System.out.println("Exiting the program.");
	                    sc.close();
	                    return;

	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }
	        }
	    }
}
	             
	             
	             
	        
		
		
	

