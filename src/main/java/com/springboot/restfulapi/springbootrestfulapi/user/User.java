package com.springboot.restfulapi.springbootrestfulapi.user;

import java.util.Date;

public class User {

	private Integer id;

	private String name;

	private Date birthDate;
	
	protected User() {
		
	}

	public User(Integer id, String name, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	public Integer getId() {
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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	@Override
	public String toString() {
		return String.format(
				"User [id=%s, name=%s, birthDate=%s, getId()=%s, getName()=%s, getBirthDate()=%s, getClass()=%s, hashCode()=%s, toString()=%s]",
				id, name, birthDate, getId(), getName(), getBirthDate(), getClass(), hashCode(), super.toString());
	}

}
