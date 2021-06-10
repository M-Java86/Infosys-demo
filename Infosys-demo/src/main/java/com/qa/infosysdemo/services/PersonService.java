package com.qa.infosysdemo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
	
	private List<Person> people = new ArrayList<> ();
	
	public Person addPerson(Person person) {
		// Add new Person
		this.people.add(person);
		//return last added Person from List 
		return this.people.get(this.people.size()  -1);
		
	}
	
	public List<Person> getAllPeople() {
		//return this whole list 
		return this.people;
	}
	
	public Person updatePerson(int id, Person person) {
		//Remove 
		
	}


}
