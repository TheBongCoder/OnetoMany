package com.thebongcoder.onetomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.thebongcoder.onetomany.entity.Department;
import com.thebongcoder.onetomany.entity.Employee;
import com.thebongcoder.onetomany.entity.repository.DepartmentRepository;

@SpringBootApplication
public class OnetoManyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OnetoManyApplication.class, args);
	}
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		Department department = new Department("Development", "Deals with Backend codes");
		
		Employee employee1 = new Employee("Sukesh Chakraborty", "Assitant Consultant-Development");
		Employee employee2 = new Employee("Taniya Chakraborty", "Assitant Consultant-Business Development");
		Employee employee3 = new Employee("Dumesh Agarwal", "Assitant Consultant-Fronted Development");
		Employee employee4 = new Employee("'Ram Kumar", "Assitant Consultant-Marketing");
		
		department.getEmployees().add(employee1);
		department.getEmployees().add(employee2);
		department.getEmployees().add(employee3);
		
		this.departmentRepository.save(department);
	}

}
