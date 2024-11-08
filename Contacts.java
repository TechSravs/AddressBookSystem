package com.files;

public class Contacts {
	private String First_name;
	private String Last_name;
	private String Adress;
	private String City;
	private String State;
	int zip;
	long phone_number;
	private String Email;
	
	public Contacts(String First_name,String Last_name,String Adress,String City,String State,int zip,long phone_number,String Email) {
		this.First_name = First_name;
        this.Last_name = Last_name;
        this.Adress = Adress;
        this.City = City;
        this.State = State;
        this.zip = zip;
        this.phone_number = phone_number;
        this.Email = Email;
	}
	public String toString() {
		return 
				"First_name=" + First_name + '\n' +
                " Last_name=" + Last_name + '\n' +
                " Adress=" + Adress + '\n' +
                " City=" + City + '\n' +
                " State=" + State + '\n' +
                " zip=" + zip +'\n'+
                " Phone_number=" + phone_number +'\n'+
                " E_mail=" + Email + '\n' ;
		
	}
	public void setFirst_name(String first_name) {
		First_name = first_name;
	}



	 
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}


 	public void setCity(String city) {
		City = city;
	}



	 public void setState(String state) {
		State = state;
	}



	 public void setZip(int zip) {
		this.zip = zip;
	}
	 public void setPhone_number(long phone_number) {
			phone_number = phone_number;
		}



		 public void setE_mail(String email) {
			Email = email;
		}



		public String getFirst_name() {
			return First_name;
		}



		public String getLast_name() {
			return Last_name;
		}



}
