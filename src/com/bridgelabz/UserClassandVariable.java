package com.bridgelabz;

public class UserClassandVariable {
	 void calculateTotalWage() {
	        int wagePerHrs = 20;
		  	int maxWorkingDays=20;
		  	int maxWorkingHrs=100;
		  	int totalWage=0;
		  	int workingHrs=0;
		  	System.out.printf("%5s %5s %5s %5s\n", "day", "Workinghrs", "Wage", "Total working hrs");
		  	for (int day=1, totalWorkingHrs=0; day<=maxWorkingDays && totalWorkingHrs < maxWorkingHrs; day++, totalWorkingHrs += workingHrs)
		  	{
		  		int empcheck= (int) Math.floor(Math.random()*10)%3;
		  	    switch (empcheck)
		  	{
		  	case 1:workingHrs=8;
	    	       break;
	    	case 2:workingHrs=4;
	    	       break;
	    	default:
	    		   workingHrs=0;
		  	}
		  	int wage = workingHrs*wagePerHrs;
		  	totalWage += wage;
		  	System.out.printf("%5d %5d %5d %5d\n", day,workingHrs, wage, totalWorkingHrs + workingHrs);
		  	}
		  	System.out.println("Total wage for a month is" + totalWage);
	  }
		public static void main(String[] args) {
			UserClassandVariable  employee = new UserClassandVariable ();
			  employee.calculateTotalWage();
		}
}
