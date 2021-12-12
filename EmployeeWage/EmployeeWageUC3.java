package EmployeeWage;

import java.util.Random;

public class EmployeeWageUC3 {
	
	static int dailyWageCalculatorType2() {
		
		int Hours=0;
	    int part_time=0;
	    int full_time=1;
		Random r = new Random();
		int emp_type = r.nextInt(2); 
		if (emp_type == part_time) {
			 Hours=4;
		}else if (emp_type == full_time) {
	    	 Hours=8;
	    }else {
	    	 Hours=0;
	    }
	int emp_wage= Hours*20;
	System.out.println("Wage of the employee is: "+emp_wage);
		
		return 0;
	}
	
	public static void main(String[] args) {
		dailyWageCalculatorType2();
	}

}
