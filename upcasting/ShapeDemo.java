package com.kn.upcasting;

public class ShapeDemo {
	public static void main(String[] args) {
		
//		Shape sh =new Shape();
//		
//		Rectangle r1 = new Rectangle();
//		sh=r1;
//		sh.draw();
//		System.out.println(sh.calculateArea());
//		
//		Square s1= new Square();
//		sh=s1;
//		sh.draw();
//		System.out.println(sh.calculateArea());
//		
//		Circle c1 = new Circle();
//		sh=c1;
//		sh.draw();
//		System.out.println(sh.calculateArea());
//		
		Rectangle r1 = new Rectangle();
		Square s1 = new Square();
		Circle c1 = new Circle();
		Geometry g = new Geometry();
		g.doActivity(r1);
		g.doActivity(s1);
		g.doActivity(c1);
	}

}
