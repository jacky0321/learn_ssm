package com.learning.model;

public class Address {
	private int id;
	private String province;
	private String city;
	private String district;
	
	public Address() {
		super();
	}
	
	public Address(int id, String province, String city, String district) {
		this.id = id;
		this.province = province;
		this.city = city;
		this.district = district;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getProvince() {
		return province;
	}
	
	public void setProvince(String province) {
		this.province = province;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getDistrict() {
		return district;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public String toString() {
		return province + " " + city + " " + district;
	}
}
