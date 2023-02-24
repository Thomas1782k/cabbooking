package com.cab.service;

import java.util.List;

import com.cab.entity.Driver;

public interface DriverService {

	Driver save(Driver lib);
	List<Driver> getAll();
	Driver getById(long id);
	void delete(long id);
}
