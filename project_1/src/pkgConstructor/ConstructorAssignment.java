package pkgConstructor;

public class ConstructorAssignment {
	
	public ConstructorAssignment()
	{
		this(22,22,22);
		System.out.println("Default constructor");
	}

	public ConstructorAssignment(int a)
	{
	
	this(11,11,11,11);
		System.out.println("1 parameterized constructor");	
	
	}
	
	public ConstructorAssignment(int x, int y) 
	{
		
	this();
		System.out.println("2 parameterized constructor");	
		
	}
	
	public ConstructorAssignment(int a1, int b1, int c1)
	{
		
	 
		System.out.println("3 parameterized constructor");
	
	}
	
	public ConstructorAssignment(int p, int q, int r, int s)
	{
	this(22,22);
	System.out.println("4 parameterized constructor");

	}
	public static void main(String[] args)
	{
		ConstructorAssignment obj=new ConstructorAssignment(22);
	}
}


