package com.learning.model;

public class Student {
	private int id;
	private String name;
	private int age;
	private byte[] img;
	private String remark;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, byte[] img, String remark) {
		super();
		this.name = name;
		this.age = age;
		this.img = img;
		this.remark = remark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public byte[] getImg() {
		return img;
	}

	public void setImg(byte[] img) {
		this.img = img;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", remark=" + remark + "]";
	}

	
}
