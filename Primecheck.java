import java.util.*;
class Primecheck
{
    public static void main(String args[])
    {
        int i,flag;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number :\t");
        int n =  sc.nextInt();
        for (i=2,flag=0;i<=(n/2);i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.print(n + " is a prime");
        else
            System.out.print(n + " is not a prime");
    }
}