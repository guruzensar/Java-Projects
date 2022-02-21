package com.zensar.training.service;

import java.util.List;
import java.util.Optional;

import com.zensar.training.bean.Person;

public interface PersonService {
	Person addPerson(Person person) throws Exception;
	Person updatePerson(Person person) throws Exception;
	boolean deletePerson(Person person);
	Optional<Person> findPerson(int id);
	List<Person> getAllPersons();
	
}
