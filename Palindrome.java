import java.util.*;
class Palindrome
{
   public static void main (String args[])
   {
      int flag=1;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the word");
      String s = sc.nextLine();
      int l = s.length();
      String s2 = new String(s.toLowerCase());
      for (int i=0,j=l-1; i<j;i++,j--)
      {
         if(s2.charAt(i)!=s2.charAt(j))
         {
            flag=-1;
            break;
         }
      }
      if(flag==1)
         System.out.println("Word is Palindrome");
      else
         System.out.println("Word is not Palindrome");
   }  
}
