import java.io.*;
import java.lang.*;
import java.util.*;

class Solution
    {
    public static void main(String args[])throws Exception
        {
        int t,k;
        Scanner sc = new Scanner(System.in);
        t=sc.nextInt();
        
        for(int i=0;i<t;i++)
            {
            k=sc.nextInt();
            
           long n =(long) k/2;
           long m =(long) k-n;
            
            System.out.println(n*m);
        }
        
    }
}