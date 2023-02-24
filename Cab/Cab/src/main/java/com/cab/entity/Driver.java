package com.cab.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Driver")
public class Driver {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="name")
	private String Name;
	@Column(name="gender")
	private String gender;
	@Column(name="age")
	private String age;
	@Column(name="car_name")
	private String car;
	@Column(name="cur_loc")
	private String cur_loc;
	@Column(name="status")
	private String status;
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public String getCur_loc() {
		return cur_loc;
	}
	public void setCur_loc(String cur_loc) {
		this.cur_loc = cur_loc;
	}
	@Override
	public String toString() {
		return "Driver [id=" + id + ", Name=" + Name + ", gender=" + gender + ", age=" + age + ", car=" + car
				+ ", cur_loc=" + cur_loc + "]";
	}
	
	
}
