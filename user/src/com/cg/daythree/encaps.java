package com.cg.daythree;

public class encaps {
	public static void main (String []args) {
		Area rectangle = new Area(5,6);
		rectangle.getArea();
	}

}

class Area{
	int length;
	int breath;
	
	Area(int length, int breath){
		this.length = length;
		this.breath = breath;
	}
	public void getArea() {
		int area = length *breath;
		System.out.println("Area: "+area);
	}
}
