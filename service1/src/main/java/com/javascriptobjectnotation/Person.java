package com.javascriptobjectnotation;

public class Person {
	
	long phoneNum;
	String name;
	long adharNumber;
	Address address;
	public Person(long phoneNum, String name, long adharNumber, Address address) {
		super();
		this.phoneNum = phoneNum;
		this.name = name;
		this.adharNumber = adharNumber;
		this.address = address;
	}
	public Person() {
		super();
	}
	public long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(long adharNumber) {
		this.adharNumber = adharNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [phoneNum=" + phoneNum + ", name=" + name + ", adharNumber=" + adharNumber + ", address="
				+ address + "]";
	}
	

}
