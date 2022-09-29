package com.example;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Agent")
@Entity
public class Agent {
	@Id
	private int id;
	private String name;
	private String city;
	private int Commisionamount;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getcity() {
		return city;
	}
	public void setcity(String city) {
		this.city = city;
	}
	public int getCommisionamount() {
		return Commisionamount;
	}
	public void setCommisionamount(int commisionamount) {
		Commisionamount = commisionamount;
	}


}
