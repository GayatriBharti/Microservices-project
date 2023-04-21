package com.wipro.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.model.Employee;
@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> {
	Employee findById(int userid);
}
