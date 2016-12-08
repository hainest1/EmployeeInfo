/*
	Author: Thomas Haines
	Course: CSC260.002
	Date: 12/07/2016
	Assignment: #10
	Instructor: Fox
*/

/*
	Description: Technical class is a parent class to other specific 
	technical employee types, and a child of Employee base class, and 
	thus inherits all methods and data from the parent class. Introduces
	problemSolvingAbility, an int indicating the level of problem
	solving ability of the employee. Overrides computeSalary of Employee 
	with an equation based on problem solving ability and years worked. 

*/

public class Technical extends Employee
{
	//class data
	protected int problemSolvingAbility;
	
	//0-arg constructor
	public Technical()
	{
		super();	//call 0-arg of Employee
		problemSolvingAbility = 0;
		job = "Technical";
	}
	
	//2-arg constructor for first and last name
	public Technical(String first, String last)
	{
		super(first, last);		//pass args to 2-arg of Employee
		problemSolvingAbility = 0;
		job = "Technical";
	}
	
	//3-arg constructor for first, last name and years worked
	public Technical(String first, String last, int years)
	{
		super(first, last, years);	//pass args to 3-arg of Employee
		problemSolvingAbility = 0;
		job = "Technical";
	}
	
	//4-arg constructor for first, last name, years, and problem solving ability
	public Technical(String first, String last, int years, int problemSolvingAbility)
	{
		super(first, last, years);	//pass args to 3-arg of Employee
		this.problemSolvingAbility = problemSolvingAbility;
		job = "Technical";
	}
	
	//override computeSalary to include a bonus based on problem solving ability
	@Override
	protected int computeSalary()
	{
		int bonus = 0;	//0 by default, in case of 0 problem solving
		
		//Adjust bonus based on problem solving ability
		if (problemSolvingAbility == 1 || problemSolvingAbility == 2) bonus = 7500;
		else if (problemSolvingAbility == 3 || problemSolvingAbility == 4) bonus = 10000;
		else if (problemSolvingAbility == 5) bonus = 15000;
		else if (problemSolvingAbility == 6 || problemSolvingAbility == 7) bonus = 18000;
		else if (problemSolvingAbility == 8 || problemSolvingAbility == 9) bonus = 20000;
		else if (problemSolvingAbility > 9) bonus = 25000;
		
		if (years > 2) return 40000 + (int)((years - 2) * 0.04 * 40000) + bonus;	//calculate salary and add full bonus if more than 2 years
		else return 40000 + (int)(bonus * 0.25);	//2 or less years worked gets 1/4 bonus
	}
}