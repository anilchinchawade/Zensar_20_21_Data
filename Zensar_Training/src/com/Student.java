package com;

public class Student 
{
	// Data Abstraction
	private int rollNo;
	private String name;
	private Date birthDate;
	
	public Student(int rollNo, String name, Date birthDate)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.birthDate = birthDate;
	}
	
	public void wish()
	{
		//Here dd mm yy are not directly accessible as they are private
		//Don't make them public instead use them with getter methods
		//System.out.println("My Students birthday is on: "+birthDate.getDd()+"/"+birthDate.getMm()+"/"+birthDate.getYy());
		System.out.println("My Students birthday is on: "+birthDate);
		System.out.println("Happy Birthday..."+name);		
	}
	
	public int ageCal()
	{
		int currentYear = 2021;
		return currentYear - birthDate.getYy();
	}
	
	public String toString()
	{
		return "The Student details are: "+rollNo+"/"+name+"/"+birthDate;
	}
	
	public static void main(String[] args) 
	{		
		Student s1 = new Student(1,"Anil",new Date(10,07,1984));
		//System.out.println(s1);
		s1.wish();
		System.out.println("My student is "+s1.ageCal()+" Years old!");
		
		//Change Birthday
		s1.birthDate.setDd(25);
		s1.birthDate.setMm(10);
		s1.wish();
		System.out.println("My student is "+s1.ageCal()+" Years old!");
	}

}
