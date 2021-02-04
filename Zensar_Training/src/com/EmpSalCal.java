package com;

public class EmpSalCal 
{
	public static float salaryDetails(Employee e, int eNo)
	{
		float sal = 0.0f;
		if(e.geteId() == eNo)
		{
			sal = e.calSal();
		}
		else
		{
			System.out.println("Invalid Employee");
			sal = 0.0f;
		}
		
		return sal;
	}
	public static void main(String[] args) 
	{
		// Data from client
		String designation = args[0];
		int eNo = Integer.parseInt(args[1]);
		Employee e = null;
		if(designation.equalsIgnoreCase("Employee"))
		{
			e = new Employee(11,"ABC",67000.f);
			System.out.println(salaryDetails(e,eNo));
		}
		
		if(designation.equalsIgnoreCase("Manager"))
		{
			e = new Manager(11,"ABC",67000.f,9000);
			System.out.println(salaryDetails(e,eNo));
		}

	}

}
