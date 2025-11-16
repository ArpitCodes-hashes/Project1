package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Aadhar;
import com.example.demo.Entity.Person;
import com.example.demo.Repository.AadharRepo;
import com.example.demo.Repository.PersonRepo;

import Dto.AadharDto;
@Service
public class AadharServiceImpl implements AadharService {

	@Autowired
	AadharRepo aadharRepo;
	@Autowired
	PersonRepo personRepo;

	@Override
	public void saveAadhar(AadharDto aadharDto) {
		// TODO Auto-generated method stub
		Aadhar a= new Aadhar();
		a.setAadharNo(aadharDto.getAadharNo());
		 Person p=  personRepo.findById(aadharDto.getPersonId()).get();
		p.setAadhar(a);
		personRepo.save(p);
	}
	
}
