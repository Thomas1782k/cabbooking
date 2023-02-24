package com.cab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cab.entity.Driver;
import com.cab.service.DriverService;


@RestController
@RequestMapping("/api/driver")
public class CabController {

	@Autowired
	DriverService er;

	@PostMapping
	public ResponseEntity<Driver> save(@RequestBody Driver emp)
	{
		er.save(emp);
		return new ResponseEntity<Driver>(emp, HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Driver> getAll()
	{
		return er.getAll();
	}
	
	@GetMapping("/{id}")
	public Driver getById(@PathVariable("id") long id)
	{
		return er.getById(id);
	}
	
	
	@DeleteMapping("/{id}")	
	public ResponseEntity<String> delete(@PathVariable("id") long id)
	{
		er.delete(id);
		return new ResponseEntity<String>("Sucessfully Deleted", HttpStatus.GONE);
	}
	
	
}
