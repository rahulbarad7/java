package pkg;

public class Calculation {
	
public int Sum(int a, int b)
{
	int c;	
	c = a+b;
	System.out.println("The sum is "+c);
	return c;
						
}
public int Sub(int x,int y)
{

	int z;
	z=x-y;
	System.out.println("the sub is "+z);
	return z;
    
}
public int Mult(int x1, int x2)
{

    int x3;
	x3=x1*x2;
	System.out.println("the Mult is "+x3 );
	return x3;
	
}
public void Div(int p, int q)
{

    int r;
	r=p/q;
System.out.println("the div is " + r);
}

public static void main(String[] args) 
{
	Calculation finalcal = new Calculation();
	
	int sumresult = finalcal.Sum(10, 2);
	int subresult= finalcal.Sub(sumresult, 2);
	int sumresult2=finalcal.Sum(subresult, 2);
	int multresult=finalcal.Mult(sumresult2, 2);
	finalcal.Div(multresult, 2);
	
		
}
}