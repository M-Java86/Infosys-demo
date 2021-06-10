package com.qa.infosysdemo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.qa.infosysdemo.services.PersonService;

@SuppressWarnings("hiding")
public class PersonController<PersonService, Person> {
	
	private PersonService service {
		
	
		public PersonController(PersonService) {
			super();
			this.service = service;
		}
		
		//CRUD methods
	}

	@PostMapping("/create")
    public Person addPerson(@RequestBody Person person) {
        return this.service.addPerson(person);
    }

    @GetMapping("/getAll")
    public List<Person> getAllPeople() {
        return this.service.getAllPeople();
    }

    @PutMapping("/update")
    public Person updatePerson(@PathParam("id") int id, @RequestBody Person person) {
        return this.service.updatePerson(id, person);
    }

    @DeleteMapping("/delete/{id}")
    public Person removePerson(@PathVariable int id) {
        return this.service.removePerson(id);
    }
}

