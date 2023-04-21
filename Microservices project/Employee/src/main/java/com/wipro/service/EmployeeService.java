package com.wipro.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.wipro.model.*;
import com.wipro.repo.EmpRepo;







@Service
public class EmployeeService {
	@Autowired
	private EmpRepo emprepo;
	@Autowired
	private CircuitBreakerFactory circuitBreakerFactory;
	
	public void savetech(Employee emp) {
		emp.setAsmnttype("Technical");
		emprepo.save(emp);
	}
	public void saveBeh(Employee emp) {
		emp.setAsmnttype("Behavioral ");
		emprepo.save(emp);
		
	}
	public List<Employee> getalldata() {
		return emprepo.findAll();
	}
	public List<Employee> getempzomato() {
		System.out.println("its Servicw");
		RestTemplate restTemplate=new RestTemplate();
		String url="https://api.zomato.com/v1/reviews.json/";
	    
	    
	    CircuitBreaker circuitBreaker = circuitBreakerFactory.create("NotworkingCircuiteBreaker");
	    return (List<Employee>) circuitBreaker.run(() -> restTemplate.getForObject(url, List.class), 
	  	      throwable -> getDefaultemp());
	}
	
	private List<Employee> getDefaultemp() {
		List<Employee> deftemp=new ArrayList<Employee>();
		deftemp.add(new Employee(1,404,"Error","Error","Error"));
		deftemp.add(new Employee(2,404,"Error","Error","Error"));
		return deftemp;
	}

}
