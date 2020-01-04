//Expression2: ((((10-2)+2)*2)-2)/2)
package pckgg1;
public class Class4 
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
	public void div(int a , int b)
	{
		int f;
		f=a/b;
		System.out.println("Value of second expression  ((((10-2)+2)*2)-2)/2) is: " +f);
	}

		public static void main(String[] args) 
		{
			Class4 shiva=new Class4();
			int subtract=shiva.sub(10, 2);
			int addition=shiva.add(subtract, 2);
			int multiply=shiva.mul(addition, 2);
			int substract2=shiva.sub(multiply, 2);
			shiva.div(substract2, 2);
		}
}

