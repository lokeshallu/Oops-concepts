package com.kn.polymorphismtask;

public class SoftwareEngineerDdemo {

	public static void main(String[] args) {
		
		Geometry g = new Geometry() ;
		
		SoftwareEngineer s1 = new SoftwareEngineer();
		
		BackendEngineer be = new BackendEngineer();
		DatabaseEngineer de = new DatabaseEngineer();
		JavaBackendEngineer je =new JavaBackendEngineer();
		PythonBackendEngineer py = new PythonBackendEngineer();
//		
//		s1.attendmeeting();
//		s1.doTesting();
//		
//		be.attendmeeting();
//		be.doTesting();
//		be.doBackendProject();
//		
//		de.attendmeeting();
//		de.doTesting();
//		de.doDatabaseProject();
//		de.learnSql();
//		
//		je.attendmeeting();
//		je.doTesting();
//		je.doBackendProject();
//		je.learnJava();
//		
//		py.attendmeeting();
//		py.doTesting();
//		py.doBackendProject();
//		py.learnpython();
		
		
		
		
		g.doActivity(s1);
		System.out.println("--------------------------");
		g.doActivity(be);
		System.out.println("---------------------------");
		g.doActivity(de);
		System.out.println("---------------------------");
		g.doActivity(je);
		System.out.println("-------------------------------");
		g.doActivity(py);
		

	}

}
