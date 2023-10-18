package com.kn.polymorphismtask;

public class DatabaseEngineer extends SoftwareEngineer {

	@Override
	public void attendmeeting() {
		System.out.println("DatabaseEngineer attending meeting.....");
		
	}
	
	public void doDatabaseProject() {
		System.out.println("DatabaseEngineer data project.......");
	}
	public void learnSql() {
		System.out.println("DatabaseEngineer learn sql.......");
	}
	
}
