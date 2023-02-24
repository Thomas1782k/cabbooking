package com.cab.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cab.entity.User;
import com.cab.repo.UserRepository;
import com.cab.service.UserService;


@org.springframework.stereotype.Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository lr;
	
	@Override
	public User save(User lib) {
		return lr.save(lib);
	}

	@Override
	public List<User> getAll() {
		return lr.findAll();
	}

	@Override
	public User getById(long id) {
		User op=lr.findById(id).orElseThrow();
		return op;
	}

	

	@Override
	public void delete(long id) {
		User op=lr.findById(id).orElseThrow();
		lr.deleteById(id);	
	}

}
