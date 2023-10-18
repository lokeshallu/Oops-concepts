package com.kn.polymorphism1;

public class Circle extends Shape {

	double radius =5.5;

	@Override
	public double CalculateArea() {
	 return Math.PI*radius*radius;
	}
	
	public double CalculatePerimeter() {
		return 2*Math.PI*radius*radius;
		
	}
	
	

}
