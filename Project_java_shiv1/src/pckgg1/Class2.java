//(10+2)*(10-2)
package pckgg1;

public class Class2 
{
	
	public int add(int a,int b) 
	{
		int c;
		c=a+b;
		return c;
	}
	public  int sub(int a, int b) 
	{
		int d;
		d=a-b;
		return d;
	}
	public int multiply (int p, int q)
	{
		int r;
		r=p*q;
		return r;
		//System.out.println("Multiplication is "+r);
	}
	public static void main(String[] args) 
	{
		Class2 shiv=new Class2();
		int addition=shiv.add(12, 2);
		int substraction=shiv.sub(12, 6);
		int multiplicationofexpression=shiv.multiply(addition, substraction);
		System.out.println("Multipliaction of expression is: "+multiplicationofexpression);
		
		
	}
	
}
