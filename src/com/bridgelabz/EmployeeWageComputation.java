package com.bridgelabz;
public class EmployeeWageComputation {
	//Check Employee is Present or Absent - Use ((RANDOM)) for Attendance Check
	void checkEmployeeAttendence() {
 	   int IS_FULL_TIME = 1;
 	   double empCheck = Math.floor(Math.random() * 10)%2;
 	   if(empCheck == IS_FULL_TIME)
 		   System.out.println("Employee is present");
 	   else
 		   System.out.println("Employee is Absent");
    }
	
	//Calculate Daily Employee Wage - Assume Wage per Hour is 20 - Assume Full Day Hour is 8
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
		 System.out.println("Employee Daily Wage "+employeeWage);
	}
	
	//Add Part time Employee & Wage - Assume Part time Hour is 8
	void calculateEmployeePartTimeWage() {
		int fullTime=2;
		int partTime=1;
		int employeeWagePerHrs=20;
		int employeeHrs=0;
		int employeeWage=0;
		double employeeCheck=Math.floor(Math.random()*10)%3;
		if(employeeCheck == fullTime)
			employeeHrs=16;
		else if (employeeCheck == partTime)
			employeeHrs=8;
		else
			employeeHrs=0;
		employeeWage = employeeHrs * employeeWagePerHrs;
		System.out.println("Employee Part Time Wage "+employeeWage);
	}
	
	//Solving using Switch Case Statement
    int switchcase() {
    	int employeeWagePerHrs=20;
    	int employeeHrs=0;
    	int employeeWage=0;
    	int employeeCheck= (int) Math.floor(Math.random()*10)%3;
    	switch (employeeCheck) {
    	case 1:employeeHrs=8;
    	break;
    	case 2:employeeHrs=16;
    	break;
    	default:employeeHrs=0;
    }
    	employeeWage = employeeHrs * employeeWagePerHrs;
    	return employeeWage;
    }
    
   //Calculating Wages for a Month - Assume 20 Working Day per Month
  void employeeMonthlyWage() {
  	int fullTime=2;
  	int partTime=1;
  	int employeeWagePerHrs = 20;
  	int workingDaysPerMonth=20;
  	int employeeWage=0;
  	int employeeHrs=0;
  	int monthlyWage=0;
      double employeeCheck = Math.floor(Math.random()*10)%3;
      if(employeeCheck == fullTime)
      	employeeHrs = 16;
      else if (employeeCheck == partTime)
          employeeHrs=8;
      else
      	employeeHrs=0;
      
      employeeWage=employeeHrs *  employeeWagePerHrs;
      monthlyWage=employeeWage * workingDaysPerMonth;
      System.out.println("Employee Monthly Wage " + monthlyWage);
  }
  
  //Calculate Wages till a condition of total working hours or days is reached for a month
  void employeeTotalWage() {
	  	int wagePerHrs = 20;
	  	int maxWorkingDays=20;
	  	int maxWorkingHrs=100;
	  	int totalWage=0;
	  	int workingHrs=0;
	  	System.out.printf("%5s %5s %5s %5s\n", "day", "Workinghrs", "Wage", "Total working hrs");
	  	for (int day=1, totalWorkingHrs=0; day<=maxWorkingDays && totalWorkingHrs < maxWorkingHrs; day++, totalWorkingHrs += workingHrs)
	  	{
	  		int empType= (int) Math.floor(Math.random()*10)%3;
	  	    switch (empType)
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
		EmployeeWageComputation  Emp = new EmployeeWageComputation ();
		//Emp.checkEmployeeAttendence();
		//Emp.calculateEmployeeWage();
		//Emp.calculateEmployeePartTimeWage();
        //System.out.println(Emp.switchcase());
		//Emp.employeeMonthlyWage();
		  Emp.employeeTotalWage();
	}
}
