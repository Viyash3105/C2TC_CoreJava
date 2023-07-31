package com.cg.daysix;

public class fin {
	public static void main (String[]args) {
		final int value =10;
		System.out.println("The value is :" +value);
		final String message = "hello,world";
		System.out.println(message);
		
		Myclass myobj = new Myclass();
		myobj.printMessage();
		myobj.printFinalMessage();	
	}
}
class Myclass{
	final String message = "Hello!";
	void printMessage() {
		System.out.println(message);
	}
	void printFinalMessage() {
		final String finalMessage = "Hello,final!";
		System.out.println(finalMessage);
	}
}
final class MyotherClass{
	
}
