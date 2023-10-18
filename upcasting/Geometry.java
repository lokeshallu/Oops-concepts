package com.kn.upcasting;

public class Geometry {
	public void doActivity(Shape sh) {
		sh.draw();
	System.out.println(	sh.calculateArea());
	}

}
