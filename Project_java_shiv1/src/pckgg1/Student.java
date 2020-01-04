package pckgg1;

public class Student 
{
	int age;
	int rollno;
	public void display() 
	{
		System.out.println("Welcome to all of you, This is my java program");
	}
	public static void main(String[] args) 
	{
		Student shiv=new Student();
		shiv.age=35;
		shiv.rollno=161;
		shiv.display();
		System.out.println(shiv.age);
		System.out.println(shiv.rollno);
		
	}
	
}
