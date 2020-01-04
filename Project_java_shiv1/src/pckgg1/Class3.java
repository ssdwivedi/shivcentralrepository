//Expression 1: ((((10+2)-2)+2)*2)/2)
package pckgg1;
public class Class3 
{
	public int add(int a, int b)
	{
		int c;
		c=a+b;
		return c;		
	}
	public int sub(int a, int b)
	{
		int d;
		d=a-b;
		return d;
	}
	public int mul(int a, int b)
	{
		int e;
		e=a*b;
		return e;
	}
	public int div(int a , int b)
	{
		int f;
		f=a/b;
		return f;
	}
		public static void main(String[] args) 
		{
			Class3 shiva=new Class3();
			int addition=shiva.add(10, 2);
			int substraction= shiva.sub(addition, 2);
			int addition2= shiva.add(substraction, 2);
			int multiplication=shiva.mul(addition2, 2);
			int division=shiva.div(multiplication, 2);
			System.out.println("Value of first expression  ((((10+2)-2)+2)*2)/2) is:" +division);
		}
}

