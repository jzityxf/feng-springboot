package com.feng.cach.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feng.cach.domain.Person;
import com.feng.cach.service.DemoService;

@RestController
public class CacheController {
	
	@Autowired
	DemoService demoService;
	
	
	
	
	@RequestMapping("/put")
	public Person put(Person person){
		return demoService.save(person);
		
	}

	
	@RequestMapping("/get")
	public Person cacheable(Person person){
		
		
		return demoService.findOne(person);
		
	}
	
	@RequestMapping("/delete")
	public String  evit(int id){
		 demoService.remove(id);
		 return "ok";
		
	}
	

}
