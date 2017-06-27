package com.feng.mongodb.dao;

import java.util.List;

import com.feng.mongodb.entity.Customer;

public interface CustomerRepository //extends MongoRepository<Customer, String> 
{

     Customer findByFirstName(String firstName);
     List<Customer> findByLastName(String lastName);

}