package com.kn.multilevelinheritance;

public class Multilevelnheritance {
	public static void main(String[] args) {
		
	
	
	Vechile v1 = new Vechile(); 
	v1.registreationNumber = 122;
	System.out.println("Vechile registration number :"+v1.registreationNumber);
	v1.moving();
	System.out.println();
	
	Car c1 = new Car();
	c1.registreationNumber = 222;
	System.out.println(" car registration    no     :"+c1.registreationNumber);
	c1.moving();
	System.out.println();
	
	Sedan s1 = new Sedan();
	s1.registreationNumber =999;
	System.out.println(" sedan registration  no      :"+s1.registreationNumber);
	s1.moving();
	System.out.println();
	
	
	
	
	
	}

}
