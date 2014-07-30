import java.io.*;
import java.lang.*;
import java.util.*;

class Solution
{
    public static void main(String args[])throws Exception
        {
        int i,j,var1,var2;
        int t; String s; int ans=0;
        Scanner sc = new Scanner(System.in);
        t=sc.nextInt();
        
        while(t!=0)
            {
           s = sc.next();
         int a=0; int c;
        i=0; j=s.length()-1;
       while(i!=j&&i<=j)
            {
            var1 = (int)s.charAt(i);
            var2 = (int)s.charAt(j);
         c = Math.abs(var1-var2);
        a = a +c;
        i++; j--;
        }
            System.out.println(a);
            t--;  
    }
}
}