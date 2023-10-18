package com.kn.constroctorcalling;

public class Child {
	String name ="ram";
	int age =44;
	public Child() {
		System.out.println("---Child no arg constrocter---");
	}
	
	
	public Child(String name, int age) {
		this();	
		System.out.println("-- before  --");
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println("------");
		System.out.println("   after   ");
		
		System.out.println("--child 2 arg constrocter--");
		this.name = name;
		this.age = age;
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	

}
