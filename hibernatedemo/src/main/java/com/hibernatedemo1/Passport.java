package com.hibernatedemo1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int passportId;
	private String passportNum;
	public Passport(int passportId, String passportNum) {
		super();
		this.passportId = passportId;
		this.passportNum = passportNum;
	}
	public int getPassportId() {
		return passportId;
	}
	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}
	public String getPassportNum() {
		return passportNum;
	}
	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}
	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", passportNum=" + passportNum + "]";
	}
	public Passport() {
		super();
	}
	
	
}
