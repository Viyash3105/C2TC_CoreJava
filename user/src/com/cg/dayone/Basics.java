package com.cg.dayone;
class Person{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void getName(String name) {
		this.name=name;
	}
	public int getAge(){
		return age;}
	
	public void setAge(int age) {
		this.age = age;
	}
}
public class Basics{
	public static void main (String[]args)
	{
		Person person = new Person();
		person.getName("John");
		person.setAge(30);
		
		System.out.println("Name: " +person.getName());
		System.out.println("Age: " +person.getAge());
		
	}
}

