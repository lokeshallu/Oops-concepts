package com.kn.polymorphism1;

public class Square extends Shape {
	
	double side=5;

	@Override
	public double CalculateArea() {
		return side*side;
	    
	}
	
	public double CalculatePerimeter() {
		return 4*side;
		
	}
	

}
