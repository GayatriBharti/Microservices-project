package com.wipro.service;


import java.util.*; 


import org.springframework.stereotype.Service;

import com.wipro.model.User;


@Service
public class LoginService {
	
	
	
	
	

	public String aclogin(String userid, String password, String userlevel) {
		 
		System.out.println("Services "+userid+" "+password+" "+userlevel);
		List<User> list=new ArrayList<User>();  
	    //Creating Users 
		User u1=new User("1001","1001","Admin");  
		User u2=new User("1002","1002","Admin");  
		User u3=new User("1003","1003","Employee"); 
		User u4=new User("1004","1004","Employee"); 
		list.add(u1);
		list.add(u2);
		list.add(u3);
		list.add(u4);
		//List<User> list1 =new ArrayList<>(Arrays.asList(u1,u2,u3,u4));
		
		String s = null;
		for(User u:list){ 
			System.out.println("list "+u.getUserid()+" "+u.getPassword()+" "+u.getUserlevel());
			
			if(userid.equals(u.getUserid())&& password.equals(u.getPassword()) && userlevel.equals(u.getUserlevel()))
			{
				if(userlevel.equals("Admin"))
				{
					s= "redirect:/admin";
					System.out.println("i admin");
					break;
				}
				else
				{
					s= "redirect:/employee";
					System.out.println("i emp");
					break;
				}
			}
			else
			{
				System.out.println("i uls");
				s= "Uls";
			}
		}
		return s;
		
	
		

	}
}
