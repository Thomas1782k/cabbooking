package com.cab.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cab.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
