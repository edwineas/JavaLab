import java.util.*;
class CharSearch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.print("Enter the character to search\t");
        char c=sc.next().charAt(0);
        int flag=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
            {
                System.out.println("Character is at the position : "+(i+1));
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("Character is not found");
    }
}