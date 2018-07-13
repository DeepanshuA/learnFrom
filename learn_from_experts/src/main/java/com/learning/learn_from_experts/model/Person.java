package com.learning.learn_from_experts.model;

import com.learning.learn_from_experts.util.PersonType;

public abstract class Person {

	protected String name;
	protected String id;
	protected PersonType type;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public abstract void setType();

	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public PersonType getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return getType() + " with name: " + getName() + " and Id: " + getId();
	}
}
