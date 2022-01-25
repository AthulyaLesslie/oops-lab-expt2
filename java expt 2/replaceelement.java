import java.util.*;
class replaceelement
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,num,pos;
        System.out.println("enter the number of elements:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            
        }
        System.out.println("enter the new element:");
        num=sc.nextInt();
        System.out.println("enter the position to add number:");
        pos=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(i+1==pos)
            a[pos-1]=num;
        }
        System.out.println("final output is:");
        for(i=0;i<n;i++)
        System.out.println("\t" + a[i]);
    }
}


