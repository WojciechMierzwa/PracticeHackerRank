import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String result = reverse(A);
        if(result.equals(A))
            System.out.println("Yes");
        else System.out.println("No");
        sc.close();
        
    }
     public static String reverse(String word) {
        char[]  letters = new char[word.length()];
        for(int i=0; i<word.length(); i++)
        {
            letters[i]=word.charAt(word.length()-1-i);
        }
        String reversedWord="";
        for(int i=0; i<word.length(); i++)
        {
            reversedWord=reversedWord+letters[i];
        }

        return reversedWord;
    }
}



