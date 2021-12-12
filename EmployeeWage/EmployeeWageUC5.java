package EmployeeWage;

import java.util.Random;

public class EmployeeWageUC5 {
	
	static final int Emp_Rate=20; 
    static final int part_time=0;
	static final int full_time=1;
	
	static int monthlyWageCalculator() {
		
		int Hours = 0;
		int emp_wage = 0;
		int total_wage=0;
		for (int days=1; days<=20; days++) {
					
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
	
	emp_wage= Emp_Rate*Hours*days;
	total_wage= total_wage + emp_wage;
	}
    System.out.println("Total monthly wage is: "+total_wage);
		
		return 0;
	}
	
	public static void main(String[] args) {
	
	monthlyWageCalculator();
		
	}
	
}
