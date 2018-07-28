package com.users_reg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.users_reg.model.Person;
import com.users_reg.services.PersonService;


@Controller
public class Users_Registeration {

	@Autowired
	PersonService personservice;
	
	@RequestMapping("/new")
	public ModelAndView registeration()
	{
		return new ModelAndView("person");
	}
	
	@ResponseBody
	@RequestMapping(value="/adduser", produces = MediaType.APPLICATION_JSON_VALUE , consumes = MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.POST)
	public ResponseEntity<Boolean> createStudent(@RequestBody(required=false) Person  person)
	{
		System.out.println("nkdfdkfjf \n"+person);
		this.personservice.addPerson(person);
		HttpHeaders header = new HttpHeaders();
		header.add("key1", "value1");
		header.add("key1", "value2");
		header.add("key2", "value3");
		return new ResponseEntity<Boolean>(false,header,HttpStatus.OK);
	}

	@ResponseBody
	@RequestMapping(value="/addauser",method=RequestMethod.POST)
	public Person acreateStudent(@RequestBody Person  person)
	{
		System.out.println("nkdfdkfjf \n"+person);
		return this.personservice.addPerson(person);
		
	}
}
