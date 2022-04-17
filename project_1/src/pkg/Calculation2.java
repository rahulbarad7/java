package pkg;

public class Calculation2 {
	
	public int Mult(int a, int b)
	{
	
		int c=a*b;
		System.out.println("The multiplication is "+c);
		return c;
		
	}
	
	public int Sum(int c, int d)
	{

	
	int e;
	e=c+d;
	System.out.println("The addition is "+e);
	return e;
	
	}
	
	
	public int Sub(int p, int q) 
	
	{
		
	int r;
	r=p-q;
	System.out.println("The subtraction is "+r);
	return r;
		
	}
	
	public void Div(int m, int n)

	{
	int o;
	o=m/n;
	System.out.println("The Division is "+o);
	}
	
	public static void main(String[] args) 
	
	{
	Calculation2 result = new Calculation2();
	int Multresult = result.Mult(10, 2);
	int Addresult=result.Sum(Multresult, 2);
	int Subresult=result.Sub(Addresult, 2);
	int Subresult2=result.Sub(Subresult, 2);
	int Addresult2=result.Sum(Subresult2, 2);
	result.Div(Addresult2, 2);
		
	}
}
