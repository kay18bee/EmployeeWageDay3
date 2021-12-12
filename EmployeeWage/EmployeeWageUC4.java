package EmployeeWage;

import java.util.Random;

public class EmployeeWageUC4 {

	static final int Emp_Rate=20; 
    static final int part_time=0;
	static final int full_time=1;  
	
	static int dailyWageUsingSwitch() {
		
		int Hours = 0;
		int emp_wage = 0;
		Random r = new Random();
		int emp_type = r.nextInt(2); 
		switch (emp_type) {
		case full_time: 
				 Hours = 8;
				 break;
		case part_time:
			 	 Hours = 4;
			 	 break;
		default: 
			     Hours=0;
		
		}
	emp_wage= Emp_Rate*Hours;
	System.out.println("Wage of the employee is: "+emp_wage);
		
		return 0;
	}
	
	public static void main(String[] args) {
	
		dailyWageUsingSwitch();
	
	}
	
}
