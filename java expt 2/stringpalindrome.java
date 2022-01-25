import java.util.*;
class stringpalindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String s=sc.next();
        String t=s;
        int i,n;
        n=s.length();
        for(i=0;i<n;i++)
        {
            if(s.charAt(i)==t.charAt(n-i-1))
            continue;
            else{
            System.out.println("not palindrome");
            break;}
        }
        if(i==n)
        System.out.println("palindrome");
    }

    
}
