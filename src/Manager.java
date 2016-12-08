/*
	Author: Thomas Haines
	Course: CSC260.002
	Date: 12/07/2016
	Assignment: #10
	Instructor: Fox
*/

/*
	Description: Manager class is a parent class to other specific 
	manager employee types, and a child of Employee base class, and 
	thus inherits all methods and data from the parent class. Introduces
	highestDegree, a string indicating the highest degree earned by the
	employee according to the order: other<BA<BS<MA<MS<MBA. Introduces
	a mutator for highestDegree that will check the new degree with the
	current highest according to the order above. Only mutated if the 
	new degree is higher than the current degree based on the order 
	above. Overrides computeSalary of Employee with an equation based 
	on highest degree earned and years worked. 

*/

public class Manager extends Employee
{
	//class data
	protected String highestDegree;
	
	//0-arg constructor
	public Manager()
	{
		super();	//Call 0-arg of Employee
		job = "Manager";
		highestDegree = "";
	}
	
	//2-arg constructor for first, last name
	public Manager(String first, String last)
	{
		super(first, last);	//Call 2-arg of Employee
		job = "Manager";
		highestDegree = "";
	}
	
	//3-arg constructor for first, last name, years worked
	public Manager(String first, String last, int years)
	{
		super(first, last, years);	//Call 3-arg of Employee
		job = "Manager";
		highestDegree = "";
	}
	
	//4-arg constructor for first, last name, years worked and highest degree
	public Manager(String first, String last, int years, String highestDegree)
	{
		super(first, last, years);	//Call 3-arg of Employee
		this.highestDegree = highestDegree;
		job = "Manager";
	}
	
	//override computeSalary to base it on the highest degree earned
	@Override
	protected int computeSalary()
	{
		//terms for salary equation
		int a;
		double b;
		
		//check highest degree type, set terms a,b accordingly
		if (highestDegree.equals("MBA")) {	a = 50000;	b = 0.07;	}
		else if (highestDegree.equals("MS")) {	a = 45000;	b = 0.05;	}
		else if (highestDegree.equals("MA")) {	a = 45000;	b = 0.04;	}
		else if (highestDegree.equals("BS")) {	a = 42000;	b = 0.03;	}
		else if (highestDegree.equals("BA")) {	a = 35000;	b = 0.03;	}
		else return 35000 + (int)(years * 0.02 * 30000);	//All other degree values are considered lowest
		
		return a + (int)(years * b * a);	//return calculated salary
	}
	
	//set highestDegree to newDegree if it is higher priority according to isBetterThan
	public void setHighestDegree(String newDegree)
	{
		if (isBetterThan(newDegree)) highestDegree = newDegree;
	}
	
	//checks degree against current highestDegree, based on
	//other<BA<BS<MA<MS<MBA. if they are equal or less, returns false
	protected boolean isBetterThan(String degree)
	{
		//Check for each case of degree being tested against the highest
		if (degree.equals("MBA"))
		{
			if (highestDegree.equals("MBA")) return false;	//check for higher degree
			else return true;	//anything besides MBA is considered lower
		}
		
		else if (degree.equals("MS"))
		{
			if (highestDegree.equals("MBA")) return false;
			else if (highestDegree.equals("MS")) return false;
			else return true;	//anything besides MBA,MS is lower
		}
		
		else if (degree.equals("MA"))
		{
			if (highestDegree.equals("MBA")) return false;
			else if (highestDegree.equals("MS")) return false;
			else if (highestDegree.equals("MA")) return false;
			else return true;	//anything besides MBA,MS,MA is lower
		}
		
		else if (degree.equals("BS"))
		{
			if (highestDegree.equals("MBA")) return false;
			else if (highestDegree.equals("MS")) return false;
			else if (highestDegree.equals("MA")) return false;
			else if (highestDegree.equals("BS")) return false;
			else return true;	//anything besides MBA,MS,MA,BS is lower
		}
		
		else if (degree.equals("BA"))
		{
			if (highestDegree.equals("MBA")) return false;
			else if (highestDegree.equals("MS")) return false;
			else if (highestDegree.equals("MA")) return false;
			else if (highestDegree.equals("BS")) return false;
			else if (highestDegree.equals("BA")) return false;
			else return true;	//anything besides MBA,MS,MA,BS,BA is lower
		}
		
		else return false;	//an unrecognized degree cannot take precedence over the current degree

	}
	
	//override toString to include highest degree
	@Override
	public String toString()
	{
		return super.toString() + "\nHighest degree: " + highestDegree;	//calls toString of Employee and adds highest degree
	}
}