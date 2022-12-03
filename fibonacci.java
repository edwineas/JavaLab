import java.util.*;
class fibonacci
{
    public static void main(String args[])
    {
        int i,n1=0,n2=1,n3,c;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the limit :\t");
        c =  sc.nextInt();
        for(i=2;i<=c;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        };
    }
}