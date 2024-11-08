package com.files;

import java.util.*;


public class Adding {
	List<Contacts> con=new ArrayList<>();
    

    public void add(Contacts p1) {
   	 con.add(p1);
    }
    //-----------for editing details
    
    public void edit(String First_name,String Last_name) { 
        boolean contactFound = false;

	 for(Contacts i : con) {
		 if(i.getFirst_name().equalsIgnoreCase(First_name) && i.getLast_name().equalsIgnoreCase(Last_name)){
			 
 			 Scanner sc=new Scanner(System.in);
 			  
			 System.out.println("Enter new adress");
			 i.setAdress(sc.nextLine());
			 
			 System.out.println("Enter new city");
			 i.setCity(sc.nextLine());
			 
			 System.out.println( "Enter new state");
			 i.setState(sc.nextLine());
			 
			 System.out.println("Enter new Zip: ");
             i.setZip(sc.nextInt());
             sc.nextLine();  
             
             System.out.println("Enter new Phone Number: ");
             i.setPhone_number(sc.nextLong());
             sc.nextLine();  

             System.out.println("Enter new Email: ");
             i.setE_mail(sc.nextLine());

             System.out.println("Contact updated successfully!");
               contactFound = true;

             
		 }if(contactFound=false) {
			 
		 System.out.println("Contact not found");
	 }}
	}
	////------------------for deleting
	public void delete(String First_name,String Last_name) {
           Iterator<Contacts> i=con.iterator() ;
           
           boolean isDeleted =false;
           while(i.hasNext()) {
               Contacts c=i.next();
    if(c.getFirst_name().equalsIgnoreCase(First_name) && c.getLast_name().equalsIgnoreCase(Last_name)){
		    con.remove(i);   
		    isDeleted=true;
	 }        			
    
	}if(isDeleted) {
		System.out.println("Deleted Successfully");
	}else {
		System.out.println("Contact not found");
	}
		
}
	public void display() {
		if(con.isEmpty()) {
			System.out.println("No contacts Availabe");
		}
		else {
			for(Contacts i :con) {
				System.out.println(i);
			}
		}
	}
  
}
