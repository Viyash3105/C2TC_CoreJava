package com.cg.daythree;

public class constructor {
	public static void main (String[]args) {
		cons cons1=new cons("Thiru",21);
		System.out.println("consname :" +cons1.name +  " and consid :" +cons1.id);
	}

}
class cons{
	String name;
	int id;
	cons(String name, int id)
	{
		this.name = name;
		this.id=id;
	}
}
