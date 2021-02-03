package com;

public abstract class Shape 
{
	protected String name;
	public Shape(String name) 
	{
		this.name = name;
	}
	
	public abstract float calArea();
	
	protected String printShape()
	{
		return name;
	}
}

class Circle extends Shape
{
	private float rad;
	
	public Circle(String name, float rad) 
	{
		super(name);
		this.rad = rad;		
	}
	
	public float calArea()
	{
		return 3.142f*rad*rad;		
	}	
}

class Square extends Shape
{
	private int side; 
	public Square(String name, int side)
	{
		super(name);
		this.side = side;
		
	}
	
	public float calArea()
	{
		return side*side;
	}
}

class Triangle extends Shape
{
	private int height, base;
	public Triangle(String name, int height, int base)
	{
		super(name);
		this.height = height;
		this.base = base;
	}
	
	public float calArea()
	{
		return 0.5f*height*base;
	}
	
}

class EntryPoint
{
	public static void main(String[] args)
	{
		Circle c1 = new Circle("Circle", 3.5f);
		double res = c1.calArea();
		System.out.println("The area of circle is: "+res);
		System.out.println("The Shape is: "+c1.printShape());
		
		Square s1 = new Square("Square",7);
		res = s1.calArea();
		System.out.println("The area of square is: "+res);
		System.out.println("The Shape is: "+s1.printShape());
		
		Triangle t1 = new Triangle("Triangle", 3, 5);
		res = t1.calArea();
		System.out.println("The area of circle is: "+res);
		System.out.println("The Shape is: "+t1.printShape());
	}
}

