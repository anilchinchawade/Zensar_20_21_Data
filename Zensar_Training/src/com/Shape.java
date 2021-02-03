package com;

public abstract class Shape 
{
	protected String name;
	public Shape(String name) 
	{
		this.name = name;
	}
	
	// To represent generic method we mark it as abstract a it does not have any meaningful implementation.
	public abstract float calArea();
	
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
		//System.out.println(super.calArea());
		return 3.142f*rad*rad;		
	}	
	public static void main(String[] args)
	{
		Circle c1 = new Circle("Circle", 3.5f);
		double res = c1.calArea();
		System.out.println("The area of circle is: "+res);
		System.out.println("The Shape is: "+c1.printShape());
		
		//You are not allowed to create an object of abstract class so it removes drawback of calling parent class method with no meaningful implementation
		/*
		 * Shape s1 = new Shape("Void"); res = s1.calArea();
		 * System.out.println("The area of circle is: "+res);
		 * System.out.println("The Shape is: "+s1.printShape());
		 */
		 
	}
}

