package com.cg.daytwo;

public class for_each {
	public static void main(String[]args) {
		int[]  num = {34,5,8,2,-9};
		int sum=0;
		for (int number: num) {
			sum+=number;
		}
		System.out.println("Sum =" +sum);
	}

}
