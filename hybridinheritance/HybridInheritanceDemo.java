package com.kn.hybridinheritance;

public class HybridInheritanceDemo {

	public static void main(String[] args) {
	EngineeringStudent e1 = new EngineeringStudent();
	e1.name = "ravi";
	System.out.println("EngineeringStudent Name :"+e1.name);
	System.out.println();
	
	MedicalStudent m1 = new MedicalStudent();
	m1.name="kavya";
	System.out.println("MedicalStudent Name :"+m1.name);
	System.out.println();
	
	JavaTrainer j1 = new JavaTrainer();
	j1.name ="Arun";
	System.out.println("JavaTrainer Name :"+j1.name);
	System.out.println(); 
	
	SqlTrainer s1 = new SqlTrainer();
	s1.name="ARUN2";
	System.out.println("SqlTrainer Name :"+s1.name);
	System.out.println();
	

	}

}
