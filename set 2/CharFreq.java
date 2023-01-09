import java.util.*;
class CharFreq
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        	System.out.println("Enter the string");
		String s1 = sc.nextLine();
		String s2=s1.toLowerCase();
		System.out.print("Enter the character \t");
		char c=sc.next().charAt(0);
		int freq=0;
		for(int i=0;i<s2.length();i++)
			if(s2.charAt(i)==c)
				freq++;
		System.out.println("frequency of the given character : "+freq);
	}
}
