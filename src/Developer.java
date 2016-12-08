/*
	Author: Thomas Haines
	Course: CSC260.002
	Date: 12/07/2016
	Assignment: #10
	Instructor: Fox
*/

/*
	Description: Developer class is a child of Technical class, and thus 
	inherits all methods and data from the parent class. Introduces
	numLanguages, an int indicating number of languages known, as well as 
	a mutator to add more languages. Overrides computeSalary of Technical 
	to add (500 * number of languages known) to the Technical class 
	computeSalary return value. Overrides toString to append the number 
	of languages known to the output of the base toString method.

*/

public class Developer extends Technical
{
	//class data
	protected int numLanguages;
	
	//0-arg constructor
	public Developer()
	{
		super();	//calls 0-arg of Developer
		numLanguages = 0;
		job = "Developer";
	}
	
	//2-arg constructor for first and last name
	public Developer(String first, String last)
	{
		super(first, last);	//calls 2-arg of Developer
		numLanguages = 0;
		job = "Developer";
	}
	
	//3-arg constructor for first, last name and years worked
	public Developer(String first, String last, int years)
	{
		super(first, last, years);	//calls 3-arg of Developer
		numLanguages = 0;
		job = "Developer";
	}
	
	//4-arg constructor for first, last name, years worked and problem solving ability
	public Developer(String first, String last, int years, int problemSolvingAbility)
	{
		super(first, last, years, problemSolvingAbility);	//calls 4-arg of Developer
		numLanguages = 0;
		job = "Developer";	
	}
	
	//4-arg constructor for first, last name, years worked, problem solving ability and number of languages known
	public Developer(String first, String last, int years, int problemSolvingAbility, int numLanguages)
	{
		super(first, last, years, problemSolvingAbility);
		this.numLanguages = numLanguages;
		job = "Developer";	
	}
	
	//add num languages to number of languages known if num > 0
	public void learnsNewLanguages(int num)
	{
		if (num > 0) numLanguages += num; 
	}
	
	//override computeSalary to add 500 for each language known
	@Override
	protected int computeSalary()
	{
		return super.computeSalary() + 500 * numLanguages;	//calls computeSalary of Technical
	}
	
	//override toString to include number of languages known
	@Override
	public String toString()
	{
		return super.toString() + "\nNumber of languages known: " + numLanguages;	//calls toString of Technical
	}
}