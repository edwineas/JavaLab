import java.util.*;
class Sumofnnums
{
    public static void main(String args[])
    {
        int sum,i;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the limit :\t");
        int n =  sc.nextInt();
        for(i=1,sum=0;i<=n;i++)
            sum = sum + i;
        System.out.print("Sum = "+ sum);
    }
}