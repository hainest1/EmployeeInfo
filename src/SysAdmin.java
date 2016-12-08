/*
	Author: Thomas Haines
	Course: CSC260.002
	Date: 12/07/2016
	Assignment: #10
	Instructor: Fox
*/

/*
	Description: SysAdmin class is a child of Technical class, and thus 
	inherits all methods and data from the parent class. Introduces
	knowsLinux, a boolean indicating whether or not the employee knows 
	Linux, as well as a mutator to alter this value to true if false.
	Overrides computeSalary of Technical to increase the Technical 
	class computeSalary return value by 10% if they know Linux, 
	otherwise no increase. Overrides toString to append whether or not 
	they know Linux to the base toString method.

*/

public class SysAdmin extends Technical
{
	//class data
	protected boolean knowsLinux;
	
	//0-arg constructor
	public SysAdmin()
	{
		super();	//calls 0-arg of Technical
		knowsLinux = false;
		job = "System administrator";
	}
	
	//2-arg constructor for first and last name
	public SysAdmin(String first, String last)
	{
		super(first, last);	//calls 2-arg of Technical
		knowsLinux = false;
		job = "System administrator";
	}
	
	//3-arg constructor for first, last name and years worked
	public SysAdmin(String first, String last, int years)
	{
		super(first, last, years);	//calls 3-arg of Technical
		knowsLinux = false;
		job = "System administrator";
	}
	
	//4-arg constructor for first, last name, years worked, problem solving
	public SysAdmin(String first, String last, int years, int problemSolvingAbility)
	{
		super(first, last, years, problemSolvingAbility);	//calls 4-arg of Technical
		knowsLinux = false;
		job = "System administrator";
	}
	
	//5-arg constructor for first, last name, years worked, problem solving and if they know Linux
	public SysAdmin(String first, String last, int years, int problemSolvingAbility, boolean knowsLinux)
	{
		super(first, last, years, problemSolvingAbility);	//calls 4-arg of Technical
		this.knowsLinux = knowsLinux;
		job = "System administrator";
	}
	
	//4-arg constructor for first, last name, problem solving and if they know Linux
	public SysAdmin(String first, String last, int problemSolvingAbility, boolean knowsLinux)
	{
		super(first, last, 0, problemSolvingAbility);	//calls 4-arg of Technical
		this.knowsLinux = knowsLinux;
		job = "System administrator";
	}
	
	//indicate that the employee knows linux if they didn't already
	public void learnsLinux()
	{
		if (knowsLinux == false) knowsLinux = true;
	}
	
	//override computeSalary to account for Linux knowledge
	@Override
	protected int computeSalary()
	{
		//if they know Linux, increase return value of Technical's computeSalary by 10%
		if (knowsLinux == true) return (int)(super.computeSalary() * 1.1);
		else return super.computeSalary();
	}
}