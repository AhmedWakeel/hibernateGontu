package com.gontu;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue
	private int student_id;
	private String student_name;
	
    @ManyToOne(cascade = CascadeType.ALL)
    private Student_Address_Detail  address_Detail;


	public Student_Address_Detail getAddress_Detail() {
		return address_Detail;
	}

	public void setAddress_Detail(Student_Address_Detail address_Detail) {
		this.address_Detail = address_Detail;
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
