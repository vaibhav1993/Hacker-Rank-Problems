import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
       
        String ans;
        
        if(inputString.length()==1)
            ans = "YES";
        int[] letters = new int[26];
        for(int i=0;i<inputString.length();i++){
            letters[inputString.charAt(i)-'a']++;
        }
        int odd = 0;
        for(int l:letters){
            if(l%2!=0)
                odd++;
        }
        ans = (odd>1)?"NO":"YES";
        System.out.println(ans);
        myScan.close();
    }
}
