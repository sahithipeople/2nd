package com.p2;

import java.util.Scanner;

public class Pro {
	public static void meth() {
		Scanner sn=new Scanner(System.in);
		System.out.println("==========CURD OPERATIONS==========");
		System.out.println(" ---------choose any one section--------");
		System.out.println("1.Display\n2.add\n3.update\n4.delete");
		int v=sn.nextInt();
		if (v==1) {
			displayEmp();
		}
		else if(v==2) {
			adddata();
		}
		else if(v==3) {
			updateEmp();
		}
		else if(v==4) {
			deleteEmp();
		}
		else {
			System.out.println(" invalid selection");
		}
	}
	public static void displayEmp() {
		
		System.out.println("Your details in database is:");
		Empservice service=new Empservice();
       service.displayEmployee();
       method();
       meth();
	}
	public static void method() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter 1 for continue  or  enter  2 for exit");
	int i = s.nextInt();
	if(i==1)
	{
		meth();
	}
	else if(i==2)
	{
		System.out.println("==========exit=========");
	}
		
	}
 public static void adddata()
 {
     Scanner sc=new Scanner(System.in); 
     System.out.println("-------- enter employee full details --------");
     System.out.println("enter  id");
     int id=sc.nextInt();
     System.out.println(" enter name");
     String un=sc.next();
     System.out.println("enter salary"); 
     int salary=sc.nextInt();
      Emp Emp=new Emp();
     Emp.setId(id);
     Emp.setName(un);
     Emp.setSalary(salary);
     Empservice service=new Empservice();
     service.addEmployee(Emp);
     method();
     meth();
 }
	
	public static void deleteEmp() {
		Scanner c=new Scanner(System.in); 
     System.out.println("enter name");
     String un=c.next();
     Emp Emp=new Emp();
     Emp.setName(un);
     Empservice service=new Empservice();
     service.deleteEmployee(Emp);
     method();
		
	}
	public static void updateEmp() 
	{
		 
		       Emp Emp=new Emp();
		        Scanner sc=new Scanner(System.in);
		        System.out.println("enter your new id");
		       Emp.setId(sc.nextInt());
		         System.out.println("enter your new salary");
		         Emp.setSalary(sc.nextInt());
		        Empservice es = new Empservice();
		   es.updatePassword(Emp);
		   method();
		meth();
		   
	}
	public static void main(String[] args) {
		 Pro.meth();
		 Pro.displayEmp();
		 Pro.adddata();
		 updateEmp();
		 deleteEmp();
	 }
	
}
