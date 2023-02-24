package com.cab.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cab.entity.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {

}
