import java.io.*;
import java.util.*;

public class Solution {


    public static void returnArray(char temp, int array[])
    {
        switch (temp)
        {
            case 'a':
                array[0]++;
                break;
            case 'b':
                array[1]++;
                break;
            case 'c':
                array[2]++;
                break;
            case 'd':
                array[3]++;
                break;
            case 'e':
                array[4]++;
                break;
            case 'f':
                array[5]++;
                break;
            case 'g':
                array[6]++;
                break;
            case 'h':
                array[7]++;
                break;
            case 'i':
                array[8]++;
                break;
            case 'j':
                array[9]++;
                break;
            case 'k':
                array[10]++;
                break;
            case 'l':
                array[11]++;
                break;
            case 'm':
                array[12]++;
                break;
            case 'n':
                array[13]++;
                break;
            case 'o':
                array[14]++;
                break;
            case 'p':
                array[15]++;
                break;
            case 'q':
                array[16]++;
                break;
            case 'r':
                array[17]++;
                break;
            case 's':
                array[18]++;
                break;
            case 't':
                array[19]++;
                break;
            case 'u':
                array[20]++;
                break;
            case 'v':
                array[21]++;
                break;
            case 'w':
                array[22]++;
                break;
            case 'x':
                array[23]++;
                break;
            case 'y':
                array[24]++;
                break;
            case 'z':
                array[25]++;
                break;
        }
    }

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);


       String a = scan.next();
       String b = scan.next();
       scan.close();
       int lengtha = a.length();
       int lengthb = b.length();

       int[] a_array = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
       int[] b_array = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

       if(lengtha != lengthb)
       {
           System.out.println("Not Anagrams");

       }
       else
       {
           a = a.toLowerCase();
           b = b.toLowerCase();
           char temp1;
           char temp2;
           for(int i = 0; i<lengtha; i++)
           {
               temp1=a.charAt(i);
               returnArray(temp1, a_array);
               temp2=b.charAt(i);
               returnArray(temp2, b_array);
           }
            boolean flag=true;
           for(int i=0; i<26; i++)
           {
               if(a_array[i]==b_array[i])
                   ;
               else
                   flag=false;
           }
           if(flag)
           {
               System.out.println("Anagrams");
           }
           else
           {
               System.out.println("Not Anagrams");
           }
       }
    }
}
