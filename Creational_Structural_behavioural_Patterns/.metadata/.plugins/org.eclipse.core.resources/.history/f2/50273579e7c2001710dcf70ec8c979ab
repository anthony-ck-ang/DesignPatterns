package dao;

import java.util.ArrayList;
import java.util.List;

import domain.Employee;

public class EmployeeDAO {
	/*
	 * Just a mock DAO class that creates employee objects 
	 * and save them to a list (collections)
	 * instead of a database.
	 * An actual DAO/Database implementation can be implemented here if needed.
	 * eg: JDBC/ JPA
	 * */
	Employee emp1 = new Employee("Mike", null, 5000, false);
	Employee emp2 = new Employee("Steve", null, 4500, false);
	Employee emp3 = new Employee("John", null, 7000, false);
	Employee emp4 = new Employee("Pat", null, 6000, false);
	Employee emp5 = new Employee("Joe", null, 8000, false);
	
	//Declare
	List<Employee> employees;

	public List<Employee> generateEmployees(){
		
		//Instantiate
		employees = new ArrayList<Employee>();
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		
		return employees;
		
	}
	
	public void addEmployee(Employee emp){
		employees.add(emp);
	}
	
}
