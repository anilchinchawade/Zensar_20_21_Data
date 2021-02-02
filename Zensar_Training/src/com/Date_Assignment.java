package com;

public class Date_Assignment 
{
	//Data Abstraction
	int dd,mm,yy;
	
	public void setDate(int d, int m, int y)
	{
		dd = d;
		mm = m;
		yy = y;
	}
	
	public boolean isLeap(int year)
	{
		boolean leap=false;
		if (year % 4 == 0) 
		{
		      // if the year is century
		      if (year % 100 == 0) 
		      {

		        // if year is divided by 400
		        // then it is a leap year
		        if (year % 400 == 0)
		          leap = true;
		        else
		          leap = false;
		      }
		      
		      // if the year is not century
		      else
		        leap = true;
		    }
		    
		    else
		      leap = false;
		return leap;
	}
	
	public void validateDate()
	{
		if(isLeap(yy)) 
		{
			if(mm==2 && dd<=29 && yy<2021)
			{
				System.out.println("Valid Date");
			}
			else if(mm==1 || mm==3 || mm==5 || mm==7 || mm==8 || mm==10 || mm==12)
			{
				if(dd<=31 && yy<2021)
				{
					System.out.println("Valid Date");
				}
			}
			else if(mm==4 || mm==6 || mm==9 || mm==11)
			{
				if(dd<=30 && yy<2021)
				{
					System.out.println("Valid Date");
				}
			}
		}
		else if(mm==2 && dd<=28 && yy<2021)
		{
			System.out.println("Valid Date");
		}
		else if(mm==1 || mm==3 || mm==5 || mm==7 || mm==8 || mm==10 || mm==12)
		{
			if(dd<=31 && yy<2021)
			{
				System.out.println("Valid Date");
			}
		}
		else if(mm==4 || mm==6 || mm==9 || mm==11)
		{
			if(dd<=30 && yy<2021)
			{
				System.out.println("Valid Date");
			}
		}
		else
			System.out.println("Invalid Date");
	}
	
	public void displayDate()
	{
		System.out.println("The date is: "+dd+"/"+mm+"/"+yy);
	}
	public static void main(String[] args) 
	{
		Date_Assignment d1 = new Date_Assignment();
		d1.setDate(29, 3, 2020);
		d1.displayDate();
		d1.validateDate();
	}
}
