import java.util.*;
class oddoreven
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number :\t");
        int n =  sc.nextInt();
        if(n%2==0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }
}