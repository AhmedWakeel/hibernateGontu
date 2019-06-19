package com.gontu;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
// @Table(name="Student_Info_Table")
public class Student {

	@Id @GeneratedValue
	private int rollNo;
	
	@Temporal(TemporalType.TIME)
	Date date;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "rollNo")
	private Student_Detail detail;
	
	
	public Student_Detail getDetail() {
		return detail;
	}

	public void setDetail(Student_Detail detail) {
		this.detail = detail;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Transient
	@Column(name = "Student_Name",nullable=false)
	private String name;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
