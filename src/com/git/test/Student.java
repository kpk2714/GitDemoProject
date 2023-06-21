package com.git.test;

public class Student {
	int id;
	String name;
	long roll;
	
	public Student(int id,String name,long roll)
	{
		this.id = id;
		this.name = name;
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", roll=" + roll + "]";
	}
	
	
}
