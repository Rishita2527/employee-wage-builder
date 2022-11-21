package com.bridgelabz;

import java.util.Scanner;

public class EmployeeWageComputation {
	void checkEmployeeAttendence() {
 	   int IS_FULL_TIME = 1;
 	   double empCheck = Math.floor(Math.random() * 10)%2;
 	   if(empCheck == IS_FULL_TIME)
 		   System.out.println("Employee is present");
 	   else
 		   System.out.println("Employee is Absent");
    }
	void calculateEmployeeWage(){
		 int fullTime=1;
		 int employeeRatePerHrs=20;
		 int employeeHrs=0;
		 int employeeWage=0;
		 double employeeCheck=Math.floor(Math.random()*10)%2;
		 if(employeeCheck == fullTime)
			 employeeHrs=8;
		 else
			 employeeHrs=0;
		 employeeWage=employeeHrs*employeeRatePerHrs;
		 System.out.println("Employee Wage "+employeeWage);
	}
	public static void main(String[] args) {
		EmployeeWageComputation  Emp = new EmployeeWageComputation ();
		Emp.checkEmployeeAttendence();
		Emp.calculateEmployeeWage();
	}

}
