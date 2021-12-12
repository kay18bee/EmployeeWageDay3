package EmployeeWage;

import java.util.Random;

public class EmployeeWageUC1 {
	
	static int presenceChecker() {
		
		Random r = new Random();
		int attendance = r.nextInt(2);
		if (attendance == 1) 
		{
			System.out.println("Employee is present.");
			
		}else {
				System.out.println("Employee is absent.");
		}	

		return attendance;
		
	}

	public static void main(String[] args) {
	
	presenceChecker();
	
		
	}
}
