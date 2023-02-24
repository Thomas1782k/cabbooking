package com.cab.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cab.entity.Driver;
import com.cab.repo.DriverRepository;
import com.cab.service.DriverService;


@org.springframework.stereotype.Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	DriverRepository lr;
	
	@Override
	public Driver save(Driver lib) {
		return lr.save(lib);
	}

	@Override
	public List<Driver> getAll() {
		return lr.findAll();
	}

	@Override
	public Driver getById(long id) {
		Driver op=lr.findById(id).orElseThrow();
		return op;
	}

	

	@Override
	public void delete(long id) {
		Driver op=lr.findById(id).orElseThrow();
		lr.deleteById(id);	
	}

}
