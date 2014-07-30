import java.io.*;
import java.lang.*;
import java.util.*;

class Solution
    {
public static void main(String args[])throws Exception
    {
      Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    String s[] = new String[n];
  for(int k=0;k<n;k++)
    s[k]=sc.next();
    
    int cnt=0; int i,l;
    for(i=97;i<123;i++)
        {
         int count=0;
for(l=0;l<s.length;l++)
{
    char ch=(char)i;
    if(s[l].indexOf(ch)!=-1)
 count++;
 }
        if(count==s.length)
            cnt++;
    }
    System.out.println(cnt);
    }
}