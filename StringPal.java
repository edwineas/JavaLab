import java.util.*;
class StringPal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1=sc.nextLine();
        String s2=s1.toLowerCase();
        int flag=0;
        for(int i=0;i<(s2.length()/2);i++)
        {
            if(s2.charAt(i)!=s2.charAt(s2.length()-i-1))
            {
                flag=1;
                break;
            }
        }
            if(flag==0)
                System.out.println(s1 + " is palindrome");
            else
                System.out.println(s1 + " is not palindrome");
    }
}