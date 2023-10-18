package com.kn.cyclicinheritance;

public class DemoApp {
	public static void main(String[] args) {
		
//	hierarchey type of demo3 is inconsistance (cyclic inheritance not permited)
  Demo2 d = new Demo2();
  System.out.println(d.i);
	}
}
