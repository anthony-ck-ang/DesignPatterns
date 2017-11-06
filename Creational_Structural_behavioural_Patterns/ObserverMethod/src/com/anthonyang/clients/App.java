package com.anthonyang.clients;

import java.util.Date;

import com.anthonyang.domain.Employee;
import com.anthonyang.observers.HRDepartment;
import com.anthonyang.observers.IObserver;
import com.anthonyang.observers.PayrollDepartment;
import com.anthonyang.subjects.EmployeeManagementSystem;

public class App {

	public static void main(String [] args){
		
		//create objects classes(departments) that implements (registered)
		//for notification service or as observer to a subject.
		IObserver payroll = new PayrollDepartment();
		IObserver hrSystem = new HRDepartment();
		
		EmployeeManagementSystem ems = new EmployeeManagementSystem();
		
		//register observers
		ems.registerObserver(payroll);
		ems.registerObserver(hrSystem);
		
		 Employee bob = new Employee("Bob", new Date(), 50000, true);
		 ems.hireNewEmployee(bob);
		 
		 
		ems.modifyEmployeeName(5, "sam");
	 // ems.modifyEmployeeName(2, "sam");
	}
}
