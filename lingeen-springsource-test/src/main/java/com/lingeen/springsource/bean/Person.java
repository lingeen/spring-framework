package com.lingeen.springsource.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



public class Person {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				'}';
	}
}
