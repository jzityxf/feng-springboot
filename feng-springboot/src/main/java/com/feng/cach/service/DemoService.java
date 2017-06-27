package com.feng.cach.service;

import com.feng.cach.domain.Person;

public interface DemoService {
	public Person save(Person person);
	
	public void remove(int id);
	
	public Person findOne(Person person);

}
