package com.wipro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.services.Adminservices;

@Controller
@EnableAutoConfiguration
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private Adminservices adminservices;
	@GetMapping("")
	public String adminhome() {
		return "AdminHome";
	}
	
	@GetMapping("/details")
	public ModelAndView getempdetails() {
		return adminservices.getempdetails();
	}
	

}
