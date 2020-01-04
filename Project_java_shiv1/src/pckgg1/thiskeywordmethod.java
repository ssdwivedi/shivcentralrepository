package pckgg1;
public class thiskeywordmethod 
{
	public void method_defaultparam() 
	{
		this.method_threeparam(11, 22, 33);
		System.out.println("deafult parameterized method");
	}
	public void method_oneparam(int a) 
	{
		this.method_defaultparam();
		System.out.println("one parameterized method");
	}
	public void method_twoparam(int a, int b) 
	{
		this.method_fourparam(23, 34, 45, 56);
		System.out.println("two parameterized method");
	}
	public void method_threeparam(int a, int b, int c) 
	{
		System.out.println("three parameterized method");
	}
	public void method_fourparam(int a, int b, int c, int d) 
	{
		this.method_oneparam(90);
		System.out.println("four parameterized method");
	}
		public static void main(String[] args) 
		{
			thiskeywordmethod shivthis=new thiskeywordmethod();
			shivthis.method_twoparam(2, 3);
		}
}
