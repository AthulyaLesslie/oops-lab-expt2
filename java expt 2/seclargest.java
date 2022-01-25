import java.util.*;
class seclargest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,sl,lar;
        System.out.println("enter the number of elements:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            
        }
        lar=a[0];
        for(i=0;i<n;i++)
        {
            if(a[i]>lar)
            lar=a[i];
        }
        sl=a[0];
        for(i=0;i<n;i++)
        {
            if(a[i]>sl && a[i]<lar)
            sl=a[i];
        }
        System.out.println("second largest element is"+sl);
    
    }
}

