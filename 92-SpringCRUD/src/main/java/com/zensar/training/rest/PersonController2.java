package com.zensar.training.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.training.bean.Person;
import com.zensar.training.service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController2 {

	@Autowired
	PersonService personService;
	
	
	
	public PersonService getPersonService() {
		return personService;
	}



	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}


	
	@GetMapping("/getAllPersons")
	public ResponseEntity<List<Person>> getAll(){
		System.out.println("new one");
		//System.out.println("local host 8080..getAll");
		return ResponseEntity.accepted().body(this.personService.getAllPersons());
	}
	
	@PostMapping("/addPerson")
	
	public Person addPerson(@RequestBody Person person) throws Exception {
		System.out.println("local host 8080..addPerson");
		return this.personService.addPerson(person);
	}
}
