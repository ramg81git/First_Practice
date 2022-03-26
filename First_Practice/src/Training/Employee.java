package Training;

import java.util.Scanner;

public class Employee {
	
	int  Eid;
	String Ename;
	int Sal;
	char Status;
	
	
	Employee() {
		
		Status ='A';
		
		System.out.println("Employee is creted");
		System.out.println("git repository changes 3/25/2:30");
		System.out.println("git added new branch/feature dev02 3/26/2:30");
		
	}
	//returntype methodname(passing parameters)
	  void assign(int id,String name,int salary) {
		
		Eid=id;
		Ename=name;
		Sal=salary;
		
	}
	 
	 
	
	 void display() {
		 
		 System.out.println(Ename);
		 System.out.println(Eid);
		 System.out.println(Sal);
		 
		 
		 
	 }

	 void input() {
		 
		 Scanner scan1=new Scanner(System.in);
		 System.out.println("whatsurnamegit");
		 Ename=scan1.nextLine();
	 }
	 
}
