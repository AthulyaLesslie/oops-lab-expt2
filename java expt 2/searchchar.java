import java.util.*;
class searchchar
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.nextLine();
        int i,n,flag=0;
        System.out.println("enter character to be searched");
        String a=sc.nextLine();
        n=s.length();
        for(i=0;i<n;i++)
        {
            if(s.charAt(i)==a.charAt(0))
            {
                System.out.println("character found");
                flag=1;
                break;
            }
            else 
            continue;
        }
        if(flag==0)
        System.out.println("character not found");
    }
}
