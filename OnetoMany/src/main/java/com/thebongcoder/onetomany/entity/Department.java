package com.thebongcoder.onetomany.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="companies")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Along with company all employees saves in DB
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="pc_fid",referencedColumnName = "id")
	List<Employee> employees = new ArrayList<>();
	
	
	public Department() {
		
	}
	
	
	
	public Department(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
}
