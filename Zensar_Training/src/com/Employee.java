package com;

public class Employee 
{
	protected int eId;
	protected String eName;
	protected float eSal;
	
	
	public Employee(int eId, String eName, float eSal) 
	{		
		this.eId = eId;
		this.eName = eName;
		this.eSal = eSal;
		System.out.println("Parents default Constructor");
	}	
	
	public int geteId() 
	{
		return eId;
	}

	public String geteName() 
	{
		return eName;
	}

	public float geteSal() 
	{
		return eSal;
	}

	public void seteId(int eId) 
	{
		this.eId = eId;
	}

	public void seteName(String eName) 
	{
		this.eName = eName;
	}

	public void seteSal(float eSal) 
	{
		this.eSal = eSal;
	}

	public float calSal()
	{
		return eSal*12;
	}
	
	public final void policy()
	{
		System.out.println("Policy made for all employees");
	}
}

class Manager extends Employee
{
	protected int incentive;
	
	public Manager(int eId, String eName, float eSal, int inc)
	{
		super(eId,eName,eSal);
		System.out.println("Childs default Constructor");
		incentive = inc;
	}
	
	public float calSal()
	{
		float basicSal = super.calSal();
		return basicSal+(12*incentive);
	}
	public void details()
	{
		System.out.println("Details are: "+eId+","+eName+","+eSal);
		
	}
	
	//Cannot override the final method of Super class
	/*
	 * public void policy() { System.out.println("Managers own policy"); }
	 */
	 
	
	public static void main(String[] args)
	{
		Manager m1 = new Manager(10,"ABC",50000.0f,9000);
		System.out.println("My package is: "+m1.calSal());
		m1.details();
		// child reference can access final methods
		m1.policy();
	}
	
}
