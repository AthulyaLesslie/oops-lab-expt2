import java.util.*;
class arraysum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,sum=0;
        System.out.println("enter the number of elements:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        System.out.println("sum of "+n+" elements is" + sum);
    
    }
}