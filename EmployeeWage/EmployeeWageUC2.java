package EmployeeWage;

import java.util.Random;

public class EmployeeWageUC2 {
	public static final int Emp_Rate=20;
	public static final int Work_Hours = 8;
	
	static int dailyWageCalculator() {
		int Present=1;
		Random r = new Random();
		int attendance = r.nextInt(2);
		if (attendance == Present) {
			int Emp_Wage = Emp_Rate*Work_Hours;
			System.out.println("Employee Wage for today is: "+ Emp_Wage);
		}else {
		    System.out.println("Employee is absent so wage is zero for today.");
			
		}
	    return 0;
	}
	

	public static void main(String[] args) {
	
		dailyWageCalculator();
	}	
}
	