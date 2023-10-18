package com.kn.chainingcheckin;

public class Student {
	
	String name ="vijay  ";
	int age=24;
	public Student() {
		this("lokesh");
		System.out.println("-parent no arg -");
	}
	
	
	
	public Student(String name) {
		this.name = name;
		System.out.println("name="+this.name);
		System.out.println("one arg connnnnnn");
//		this.age = age;
	}



	public Student(String name, int age) {
		
		this();
		this.name = name;
		this.age = age;
		System.out.println(this.name+"|");
		System.out.println(this.age+"|");
	}

	

	 

}
