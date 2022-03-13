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
		 System.out.println("whatsurname");
		 Ename=scan1.nextLine();
	 }
	 
}
