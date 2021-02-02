package com;

// For Containment concept with Date class 
public class Account 
{
	// Data Abstraction
	private int accNo;
	private String accType;
	private float accBal;
	private Date accOpeningDate;
	
	//Constructor for initialization
	public Account() 
	{
		accNo = 100;
		accType = "Savings";
		accBal = 40000.0f;
	}
	
	public Account(int accNo, String accType,float accBal) 
	{
		//Shadowing effect is removed using this reference
		this.accNo = accNo;
		this.accType = accType;
		this.accBal = accBal;
		System.out.println("Data inside constructor:Account Number: "+accNo+"\nAccount Type: "+accType+"\nAccount balance:"+accBal);
		
		//If we print only this reference then also we get object content as it refers to current object.
		System.out.println(this);
	}
	
	public int openAccount(String accType, float amount)
	{
		this.setAccNo(101);
		this.setAccBal(amount);
		this.setAccType(accType);
		this.accOpeningDate = new Date(10,01,2021);
		return this.getAccNo();
	}
	
	
	//Updation of the data using setter method
	
	public void setAccNo(int accNo)
	{
		this.accNo = accNo;
	}	
	public void setAccType(String accType)
	{
		this.accType = accType;
	}	
	public void setAccBal(float accBal) 
	{
		this.accBal = accBal;
	}
	
	
	//getter to get object data
	public int getAccNo()
	{
		return accNo;
	}	
	public String getAccType()
	{
		return accType;
	}	
	public float getAccBal() 
	{
		return accBal;
	}

	//Business Logic Method
	
	public float deposit(int no,float amount)
	{
		float updatedBal=0.0f;
		if(accNo==no)
		{
			accBal+=amount;
			updatedBal = accBal;
		}
		else
		{
			System.out.println("Wrong Account Number");
		}
		
		return updatedBal;
	}
	
	public float withdrawl(int accNo, float amount)
	{
		float updatedBal = 0.0f;
		if(this.accNo == accNo)
		{
			if(amount<accBal)
			{
				accBal-=amount;
				updatedBal = accBal;
			}
			else
			{
				System.out.println("Insufficient Balance");
			}			
		}
		else
		{
			System.out.println("Wrong Account Number");
		}
		return updatedBal;
	}
	
	public float balanceEnquiry(int accNo)
	{
		if(this.accNo == accNo)
		{
			return this.accBal;
		}
		else
		{
			System.out.println("Wrong Account Number");
			return 0;
		}
	}
	
	//Facilitator method as its facilitating us to print the data on Console
	public void PrintAccountDetails()
	{
		System.out.println("The Account Details are:Account Number: "+accNo+"\nAccount Type: "+accType+"\nAccount balance:"+accBal);
	}
	
	//Method to display contents of object with reference
	public String toString()
	{
		return "The Account Details are:Account Number: "+accNo+"\nAccount Type: "+accType+"\nAccount balance:"+accBal;
	}
	
	public static void main(String[] args) 
	{
		Account a1 = new Account(100, "Savings", 95000.0f);
		// It will print the address of reference variable a1 and we can use this to print the object contents
		System.out.println(a1);
		
		Account a2 = new Account();
		int accNo = a2.openAccount("Current", 50000);
		System.out.println("Congratulation your account is created");
		System.out.println(a2);
	}	
}

//// With this operator
//public class Account 
//{
//	// Data Abstraction
//	int accNo;
//	String accType;
//	float accBal;
//	
//	//Constructor for initialization
//	public Account() 
//	{
//		accNo = 100;
//		accType = "Savings";
//		accBal = 40000.0f;
//	}
//	
//	public Account(int accNo, String accType,float accBal) 
//	{
//		//Shadowing effect is removed using this reference
//		this.accNo = accNo;
//		this.accType = accType;
//		this.accBal = accBal;
//		System.out.println("Data inside constructor:Account Number: "+accNo+"\nAccount Type: "+accType+"\nAccount balance:"+accBal);
//		
//		//If we print only this reference then also we get object content as it refers to current object.
//		System.out.println(this);
//	}
//	
//	//Updation of the data using setter method
//	
//	public void setAccNo(int accNo)
//	{
//		this.accNo = accNo;
//	}	
//	public void setAccType(String accType)
//	{
//		this.accType = accType;
//	}	
//	public void setAccBal(float accBal) 
//	{
//		this.accBal = accBal;
//	}
//	
//	
//	//getter to get object data
//	public int getAccNo()
//	{
//		return accNo;
//	}	
//	public String getAccType()
//	{
//		return accType;
//	}	
//	public float getAccBal() 
//	{
//		return accBal;
//	}
//
//	//Business Logic Method
//	
//	public float deposit(int no,float amount)
//	{
//		float updatedBal=0.0f;
//		if(accNo==no)
//		{
//			accBal+=amount;
//			updatedBal = accBal;
//		}
//		else
//		{
//			System.out.println("Wrong Account Number");
//		}
//		
//		return updatedBal;
//	}
//	
//	public float withdrawl(int accNo, float amount)
//	{
//		float updatedBal = 0.0f;
//		if(this.accNo == accNo)
//		{
//			if(amount<accBal)
//			{
//				accBal-=amount;
//				updatedBal = accBal;
//			}
//			else
//			{
//				System.out.println("Insufficient Balance");
//			}			
//		}
//		else
//		{
//			System.out.println("Wrong Account Number");
//		}
//		return updatedBal;
//	}
//	
//	public float balanceEnquiry(int accNo)
//	{
//		if(this.accNo == accNo)
//		{
//			return this.accBal;
//		}
//		else
//		{
//			System.out.println("Wrong Account Number");
//			return 0;
//		}
//	}
//	
//	//Facilitator method as its facilitating us to print the data on Console
//	public void PrintAccountDetails()
//	{
//		System.out.println("The Account Details are:Account Number: "+accNo+"\nAccount Type: "+accType+"\nAccount balance:"+accBal);
//	}
//	
//	//Method to display contents of object with reference
//	public String toString()
//	{
//		return "The Account Details are:Account Number: "+accNo+"\nAccount Type: "+accType+"\nAccount balance:"+accBal;
//	}
//	
//	public static void main(String[] args) 
//	{
//		Account a1 = new Account(100, "Savings", 95000.0f);
//		// It will print the address of reference variable a1 and we can use this to print the object contents
//		System.out.println(a1);
//	}	
//}


// Without this reference inside constructor it retains but not outside
//public class Account 
//{
//	// Data Abstraction
//	int accNo;
//	String accType;
//	float accBal;
//	
//	//Constructor for initialization
//	public Account() 
//	{
//		accNo = 100;
//		accType = "Savings";
//		accBal = 40000.0f;
//	}
//	
//	public Account(int accNo, String accType,float accBal) 
//	{
//		//Shadowing effect
//		accNo = accNo;
//		accType = accType;
//		accBal = accBal;
//		System.out.println("Data inside constructor:Account Number: "+accNo+"\nAccount Type: "+accType+"\nAccount balance:"+accBal);
//	}
//	
//	//Updation of the data using setter method
//	
//	public void setAccNo(int accNo)
//	{
//		accNo = accNo;
//	}	
//	public void setAccType(String accType)
//	{
//		accType = accType;
//	}	
//	public void setAccBal(float accBal) 
//	{
//		accBal = accBal;
//	}
//	
//	
//	//getter to get object data
//	public int getAccNo()
//	{
//		return accNo;
//	}	
//	public String getAccType()
//	{
//		return accType;
//	}	
//	public float getAccBal() 
//	{
//		return accBal;
//	}
//
//	//Business Logic Method
//	
//	public float deposit(int no,float amount)
//	{
//		float updatedBal=0.0f;
//		if(accNo==no)
//		{
//			accBal+=amount;
//			updatedBal = accBal;
//		}
//		else
//		{
//			System.out.println("Wrong Account Number");
//		}
//		
//		return updatedBal;
//	}
//	
//	public float withdrawl(int accNo, float amount)
//	{
//		float updatedBal = 0.0f;
//		if(this.accNo == accNo)
//		{
//			if(amount<accBal)
//			{
//				accBal-=amount;
//				updatedBal = accBal;
//			}
//			else
//			{
//				System.out.println("Insufficient Balance");
//			}			
//		}
//		else
//		{
//			System.out.println("Wrong Account Number");
//		}
//		return updatedBal;
//	}
//	
//	public float balanceEnquiry(int accNo)
//	{
//		if(this.accNo == accNo)
//		{
//			return this.accBal;
//		}
//		else
//		{
//			System.out.println("Wrong Account Number");
//			return 0;
//		}
//	}
//	
//	//Facilitator method as its facilitating us to print the data on Console
//	public void PrintAccountDetails()
//	{
//		System.out.println("The Account Details are:Account Number: "+accNo+"\nAccount Type: "+accType+"\nAccount balance:"+accBal);
//	}
//	
//	//Method to display contents of object with reference
//	public String toString()
//	{
//		return "The Account Details are:Account Number: "+accNo+"\nAccount Type: "+accType+"\nAccount balance:"+accBal;
//	}
//	
//	public static void main(String[] args) 
//	{
//		Account a1 = new Account(100, "Savings", 95000.0f);
//		// It will print the address of reference variable a1 and we can use this to print the object contents
//		System.out.println(a1);	
//	}	
//}

/* With toString()
 * public class Account { // Data Abstraction int accNo; String accType; float
 * accBal;
 * 
 * //Constructor for initialization public Account() {
 * System.out.println("Default Constructor Called"); accNo = 100; accType =
 * "Savings"; accBal = 40000.0f; }
 * 
 * public Account(int no, String type,float bal) {
 * System.out.println("Parameterised Constructor Called"); accNo = no; accType =
 * type; accBal = bal; }
 * 
 * //Updation of the data using setter method
 * 
 * public void setAccNo(int no) { accNo = no; } public void setAccType(String t)
 * { accType = t; } public void setAccBal(float bal) { accBal = bal; }
 * 
 * 
 * //getter to get object data public int getAccNo() { return accNo; } public
 * String getAccType() { return accType; } public float getAccBal() { return
 * accBal; }
 * 
 * //Business Logic Method
 * 
 * public float deposit(int no,float amount) { float updatedBal=0.0f;
 * if(accNo==no) { accBal+=amount; updatedBal = accBal; } else {
 * System.out.println("Wrong Account Number"); }
 * 
 * return updatedBal; }
 * 
 * public float withdrawl(int accNo, float amount) { float updatedBal = 0.0f;
 * if(this.accNo == accNo) { if(amount<accBal) { accBal-=amount; updatedBal =
 * accBal; } else { System.out.println("Insufficient Balance"); } } else {
 * System.out.println("Wrong Account Number"); } return updatedBal; }
 * 
 * public float balanceEnquiry(int accNo) { if(this.accNo == accNo) { return
 * this.accBal; } else { System.out.println("Wrong Account Number"); return 0; }
 * }
 * 
 * //Facilitator method as its facilitating us to print the data on Console
 * public void PrintAccountDetails() {
 * System.out.println("The Account Details are:Account Number: "
 * +accNo+"\nAccount Type: "+accType+"\nAccount balance:"+accBal); }
 * 
 * //Method to display contents of object with reference public String
 * toString() { return
 * "The Account Details are:Account Number: \"+accNo+\"\\nAccount Type: \"+accType+\"\\nAccount balance:\"+accBal"
 * ; }
 * 
 * public static void main(String[] args) { Account a1 = new Account(100,
 * "Savings", 95000.0f); // It will print the address of reference variable a1
 * and we can use this to print the object contents System.out.println(a1);
 * //a1.PrintAccountDetails();
 * 
 * 
 * float newBal = a1.deposit(100, 6000.0f);
 * System.out.println("The updated balance after deposit is: "+newBal);
 * 
 * newBal = a1.withdrawl(100, 16000.0f);
 * System.out.println("The updated balance after withdrawl is: "+newBal);
 * 
 * newBal = a1.balanceEnquiry(100);
 * System.out.println("The balance is: "+newBal);
 * 
 * 
 * Account a2 = new Account(101, "Current", 75000.0f); a2.PrintAccountDetails();
 * 
 * 
 * float bal = a1.getAccBal(); if(bal > 50000) { bal+=3000; }
 * 
 * a1.setAccBal(bal);
 * 
 * System.out.println("The updated balance: "+a1.getAccBal()); } }
 */
/*
 * public class Account { // Data Abstraction int accNo; String accType; float
 * accBal;
 * 
 * //Constructor for initialization public Account() {
 * System.out.println("Default Constructor Called"); accNo = 100; accType =
 * "Savings"; accBal = 40000.0f; }
 * 
 * public Account(int no, String type,float bal) {
 * System.out.println("Parameterised Constructor Called"); accNo = no; accType =
 * type; accBal = bal; }
 * 
 * //Updation of the data using setter method
 * 
 * public void setAccNo(int no) { accNo = no; }
 * 
 * public void setAccType(String t) { accType = t; }
 * 
 * public void setAccBal(float bal) { accBal = bal; }
 * 
 * 
 * //getter to get object data public int getAccNo() { return accNo; }
 * 
 * public String getAccType() { return accType; }
 * 
 * public float getAccBal() { return accBal; }
 * 
 * //Business Logic Method
 * 
 * public float deposit(int no,float amount) { float updatedBal=0.0f;
 * if(accNo==no) { accBal+=amount; updatedBal = accBal; } else {
 * System.out.println("Wrong Account Number"); }
 * 
 * return updatedBal; }
 * 
 * public float withdrawl(int accNo, float amount) { float updatedBal = 0.0f;
 * if(this.accNo == accNo) { if(amount<accBal) { accBal-=amount; updatedBal =
 * accBal; } else { System.out.println("Insufficient Balance"); } } else {
 * System.out.println("Wrong Account Number"); } return updatedBal; }
 * 
 * public float balanceEnquiry(int accNo) { if(this.accNo == accNo) { return
 * this.accBal; } else { System.out.println("Wrong Account Number"); return 0; }
 * }
 * 
 * //Facilitator method as its facilitating us to print the data on Console
 * public void PrintAccountDetails() {
 * System.out.println("The Account Details are:Account Number: "
 * +accNo+"\nAccount Type: "+accType+"\nAccount balance:"+accBal); }
 * 
 * public static void main(String[] args) { Account a1 = new Account(100,
 * "Savings", 95000.0f); //a1.setData(100, "Savings", 95000.0f);
 * a1.PrintAccountDetails();
 * 
 * 
 * float newBal = a1.deposit(100, 6000.0f);
 * System.out.println("The updated balance after deposit is: "+newBal);
 * 
 * newBal = a1.withdrawl(100, 16000.0f);
 * System.out.println("The updated balance after withdrawl is: "+newBal);
 * 
 * newBal = a1.balanceEnquiry(100);
 * System.out.println("The balance is: "+newBal);
 * 
 * 
 * Account a2 = new Account(101, "Current", 75000.0f); a2.PrintAccountDetails();
 * 
 * 
 * float bal = a1.getAccBal(); if(bal > 50000) { bal+=3000; }
 * 
 * a1.setAccBal(bal);
 * 
 * System.out.println("The updated balance: "+a1.getAccBal()); } }
 */

/*
 * With Default and parameterized constructors. package com;
 * 
 * public class Account { // Data Abstraction int accNo; String accType; float
 * accBal;
 * 
 * //Constructor for initialization public Account() {
 * System.out.println("Default Constructor Called"); accNo = 100; accType =
 * "Savings"; accBal = 40000.0f; }
 * 
 * public Account(int no, String type,float bal) {
 * System.out.println("Parameterised Constructor Called"); accNo = no; accType =
 * type; accBal = bal; }
 * 
 * public void setData(int no, String type,float bal) { accNo = no; accType =
 * type; accBal = bal; }
 * 
 * //Business Logic Method
 * 
 * public float deposit(int no,float amount) { float updatedBal=0.0f;
 * if(accNo==no) { accBal+=amount; updatedBal = accBal; } else {
 * System.out.println("Wrong Account Number"); }
 * 
 * return updatedBal; }
 * 
 * public float withdrawl(int accNo, float amount) { float updatedBal = 0.0f;
 * if(this.accNo == accNo) { if(amount<accBal) { accBal-=amount; updatedBal =
 * accBal; } else { System.out.println("Insufficient Balance"); } } else {
 * System.out.println("Wrong Account Number"); } return updatedBal; }
 * 
 * public float balanceEnquiry(int accNo) { if(this.accNo == accNo) { return
 * this.accBal; } else { System.out.println("Wrong Account Number"); return 0; }
 * }
 * 
 * public void PrintAccountDetails() {
 * System.out.println("The Account Details are:Account Number: "
 * +accNo+"\nAccount Type: "+accType+"\nAccount balance:"+accBal); }
 * 
 * public static void main(String[] args) { Account a1 = new Account(100,
 * "Savings", 95000.0f); //a1.setData(100, "Savings", 95000.0f);
 * a1.PrintAccountDetails();
 * 
 * float newBal = a1.deposit(100, 6000.0f);
 * System.out.println("The updated balance after deposit is: "+newBal);
 * 
 * newBal = a1.withdrawl(100, 16000.0f);
 * System.out.println("The updated balance after withdrawl is: "+newBal);
 * 
 * newBal = a1.balanceEnquiry(100);
 * System.out.println("The balance is: "+newBal);
 * 
 * 
 * Account a2 = new Account(101, "Current", 75000.0f); a2.PrintAccountDetails();
 * } }
 */

/*
 * With default constructor package com;
 * 
 * public class Account { // Data Abstraction int accNo; String accType; float
 * accBal;
 * 
 * //Constructor for initialization public Account() {
 * System.out.println("Default Constructor Called"); accNo = 100; accType =
 * "Savings"; accBal = 40000.0f; }
 * 
 * public void setData(int no, String type,float bal) { accNo = no; accType =
 * type; accBal = bal; }
 * 
 * //Business Logic Method
 * 
 * public float deposit(int no,float amount) { float updatedBal=0.0f;
 * if(accNo==no) { accBal+=amount; updatedBal = accBal; } else {
 * System.out.println("Wrong Account Number"); }
 * 
 * return updatedBal; }
 * 
 * public float withdrawl(int accNo, float amount) { float updatedBal = 0.0f;
 * if(this.accNo == accNo) { if(amount<accBal) { accBal-=amount; updatedBal =
 * accBal; } else { System.out.println("Insufficient Balance"); } } else {
 * System.out.println("Wrong Account Number"); } return updatedBal; }
 * 
 * public float balanceEnquiry(int accNo) { if(this.accNo == accNo) { return
 * this.accBal; } else { System.out.println("Wrong Account Number"); return 0; }
 * }
 * 
 * public void PrintAccountDetails() {
 * System.out.println("The Account Details are:Account Number: "
 * +accNo+"\nAccount Type: "+accType+"\nAccount balance:"+accBal); }
 * 
 * public static void main(String[] args) { Account a1 = new Account();
 * //a1.setData(100, "Savings", 95000.0f); a1.PrintAccountDetails();
 * 
 * float newBal = a1.deposit(100, 6000.0f);
 * System.out.println("The updated balance after deposit is: "+newBal);
 * 
 * newBal = a1.withdrawl(100, 16000.0f);
 * System.out.println("The updated balance after withdrawl is: "+newBal);
 * 
 * newBal = a1.balanceEnquiry(100);
 * System.out.println("The balance is: "+newBal);
 * 
 * 
 * Account a2 = new Account(); a2.PrintAccountDetails(); } }
 */

/*
 * //Without Constructor
 * 
 * package com;
 * 
 * public class Account { // Data Abstraction int accNo; String accType; float
 * accBal;
 * 
 * public void setData(int no, String type,float bal) { accNo = no; accType =
 * type; accBal = bal; }
 * 
 * //Business Logic Method
 * 
 * public float deposit(int no,float amount) { float updatedBal=0.0f;
 * if(accNo==no) { accBal+=amount; updatedBal = accBal; } else {
 * System.out.println("Wrong Account Number"); }
 * 
 * return updatedBal; }
 * 
 * public float withdrawl(int accNo, float amount) { float updatedBal = 0.0f;
 * if(this.accNo == accNo) { if(amount<accBal) { accBal-=amount; updatedBal =
 * accBal; } else { System.out.println("Insufficient Balance"); } } else {
 * System.out.println("Wrong Account Number"); } return updatedBal; }
 * 
 * public float balanceEnquiry(int accNo) { if(this.accNo == accNo) { return
 * this.accBal; } else { System.out.println("Wrong Account Number"); return 0; }
 * }
 * 
 * public void PrintAccountDetails() {
 * System.out.println("The Account Details are:Account Number: "
 * +accNo+"\nAccount Type: "+accType+"\nAccount balance:"+accBal); }
 * 
 * public static void main(String[] args) { Account a1 = new Account();
 * a1.setData(100, "Savings", 95000.0f); a1.PrintAccountDetails();
 * 
 * float newBal = a1.deposit(100, 6000.0f);
 * System.out.println("The updated balance after deposit is: "+newBal);
 * 
 * newBal = a1.withdrawl(100, 6000.0f);
 * System.out.println("The updated balance after withdrawl is: "+newBal);
 * 
 * newBal = a1.balanceEnquiry(100);
 * System.out.println("The balance is: "+newBal); } }
 * 
 */