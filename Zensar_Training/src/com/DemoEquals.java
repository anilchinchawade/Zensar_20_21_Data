package com;

public class DemoEquals 
{
	private int age, marks;
	
	public DemoEquals(int age, int marks) 
	{
		this.age = age;
		this.marks = marks;
	}
	
	public static void main(String[] args) 
	{
		DemoEquals d1 = new DemoEquals(10,70);
		DemoEquals d2 = new DemoEquals(10,70);
		if(d1 == d2)
		{
			System.out.println("Objects are Same");
		}
		else
		{
			System.out.println("Objects are different");
		}
		
		//Gives output as different because == compare references & primitives so as d1 & d2 are two different references it consider them as different.
		
		if(d1.equals(d2))
		{
			System.out.println("Objects are Same");
		}
		else
		{
			System.out.println("Objects are different");
		}
		
		//Gives output as different because equals method with ref d1 is using the equals method of super cosmic class Object, As parent class i.e. Object class has no visibility to subclas data members so it cant compare contents.
	}

}
