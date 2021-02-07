package com;

public class DemoEquals 
{
	private int age, marks;
	
	public DemoEquals(int age, int marks) 
	{
		this.age = age;
		this.marks = marks;
	}
	
	public boolean equals(Object obj)
	{
		//Obj is down casted to DemoEquals as obj has no visibility to child class data members
		DemoEquals ob = (DemoEquals) obj;
		if(ob.age == age && ob.marks == marks)
		{
			return true;
		}
		else
			return false;
	}
	
	public static void main(String[] args) 
	{
		DemoEquals d1 = new DemoEquals(10,70);
		DemoEquals d2 = new DemoEquals(10,70);
		System.out.println("Object d1 is: "+d1);
		System.out.println("Object d2 is: "+d2);
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
		
		//Now Gives output as same because equals method of super cosmic class Object is overridden.
	}

}
