import java.util.*;
class fibonacci
{
    public static void main(String args[])
    {
        int i,n1=0,n2=1,n3,c;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the limit :\t");
        c =  sc.nextInt();
        System.out.print("0 1");
        for(i=2;i<=c+1;++i)
        {
            n3=n1+n2;
            if(n3<=c)
            {
                System.out.print(" "+n3);
                n1=n2;
                n2=n3;
            }
            else
                break;
            
        }
    }
}