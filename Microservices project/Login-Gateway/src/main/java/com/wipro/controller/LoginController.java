package com.wipro.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.wipro.model.User;
import com.wipro.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginservice;
	
	@GetMapping("/")
	public String login() {
		return "login";
	}
	@PostMapping("/login")
	public String aclogin(@ModelAttribute User userclass) {
		System.out.println("Controller "+userclass.getUserid() +" "+userclass.getPassword()+" "+userclass.getUserlevel());
		return loginservice.aclogin(userclass.getUserid(), userclass.getPassword(), userclass.getUserlevel());
		
		
	}

}
