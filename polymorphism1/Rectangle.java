package com.kn.polymorphism1;

public class Rectangle extends Shape {
	
	double length =2,breath=5;

	@Override
	public double CalculateArea() {
		return  length*breath;
		
	}
	
	public double CalculatePerimeter() {
		return 2*length+breath;
		
	}
	
	

}
