import java.util.*;
class Student
{
	String name;
	int rollno;
	int mark[]=new int[5];
	void read()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the name of the student\t");
		name= sc.nextLine();
		System.out.print("Enter the Roll No. of the student\t");
		rollno=sc.nextInt();
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter the mark of the sub"+(i+1)+" :\t");
			mark[i]=sc.nextInt();
		}
	}
	void display()
	{
		System.out.println("student name : \t"+name);
		System.out.println("student Roll No :  "+rollno);
		for(int i=0;i<5;i++)
			System.out.println("Mark of sub"+(i+1)+" : \t"+mark[i]);
	}
}
class TestStudent
{
	public static void main(String args[])
	{
		Student std = new Student();
		std.read();
		std.display();
	}
}
