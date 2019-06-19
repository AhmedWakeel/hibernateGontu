package com.gontu;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class Student_Detail {

	@Id @GeneratedValue(generator = "newGenerator")
	@GenericGenerator(name = "newGenerator" ,strategy = "foreign" , parameters = {@Parameter(value = "student" , name = "property")})
	private int rollNo;
	String student_mobile_number;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "rollNo")
	Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudent_mobile_number() {
		return student_mobile_number;
	}

	public void setStudent_mobile_number(String student_mobile_number) {
		this.student_mobile_number = student_mobile_number;
	}

}
