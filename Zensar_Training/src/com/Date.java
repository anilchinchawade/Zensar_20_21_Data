package com;

public class Date 
{
	//Data Abstraction
	private int dd,mm,yy;
	
	//1...Initialize data
	public Date(int dd, int mm, int yy)
	{
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;		
	}
	
	//2...Setters to update the data
	public void setDd(int dd)
	{
		this.dd = dd;
	}
	public void setMm(int mm)
	{
		this.mm = mm;
	}
	public void setYy(int yy)
	{
		this.yy = yy;
	}
	
	//3...Getters to get the data
	public int getDd()
	{
		return this.dd;
	}
	public int getMm()
	{
		return this.mm;
	}
	public int getYy()
	{
		return this.yy;
	}

	//4...toSting method to display contents of the object
	public String toString()
	{
		return dd+"/"+mm+"/"+yy;
	}
	
	
}
