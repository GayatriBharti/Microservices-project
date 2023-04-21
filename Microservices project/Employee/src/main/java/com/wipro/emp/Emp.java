package com.wipro.emp;
import org.springframework.beans.factory.annotation.Autowired;

import com.wipro.model.Employee;
public class Emp {
	@Autowired
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	

}
