package com;

public class Student 
{
	// Data Abstraction
	private int rollNo;
	private String name;
	private Date birthDate;
	private static int rollSeries;
	
	static
	{
		rollSeries=1;
	}	
	
	public Student(String name, Date birthDate)
	{
		this.rollNo = rollSeries;
		this.name = name;
		this.birthDate = birthDate;
		rollSeries++;
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
	
	public static int getCal()
	{
		return rollSeries-1;
	}
	
	public String toString()
	{
		return "The Student details are: "+rollNo+"/"+name+"/"+birthDate;
	}
	
	public static void main(String[] args) 
	{		
		Student s1 = new Student("Anil",new Date(10,07,1989));
		Student s2 = new Student("Abhijeet",new Date(02,07,1996));
		Student s3 = new Student("Arun",new Date(01,02,1997));
		Student s4 = new Student("Aaradhya",new Date(15,10,2010));
		Student s5 = new Student("Amit",new Date(30,07,2001));	
		System.out.println("The age of "+s1.rollNo+" is "+s1.ageCal());
		System.out.println("The age of "+s2.rollNo+" is "+s2.ageCal());
		System.out.println("The age of "+s3.rollNo+" is "+s3.ageCal());
		System.out.println("The age of "+s4.rollNo+" is "+s4.ageCal());
		System.out.println("The age of "+s5.rollNo+" is "+s5.ageCal());
		System.out.println("The number of students are: "+ getCal());
	}

}
