import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

         private static int numberOfChocolates(int N, int C) {
              return N / C;
         }
       private static int numberOfChocolatesForWrappers(int chocolates, int M) {
              int result = 0;
              while (chocolates / M > 0) {
                     result += chocolates / M; 
                     
                     chocolates = (chocolates / M) + (chocolates % M);
              }
              return result;
       }

       public static void main(String[] args) {
              

              Scanner sc = new Scanner(System.in);
              int T = sc.nextInt();

              for (int i = 0; i < T; i++) {
                     int N = sc.nextInt();
                     int C = sc.nextInt();
                     int M = sc.nextInt();

                     int totChocolates = 0;
                     totChocolates = numberOfChocolates(N, C)
                                  + numberOfChocolatesForWrappers(numberOfChocolates(N, C), M);
                     System.out.println(totChocolates);
              }
              sc.close();
       }

}
