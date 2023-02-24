package com.cab.service;

import java.util.List;

import com.cab.entity.User;

public interface UserService {

	User save(User lib);
	List<User> getAll();
	User getById(long id);
	void delete(long id);
}
