package com.kn.chainingcheckin;

public class EnggStudent  extends Student{
	
	String branch ="mech";
	int sem =5 ;

	public EnggStudent(String name, int age ,int sem,String branch) {
		
		System.out.println("--before--");
		this.branch = branch;
		this.sem = sem;
	}
	
	
	public EnggStudent(String name,int age,int sem) {
		super();
		System.out.println(this.name+this.age+this.sem+"---==");
		
		
		this.name = name;
		this.age = age;
		this.sem = sem;
		System.out.println("---"+this.name+this.age+this.sem+"---==");
		
	}
 
	public EnggStudent(String name,int age,String branch) {
       
		this.branch = branch;
	}
	public EnggStudent( int sem,String branch) {
		 this("venkat",50,2);
		this.branch = branch;
		this.sem = sem;
		System.out.println("--2 arg const---");
	}
	


	public EnggStudent(String name, int age) {
		this(3,"mech");
		System.out.println("*before***********");
		System.out.println(super.name);
		System.out.println(super.age);
		System.out.println(this.sem);
		System.out.println(this.branch);
		
		
		this.sem = sem;
		this.branch=branch;
		System.out.println("*after***********");
		System.out.println(super.name);
		System.out.println(super.age);
		System.out.println(sem);
		System.out.println(branch);
	}


	
	
		
	}
	
	
    	  
//    	  by default super() have no attributes so that it have searching 
    	  // for parent class no attribute constrocter
      

