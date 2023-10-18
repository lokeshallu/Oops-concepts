package com.kn.polymorphismtask;

public class Geometry {
  public void doActivity(SoftwareEngineer se) {
	  
	se.attendmeeting();
	se.doTesting();
	
	
	if(se instanceof DatabaseEngineer)
	{
		((DatabaseEngineer)(se)).doDatabaseProject();
		((DatabaseEngineer)(se)).learnSql();
		
	}
	else if(se instanceof JavaBackendEngineer) 
	{
		((JavaBackendEngineer)(se)).doBackendProject();
		((JavaBackendEngineer)(se)).learnJava();
		
	}
	else if(se instanceof PythonBackendEngineer)
	{
		((PythonBackendEngineer)(se)).doBackendProject();;
		((PythonBackendEngineer)(se)).learnpython();
	}
	else if(se instanceof BackendEngineer)
	{		
		((BackendEngineer)(se)).doBackendProject();;
		
	}
	  
	  
  }
	
	
	
}
