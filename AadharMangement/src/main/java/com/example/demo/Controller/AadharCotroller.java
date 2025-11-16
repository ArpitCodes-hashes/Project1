package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Aadhar;
import com.example.demo.Service.AadharService;

import Dto.AadharDto;

@RestController
public class AadharCotroller {

	@Autowired
	AadharService aadharservice;

	@PostMapping("getaadhar")
	ResponseEntity addAadhar(@RequestBody AadharDto aadharDto) {
		aadharservice.saveAadhar(aadharDto);
		return new ResponseEntity(HttpStatus.CREATED);
	}
}		
