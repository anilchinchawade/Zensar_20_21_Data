package com;

public class Shape 
{
	protected String name;
	public Shape(String name) 
	{
		this.name = name;
	}
	
	public float calArea()
	{
		//This method has no meaningful implementation but it is required for achieving the dynamic polymorphism.
		//So we will make it abstract in next example
		return 0.0f;
	}
	
	protected String printShape()
	{
		return name;
	}
}

class Circle extends Shape
{
	protected float rad;
	
	public Circle(String name, float rad) 
	{
		super(name);
		this.rad = rad;		
	}
	
	public float calArea()
	{
		return 3.142f*rad*rad;		
	}	
	public static void main(String[] args)
	{
		Circle c1 = new Circle("Circle", 3.5f);
		double res = c1.calArea();
		System.out.println("The area of cirle is: "+res);
		System.out.println("The Shape is: "+c1.printShape());
		
		Shape s1 = new Shape("Void");
		res = s1.calArea();
		System.out.println("The area of cirle is: "+res);
		System.out.println("The Shape is: "+s1.printShape());
	}
}

