package com.kn.polymorphism1;

public class ShapeDemo {
	public static void main(String[] args) {
		
		Geometry g = new Geometry();
		
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		Square s = new Square();
		
		
		g.doActivity(r);
		g.doActivity(c);
		g.doActivity(s);
		
	}

}
