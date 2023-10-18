package com.kn.inheritance2;

public class RooobtcookDriverRobot {

	public static void main(String[] args) {
		DriverRobot d1 = new DriverRobot();
		
		System.out.println("name = "+d1.name);
		System.out.println("type = "+d1.type);
		
		d1.walking();
		d1.talk();
		d1.charge();
		d1.drive();
		System.out.println();
		System.out.println();
		
		Roobtcook r1 = new Roobtcook();
		
		System.out.println("name = "+r1.name);
		System.out.println("name = "+r1.type);
		
		r1.walking();
		r1.talk();
		r1.charge();
		r1.cook();
		
	}
}
