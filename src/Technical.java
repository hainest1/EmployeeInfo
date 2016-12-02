
public class Technical extends Employee
{
	protected int problemSolvingAbility;
	
	public Technical()
	{
		super();
		problemSolvingAbility = 0;
		
	}
	
	public Technical(String first, String last)
	{
		super(first, last);
		problemSolvingAbility = 0;
		
	}
	
	public Technical(String first, String last, int years)
	{
		super(first, last, years);
		problemSolvingAbility = 0;
		
	}
	
	public Technical(String first, String last, int years, int problemSolvingAbility)
	{
		super(first, last, years);
		this.problemSolvingAbility = problemSolvingAbility;
		
	}
	
	@Override
	public int computeSalary()
	{
		int bonus = 0;
		
		if (problemSolvingAbility == 1 || problemSolvingAbility == 2) bonus = 7500;
		else if (problemSolvingAbility == 3 || problemSolvingAbility == 4) bonus = 10000;
		else if (problemSolvingAbility == 5) bonus = 15000;
		else if (problemSolvingAbility == 6 || problemSolvingAbility == 7) bonus = 18000;
		else if (problemSolvingAbility == 8 || problemSolvingAbility == 9) bonus = 20000;
		else if (problemSolvingAbility > 9) bonus = 25000;
		
		//ask about this
		if (years <= 2 && bonus != 0) bonus = (int)(bonus * 0.25);
		
		if (years > 2) return 40000 + (int)((years - 2) * 0.03 * 40000) + bonus;
		else return 40000 + bonus;
		
	}
	
}
