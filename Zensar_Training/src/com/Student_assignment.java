package com;

public class Student_assignment 
{
	//Data Abstraction
	int rollNo;
	String name;
	int m1,m2,m3;
	float avg=0.0f;
	
	public void setData(int rno, String n,int m1, int m2, int m3)
	{
		rollNo = rno;
		name = n;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
	public void calcAverage()
	{
		this.avg = (m1+m2+m3)/3;
	}
	
	public void printGrade() 
	{
		if(avg >= 80 && avg <= 100)
		{
			System.out.println("Grade A++");
		}
		else if(avg >= 60 && avg < 80)
		{
			System.out.println("Grade A");
		}
		else if(avg >= 40 && avg < 60)
		{
			System.out.println("Grade B");
		}
		else if(avg < 40)
		{
			System.out.println("FAIL");
		}
		
	}

	public static void main(String[] args) 
	{
		Student_assignment s1 = new Student_assignment();
		s1.setData(10, "Aarush", 98, 97, 99);
		
		s1.calcAverage();
		s1.printGrade();
		System.out.println("Program Ends Here");
	}

}
