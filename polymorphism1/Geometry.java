package com.kn.polymorphism1;

public class Geometry {
	
	public void doActivity(Shape sh) {
		
		sh.draw();
		System.out.println("Area = "+sh.CalculateArea());
		
		if(sh instanceof Rectangle) {
			System.out.println("perimeter = "+((Rectangle)(sh)).CalculatePerimeter());
		}else if(sh instanceof Circle) {
			System.out.println("perimeter = "+((Circle)(sh)).CalculatePerimeter());		
		}else {
			System.out.println("perimeter = "+((Square)(sh)).CalculatePerimeter());
		}
		
	}

}
