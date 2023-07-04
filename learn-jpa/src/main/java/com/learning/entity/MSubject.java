package com.learning.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "m_subject")
public class MSubject {

	@Id
	@Column(name = "m_subject_id")
	private long subjectId;
	@Column(name = "code")
	private String code;
	@Column(name = "name")
	private String name;
	@Column(name = "instructor")
	private String instructor;

	public MSubject() {
		// Empty
	}
	
	public MSubject(long subjectId, String code, String name, String instructor) {
		super();
		this.subjectId = subjectId;
		this.code = code;
		this.name = name;
		this.instructor = instructor;
	}
	public long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
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
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	@Override
	public String toString() {
		return "MSubject [subjectId=" + subjectId + ", code=" + code + ", name=" + name + ", instructor=" + instructor + "]";
	}
	
	
}
