package com.users_reg.dao;

import java.util.List;

import com.users_reg.model.Person;

public interface PersonDAO {
	List<Person> getAllPersons();
	Person getPersonById(int id);
	Person addPerson(Person p);
	Person updatePerson(Person p);
	void deletePerson(int id);
	
	
}
