package com.feng.cach.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.feng.cach.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
	

}