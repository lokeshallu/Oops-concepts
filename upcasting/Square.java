package com.kn.upcasting;

public class Square extends Shape {
	
	public void draw() {
		System.out.println("Drawing shape");
	}

	
	public double calculateArea() {
		double s=10;
		return s*s;   
	}
}
