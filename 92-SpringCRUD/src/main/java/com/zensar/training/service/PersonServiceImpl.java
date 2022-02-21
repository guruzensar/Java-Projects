package com.zensar.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.training.bean.Person;
import com.zensar.training.db.PersonDAO;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	PersonDAO dao;
	
	

	public PersonDAO getDao() {
		return dao;
	}

	public void setDao(PersonDAO dao) {
		this.dao = dao;
	}

	@Override
	public Person addPerson(Person person) throws Exception {
		
		return dao.save(person);
	}

	@Override
	public Person updatePerson(Person person) throws Exception {
		
		return dao.save(person);
	}

	@Override
	public boolean deletePerson(Person person) {
		boolean result=true;
		try {
		dao.delete(person);
		}catch(Exception e) {
			result=false;
		}
		return true;
	}

	@Override
	public Optional<Person> findPerson(int id) {
		
		return dao.findById(id);
	}

	@Override
	public List<Person> getAllPersons() {
		
		return dao.findAll();
	}

}
