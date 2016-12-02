


public class Employee 
{
	protected String first, last, job;
	protected int years;
	
	public Employee()
	{
		this("unknown", "unknown", 0);
		
	}
	
	public Employee(String first, String last)
	{
		this(first, last, 0);
		
	}
	
	public Employee(String first, String last, int years)
	{
		this.first = first;
		this.last = last;
		this.years = years;
		job = "unknown";
		
	}
	
	public String getFirst()
	{
		return first;
		
	}
	
	public String getLast()
	{
		return last;
		
	}
	
	public String getJob()
	{
		return job;
		
	}
	
	public int getYears()
	{
		return years;
		
	}
	
	protected int computeSalary()
	{
		if (years > 2) return 30000 + (int)((years - 2) * 0.03 * 30000);
		else return 30000;

	}
	
	public String toString()
	{
		return "Name: " + first + " " + last + "\nJob: " + job + "\nSalary: " + computeSalary();
		
	}
	
}
