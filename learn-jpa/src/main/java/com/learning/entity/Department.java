package com.learning.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "m_department")
public class Department {
	
	@Id
	@Column(name = "m_department_id")
	private long id;
	private String code;
	private String name;

	public Department() {
		// Empty constructor
	}
	
	public Department(long id, String code, String name) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", code=" + code + ", name=" + name + "]";
	}
	
	
}
 