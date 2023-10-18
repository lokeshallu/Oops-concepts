package com.kn.upcasting;

public class Circle extends Shape {

	public void draw() {
		System.out.println("Drawing shape");
	}



	public double calculateArea() {
		double r=2.5;
		return   Math.PI*r*r;   
	}
}
