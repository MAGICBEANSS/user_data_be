package com.users_reg.services;

import java.util.List;

import com.users_reg.model.Person;

public interface PersonService {
	
	List<Person> getAllPersons();
	Person getPersonById(int id);
	Person updatePerson(Person p);
	Person addPerson(Person p);
	void deletePerson(int id);
	
}
