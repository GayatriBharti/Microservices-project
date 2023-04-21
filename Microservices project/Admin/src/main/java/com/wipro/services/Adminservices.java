package com.wipro.services;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;


@Service
public class Adminservices {
	@Autowired
	LoadBalancerClient loadBalancerClient;

	
	@Value("${pivotal.empservice.name}")
	 protected String empservice;
	@Autowired
	RestTemplate restTemplate;
	
	
	public ModelAndView getempdetails() {
		ModelAndView mv=new ModelAndView();
		ServiceInstance instance=  loadBalancerClient.choose(empservice);
		URI uri=instance.getUri();
		String url=uri.toString()+"/employee/getalldata/";
		List employee = restTemplate.getForObject(url, List.class);
		System.out.println(employee.toString());
		mv.addObject("employee",employee);
		mv.setViewName("empdetails");
		return mv;
	}

}
