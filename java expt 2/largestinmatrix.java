import java.util.*;
class largestinmatrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,i,j,lar;
        System.out.println("enter the number of rows:");
        n=sc.nextInt();
        int a[][]=new int[20][20];
        System.out.println("enter the no of columns:");
        m=sc.nextInt();
        System.out.println("enter the number of elements:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
            
        }
        lar=a[0][0];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
             if(a[i][j]>lar)
             lar=a[i][j];
            }
        }
        System.out.println("largest element is"+lar);
    
    }
}


