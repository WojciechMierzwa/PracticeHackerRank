import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;
        boolean flag = true;
        while(flag)
        {
            String a = sc.nextLine();

            System.out.println(i+" " +a);
            if(!sc.hasNext())
            {
                flag=false;
            }
            i++;

        }
        sc.close();
    }
}
