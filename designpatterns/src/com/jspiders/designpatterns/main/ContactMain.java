package com.jspiders.designpatterns.main;

import com.jspiders.designpatterns.creational.Contact;
import com.jspiders.designpatterns.creational.ContactBuilder;

public class ContactMain {

	public static void main(String[] args) {
		
		Contact contact = new ContactBuilder().firstName("Pankaj").lastName("Dhanwate").mobileNumber(808019802).getContact();
		System.out.println(contact);
	}
}
