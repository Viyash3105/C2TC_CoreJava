package com.cg.daytwo;

public class nested_for {
	public static void main (String [] args) {
		int day = 5 , period = 7;
		
		for (int i=1;i<=day;++i) {
			System.out.println("day: " +i);
			
			for(int j=1;j<=period;++j) {
				System.out.println("period:" +j);
				
			}
		}
	}

}
