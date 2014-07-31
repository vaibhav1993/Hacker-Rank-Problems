import java.io.*;
import java.lang.*;
import java.util.*;

class Solution
    {
    public static void main(String args[])throws Exception
        {
        int arr[] = new int[1000];
        int t,n,a,b;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for(int i=0;i<t;i++)
            {
            n= sc.nextInt();
            a= sc.nextInt();
            b= sc.nextInt();
            int k=0;
            for(int j=0;j<n;j++)
                { int count=0;
                int tmp = a*j+b*(n-j-1);
               for(int g=0;g<k;g++)
                   {
                   if(arr[g]==tmp)
                       count++;
               }
                if(count==0)
                    {
                arr[k]=tmp;
                k++;
                }
                }
             Arrays.sort(arr,0,k);
            for(int l=0;l<k;l++)
              System.out.print(arr[l] +" ");
            System.out.println();
            }
       
        }
                
            }