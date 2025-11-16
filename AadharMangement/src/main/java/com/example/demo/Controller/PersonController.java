package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Person;
import com.example.demo.Service.PersonService;

@RestController
public class PersonController {
	@Autowired
	PersonService personservice;

	@PostMapping("person")
	ResponseEntity addPerson(@RequestBody Person p) {
		personservice.savePerson(p);
		return new ResponseEntity(HttpStatus.CREATED);

	}
}
