package com.learning.springboot.learnjpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learning.entity.Department;
import com.learning.repo.DepartmentRepository;

@Component
public class SpringDataJPACommandLineRunner implements CommandLineRunner{

	@Autowired
	private DepartmentRepository repository;

	@Override
	public void run(String... args) throws Exception{ 	

		// Insert records in Department Table
		repository.save(new Department(1l, "1001", "Computer"));
		repository.save(new Department(2l, "1002", "Electrical"));
		repository.save(new Department(3l, "1003", "Electronics"));
		repository.save(new Department(4l, "1004", "Mechanical"));
		
		// Delete records from Department Table
		repository.deleteById(4l);
		
		// Select from Department Table
		List<Department> departments =  repository.findAll();
		System.out.println(departments);
		
		System.out.println("********* Find by code ******");
		List<Department> departmentsByCode =  repository.findByCode("1001");
		System.out.println(departmentsByCode);
	}
	
	
}
