package com.wipro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import com.wipro.model.Employee;
import com.wipro.service.EmployeeService;

@Controller
@EnableAutoConfiguration
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empservice;
	
	@GetMapping("")
	public String login() {
		return "index";
	}
	@GetMapping("/uls")
	public String uls() {
		return "Uls";
	}
	@GetMapping("/tech")
	public String tech() {
		return "tech";
	}
	@GetMapping("/Beh")
	public String Beh() {
		return "Beh";
	}
	
	@PostMapping("/savetech")
	public String savetect(@ModelAttribute("emp") Employee emp) {
		empservice.savetech(emp);
		return "index";
	}
	@PostMapping("/saveBeh")
	public String saveBeh(@ModelAttribute("emp") Employee emp) {
		empservice.saveBeh(emp);
		return "index";
	}
	@GetMapping("/getalldata")
	@ResponseBody
	public List<Employee> getjsonservices(){
		return empservice.getalldata();
	}
	@GetMapping("/nwcb")
	public ModelAndView empservice(){
		System.out.println("its controller");
		List<Employee>employee=empservice.getempzomato();
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee",employee);
		mv.setViewName("empdetails.html");
		return mv;
	}
}
