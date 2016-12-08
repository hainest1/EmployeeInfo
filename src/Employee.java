/*
	Author: Thomas Haines
	Course: CSC260.002
	Date: 12/07/2016
	Assignment: #10
	Instructor: Fox
*/

/*
	Description: Base employee class. All other employee types will
	inherit from this class. Contains data for name, job title and 
	number of years. Has accessors for first name, last name, job, 
	and years worked. Can compute salary based on years worked,
	which can be output alongside the name and job in the toString 
	method.

*/

public class Employee 
{
	//class data
	protected String first, last, job;
	protected int years;
	
	//0-arg constructor
	public Employee()
	{
		this("unknown", "unknown", 0);	//calls 3-arg constructor of this class with unknown name
	}
	
	//2-arg constructor, takes first and last name
	public Employee(String first, String last)
	{
		this(first, last, 0);	//calls 3-arg constructor of this class
	}
	
	//3-arg constructor, takes first and last name and years worked
	public Employee(String first, String last, int years)
	{
		this.first = first;
		this.last = last;
		this.years = years;
		job = "unknown";	
	}
	
	//return first name as a string
	public String getFirst()
	{
		return first;		
	}
	
	//return last name as a string
	public String getLast()
	{
		return last;		
	}
	
	//return job title as a string
	public String getJob()
	{
		return job;		
	}
	
	//return years worked as an int
	public int getYears()
	{
		return years;		
	}
	
	//compute salary based on years worked
	protected int computeSalary()
	{
		if (years > 2) return 30000 + (int)((years - 2) * 0.03 * 30000);	//more than 2 years, increase salary based on years worked according to the equation
		else return 30000;
	}
	
	//returns formatted info about the instance as a string
	public String toString()
	{
		return "Name: " + first + " " + last + "\nJob: " + job + "\nSalary: $" + computeSalary();	
	}	
}