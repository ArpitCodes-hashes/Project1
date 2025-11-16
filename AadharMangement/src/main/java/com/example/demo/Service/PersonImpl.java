package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Person;
import com.example.demo.Repository.PersonRepo;

@Service
public class PersonImpl implements PersonService {

	@Autowired
	PersonRepo personRepo;

	@Override
	public void savePerson(Person p) {
		// TODO Auto-generated method stub
		personRepo.save(p);
	}

	

}
