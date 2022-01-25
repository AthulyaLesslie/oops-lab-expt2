import java.util.*;
class addmatrix
{
    public static void main(String args[])
    {
        int i,j;
        int a[][]=new int[20][20];
        int b[][]=new int[20][20];
        int r[][]=new int[20][20];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter order of first matrix:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("enter order of second matrix:");
        int p=sc.nextInt();
        int q=sc.nextInt();
        if(m==p && n==q)
        {
            System.out.println("enter first matrix:");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("enter second matrix:");
            for(i=0;i<p;i++)
            {
                for(j=0;j<q;j++)
                {
                    b[i][j]=sc.nextInt();
                }
            }
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    r[i][j]=a[i][j]+b[i][j];
                }
            }
            System.out.println("result is :");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.println(r[i][j]+"\t");
                }
            }
            System.out.println("\n");
        }
        else 
        System.out.println("Addition not possible");
    }
}
