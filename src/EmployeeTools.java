/*
	Author: Thomas Haines
	Course: CSC260.002
	Date: 12/07/2016
	Assignment: #10
	Instructor: Fox
*/

/*
	Description: User class for managing Employees. Creates an 
	ArrayList of Employee objects and prints their status using 
	toString. Mutates languages for Developers, Linux knowledge 
	for SysAdmins, and highest degree for Managers, only if they 
	are correctly identified as their respective types using an
	iterator for loop over the ArrayList and casting to the 
	appropriate type when necessary. Then, it prints the new 
	status of each Employee to compare with the original status.

*/

import java.util.*;

public class EmployeeTools 
{
	public static void main(String[] args) 
	{
		ArrayList<Employee> employees = new ArrayList<Employee>();	//ArrayList of Employees
		Random g = new Random();
		
		//add some employees to ArrayList
		employees.add(new Technical("George", "Duke", 15));	
		employees.add(new Employee("Mike", "Keneally"));
		employees.add(new Developer("Gail", "Zappa", 6, 5, 4));
		employees.add(new Manager("Thana", "Harris", 3, "BA"));
		employees.add(new SysAdmin("Ruth", "Underwood", 4, 10, false));
		employees.add(new Manager("Frank", "Zappa", 16, "MS"));
		employees.add(new Technical("Ed", "Mann", 1, 2));
		employees.add(new SysAdmin("Ian", "Underwood", 4, 3, true));
		employees.add(new Manager("Lainey", "Schooltree", 8, "MBA"));
		
		for(Employee e: employees) System.out.println(e + "\n");	//print the employees in their current state
		
		//update info on the employees
		for (Employee e: employees)
		{
			if (e instanceof Developer) ((Developer)e).learnsNewLanguages(g.nextInt(6));	//all devs learn 0-5 languages
			if (e instanceof SysAdmin) ((SysAdmin)e).learnsLinux();	//all SysAdmin learn linux
			if (e instanceof Manager) ((Manager)e).setHighestDegree("MS");	//all managers degree MS or higher
		}
		
		System.out.println("-------------------");
		for(Employee e: employees) System.out.println(e + "\n");	//print the employees in their updated state
	}
}

/*
	Output: 
	Name: George Duke
	Job: Technical
	Salary: $60800
	
	Name: Mike Keneally
	Job: unknown
	Salary: $30000
	
	Name: Gail Zappa
	Job: Developer
	Salary: $63400
	Number of languages known: 4
	
	Name: Thana Harris
	Job: Manager
	Salary: $38150
	Highest degree: BA
	
	Name: Ruth Underwood
	Job: System administrator
	Salary: $68200
	
	Name: Frank Zappa
	Job: Manager
	Salary: $81000
	Highest degree: MS
	
	Name: Ed Mann
	Job: Technical
	Salary: $41875
	
	Name: Ian Underwood
	Job: System administrator
	Salary: $58520
	
	Name: Lainey Schooltree
	Job: Manager
	Salary: $78000
	Highest degree: MBA
	
	-------------------
	Name: George Duke
	Job: Technical
	Salary: $60800
	
	Name: Mike Keneally
	Job: unknown
	Salary: $30000
	
	Name: Gail Zappa
	Job: Developer
	Salary: $64900
	Number of languages known: 7
	
	Name: Thana Harris
	Job: Manager
	Salary: $51750
	Highest degree: MS
	
	Name: Ruth Underwood
	Job: System administrator
	Salary: $75020
	
	Name: Frank Zappa
	Job: Manager
	Salary: $81000
	Highest degree: MS
	
	Name: Ed Mann
	Job: Technical
	Salary: $41875
	
	Name: Ian Underwood
	Job: System administrator
	Salary: $58520
	
	Name: Lainey Schooltree
	Job: Manager
	Salary: $78000
	Highest degree: MBA
*/