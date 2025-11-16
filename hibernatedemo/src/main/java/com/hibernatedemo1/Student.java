package com.hibernatedemo1;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int marks;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "passportId")
	private Passport passportId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Passport getPassportId() {
		return passportId;
	}

	public void setPassportId(Passport passportId) {
		this.passportId = passportId;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", passportId=" + passportId + "]";
	}

	public Student(int id, String name, int marks, Passport passportId) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.passportId = passportId;
	}

	public Student() {
		super();
	}

}
