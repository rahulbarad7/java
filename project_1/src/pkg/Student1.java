package pkg;

public class Student1 {
	
	int age; int rollNo;//Variables declaration
	
	public void display1() //() Method declaration
	{
		
		System.out.println("Welcome to all of you");
	}
    public void display2() {
    	
    	System.out.println("Automation is very very easy ");
    }
    
    
    public static void main(String[] args) {
		
    	Student1 deepak= new Student1();//object creation
    	System.out.print("deepak age is"  );
    	deepak.age=21;//calling variable
    	System.out.println(deepak.age);
    	System.out.print("deepak rollNo is");
    	deepak.rollNo=02;//calling variable
    	System.out.println(deepak.rollNo);
    	deepak.display1();//calling object
    	deepak.display2();//calling object
	}
}
