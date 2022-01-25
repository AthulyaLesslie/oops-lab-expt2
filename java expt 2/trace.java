import java.util.*;
class trace
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,sum=0;
        System.out.println("enter the order of square matrix:");
        int m=sc.nextInt();
        int a[][]=new int[20][20];
        System.out.println("enter the elements:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
            a[i][j]=sc.nextInt();
            }
            
        }
        for(i=0;i<m;i++)
         sum+=a[i][i];
        System.out.println("trace of matrix is"+sum);
        
    }
}


