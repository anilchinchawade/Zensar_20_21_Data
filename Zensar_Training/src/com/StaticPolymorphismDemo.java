package com;

public class StaticPolymorphismDemo 
{
	public void add()
	{
		System.out.println("Add function to add two objects ");
	}
	
	public int add(int a,int b)
	{
		return a+b;
	}
	public float add(float a, float b)
	{
		return a+b;
	}
	
	public static void main(String[] args) 
	{
		StaticPolymorphismDemo d1 = new StaticPolymorphismDemo();
		d1.add();
		int r1 = d1.add(10, 20);
		System.out.println("Addition of integers:"+r1);
		
		float r2 = d1.add(10.5f, 20.7f);
		System.out.println("Addition of floats:"+r2);		
	}

}
