import java.util.*;
class Perimeter
{
	Perimeter(int x)
	{
		System.out.println("Perimeter of circle is "+(2*3.14*x));
	}
	Perimeter(int x, int y)
	{
		System.out.println("Perimeter of rectangle is "+(2*(x+y)));
	}
	Perimeter(int x, int y, int z)
	{
		System.out.println("Perimeter of triangle is "+(x+y+z));
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the circle : ");
		int r=sc.nextInt();
		System.out.print("Enter the sides of the rectangle : ");
		int l=sc.nextInt();
		int h=sc.nextInt();
		System.out.print("Enter the sides of the triangle : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		Perimeter p1= new Perimeter(r);
		Perimeter p2= new Perimeter(l,h);
		Perimeter p3= new Perimeter(a,b,c);
	}
}
