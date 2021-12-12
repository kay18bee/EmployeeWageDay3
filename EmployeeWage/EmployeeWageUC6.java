package EmployeeWage;

import java.util.Random;

public class EmployeeWageUC6 {
	
	static final int Emp_Rate=20; 
    static final int part_time=0;
	static final int full_time=1; 
	static final int max_hours=100;
	static final int max_days=20;
	
	public static void main(String[] args) {
		int emp_wage = 0;
		int total_wage=0;
		int total_hours=0;
		int days;
		for (days = 1; days<=max_days; days++) 
		{
		if(total_hours<=max_hours)	
		{	
		Random r = new Random();
		int emp_type = r.nextInt(2); 
		switch (emp_type) {
		case full_time: 
			           total_hours=total_hours+8;	 
       				   break;
		case part_time:
			           total_hours=total_hours+4;	 
			 	       break;
		default: 
			    total_hours=total_hours+0;	 
		
		}	
					
		emp_wage= Emp_Rate*total_hours;
		total_wage= total_wage + emp_wage;
		
		}
		
		}
	    
	    System.out.println("Total monthly wage is: "+total_wage);

		
		
	}


}
