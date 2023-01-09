import java.util.*;
class Area
{
	void area(int x)
	{
		System.out.println("Area of circle is "+(3.14*x*x));
	}
	void area(int x, int y)
	{
		System.out.println("Perimeter of rectangle is "+(x*y));
	}
	void area(int x, int y, int z)
	{
		int s=x+y+z;
		System.out.println("Perimeter of triangle is "+Math.sqrt(s*(s-x)*(s-y)*(s-z)));
	}
}
class TestArea
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Area p= new Area();
		System.out.print("Enter the radius of the circle : ");
		int r=sc.nextInt();
		System.out.print("Enter the sides of the rectangle : ");
		int l=sc.nextInt();
		int h=sc.nextInt();
		System.out.print("Enter the sides of the triangle : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		p.area(r);
		p.area(l,h);
		p.area(a,b,c);
	}
}
