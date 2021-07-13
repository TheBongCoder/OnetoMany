package com.thebongcoder.onetomany.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thebongcoder.onetomany.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>
{

}
