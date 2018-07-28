package com.users_reg.services;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users_reg.dao.PersonDAO;
import com.users_reg.dao.PersonDAOImpl;
import com.users_reg.model.Person;
@Transactional
@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonDAO personDAO;
	private static final Logger logger = LoggerFactory.getLogger(PersonServiceImpl.class);

	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}
	
	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return this.personDAO.getAllPersons();
	}

	@Override
	public Person getPersonById(int id) {
		// TODO Auto-generated method stub
		return this.personDAO.getPersonById(id);
	}

	@Override
	public Person updatePerson(Person p) {
		// TODO Auto-generated method stub
		return this.personDAO.updatePerson(p);
	}

	@Override
	public Person addPerson(Person p) {
		// TODO Auto-generated method stub
		this.logger.info("hhhhhhhhhhhhhhhhhhhhhh");
		return this.personDAO.addPerson(p);
	}

	@Override
	public void deletePerson(int id) {
		// TODO Auto-generated method stub
		this.personDAO.deletePerson(id);
		
	}

}
