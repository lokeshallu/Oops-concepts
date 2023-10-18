package com.kn.upcasting;

public class Rectangle extends Shape {

	public void draw() {
		System.out.println("Drawing shape");
	}


	public double calculateArea() {
		double l=10,b=5.5;
		return l*b;   
	}
    
}
