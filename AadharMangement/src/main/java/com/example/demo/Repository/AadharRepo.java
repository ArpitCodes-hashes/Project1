package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Aadhar;

public interface AadharRepo extends JpaRepository<Aadhar,Integer> {

}
