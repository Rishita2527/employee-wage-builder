package com.bridgelabz;

public class EmployeeWageMultipleCompanies {
         public static void calculateEmployeeWage(String companyName, int empWagePerHr, int maxWorkingDays, int maxWorkingHrs)
	    {
	        int monthlyEmpWage = 0;
	        int totalWorkingDays = 0;
	        int totalEmpHrs = 0;
	        while (totalWorkingDays < maxWorkingDays && totalEmpHrs < maxWorkingHrs)
	        {
	        	int empHrs=0;
	        	int dailyEmpWage=0;
	            int empCheck = (int) (Math.random() * 100) % 3;
	            switch (empCheck)
	            {
	                case 1:
	                    empHrs = 8;
	                    totalWorkingDays++;
	                    break;
	                case 2:
	                    empHrs = 4;
	                    totalWorkingDays++;
	                    break;
	                default:
	                    empHrs = 0;
	            }
	            dailyEmpWage = empWagePerHr * empHrs;
	            totalEmpHrs += empHrs;
	            monthlyEmpWage += dailyEmpWage;
	        }
	        System.out.println("Total wage for a month of " + companyName + " employee is " + monthlyEmpWage + "\n" + "Total Working Hrs: " + totalEmpHrs + "\n" + "Total working days: "+ totalWorkingDays);
	    }
	    public static void main(String args[])
	    {
	        calculateEmployeeWage("Myntra", 40, 15, 200);
	        calculateEmployeeWage("Flipkart", 20, 20, 100);
	    }
	    }