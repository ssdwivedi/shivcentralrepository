package pckgg1;
public class ShivaConstructor 
{
	public ShivaConstructor() 
	{
		this(1,2,3);
		System.out.println("Default Constructor");
	}
	public ShivaConstructor(int a) 
	{
		this();
		System.out.println("one parametrized Constructor");
	}
	public ShivaConstructor(int a, int b) 
	{
		this(1,2,3,4);
		System.out.println("two parametrized Constructor");
	}
	public ShivaConstructor(int a, int b, int c) 
	{
		System.out.println("three parametrized Constructor");
	}
	public ShivaConstructor(int a, int b, int c,int d) 
	{
		this(3);
		System.out.println("four parametrized Constructor");
	}
		public static void main(String[] args) 
		{
			ShivaConstructor constructorobj=new ShivaConstructor(3, 4);
		}
}
