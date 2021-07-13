package com.thebongcoder.onetomany.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thebongcoder.onetomany.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
