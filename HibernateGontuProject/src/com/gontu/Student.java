package com.gontu;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue
	private int student_id;
	private String student_name;
	

	@ManyToMany(cascade = CascadeType.ALL)
	private Set<StudentCertification> certifications = new HashSet<>();

	
	public Set<StudentCertification> getCertifications() {
		return certifications;
	}

	public void setCertifications(Set<StudentCertification> certifications) {
		this.certifications = certifications;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}




}
