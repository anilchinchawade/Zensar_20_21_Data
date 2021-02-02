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
	
	public float calSal()
	{
		return eSal*12;
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
	
	public void details()
	{
		System.out.println("Details are: "+eId+","+eName+","+eSal);
		
	}
	public static void main(String[] args)
	{
		Manager m1 = new Manager(10,"ABC",50000.0f,9000);
		System.out.println("My basic package is: "+m1.calSal());
		m1.details();		
	}
	
}
