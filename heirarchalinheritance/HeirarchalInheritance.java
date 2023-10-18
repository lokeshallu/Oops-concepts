package com.kn.heirarchalinheritance;

public class HeirarchalInheritance {

	public static void main(String[] args) {
		Employee e = new Employee();
		
		e.name ="Govind";
		e.salary=15000;
		System.out.println("Employee");
		System.out.println("Name "+e.name+"_ salary ="+e.salary);
		System.out.println();
		
		Developer Devp = new Developer();
		Devp.name ="lokesh";
		Devp.salary =25000;
		System.out.println("Developer");
		System.out.println("Name "+Devp.name+"_ salary ="+Devp.salary);
		System.out.println();
		
		
		Tester Test = new Tester();
		Test.name ="Ravi";
		Test.salary =50000;
		System.out.println("Tester");
		System.out.println("Name "+Test.name+"_ salary ="+Test.salary);
		System.out.println();
		
		TeamLead tl = new TeamLead();
		tl.name ="hari";
		tl.salary=75000;
		System.out.println("TeamLead");
		System.out.println("Name "+tl.name+"_ salary ="+tl.salary);
		System.out.println();
		
		Manager m = new Manager();
		m.name ="Babu";
		m.salary =1000000;
		System.out.println("Manager");
		System.out.println("Name "+m.name+"_ salary ="+m.salary);

	}

}
