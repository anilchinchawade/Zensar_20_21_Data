package demo;

public class Test
{
	//When I initialize static data when it is created 
	//private static String ifsccode = "MAHB001568";
	
	//When we want to initialize or updating static data as same as constructor we use static block
	//Looking at o/p static blocks gets executed before main
	protected static String ifscCode;
	private int val = 100;
	 static
	 {
		 ifscCode="MAHB001568";
		 System.out.println("Static Blocks");
	 }
	 
	 public static void print()
	 {
		 System.out.println("Code is: "+ifscCode);		 
	 }
	 
	 public static void main(String[] args) 
	 {
		 System.out.println("Main Method");
		 System.out.println("Value is: "+ifscCode);
		 
		 Test t1 = new Test();
		 System.out.println(t1.val);
		 System.out.println(t1.ifscCode); //Static data can be accessed with an object name because it is shared among all objects.		 
	 }	 
}

class Entry
{
	public void printStatic()
	{
		// accessing static data and behaviours without qualification leads to syntax error, so need to qualify with class name. 
		System.out.println("Code is: "+Test.ifscCode); //Need to make protected
		Test.print();
	}
}
/* Created an object so no complaint
public class Test 
{
	private int val=10;
	
	public void print()
	{
		System.out.println("Data is: "+val);
	}
	public static void main(String[] args) 
	{
		Test t = new Test();
		System.out.println("Variable val is: "+t.val);
		t.print();

	}

}
*/

/* Without object it complaints because data and behavior should belong to object
public class Test 
{
	private int val=10;
	
	public void print()
	{
		System.out.println("Data is: "+val);
	}
	public static void main(String[] args) 
	{
		System.out.println("Variable val is: "+val);
		print();

	}

}
*/