package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{
	
	// fake list of contacts 
	List<Contact> list = List.of(
	
			new Contact(11,"chotu@123","chotu",1),
			new Contact(44,"dhirya@123","dhirya",1),
			new Contact(22,"mohit@123","mohit",2) ,
			new Contact(33,"shalu@123","shalu",3) 
			
			);
	
	
	
	

	@Override
	public List<Contact> getContactsOfUser(Integer userId) {
		
		return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
