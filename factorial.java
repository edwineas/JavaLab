import java.util.*;
class factorial
{
    public static void main(String args[])
    {
        int i,n,f;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number :\t");
        n =  sc.nextInt();
        for(i=1,f=1;i<=n;++i)
        {
            f=f*i;
        }
        System.out.print(n+"! = "+f);
    }
}