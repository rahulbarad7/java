package pkg;

public class Student {
	
	int a; //we have declared variable named a
	
    public void Rahul()///() indicate this is method
    {
    	System.out.println("Welcome to all of you");
    	
    }
    public static void main(String[] args)
    {
    	
    	Student abc = new Student();//object creation
    	
		abc.a = 21;//called variable
		abc.Rahul();//calling method
		System.out.println(abc.a);
    	
	}
    
}
