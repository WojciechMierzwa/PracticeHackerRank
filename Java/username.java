import java.io.*;
import java.util.*;

public class Solution {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int reps = scan.nextInt();

        while(reps>0)
        {
            String username = scan.next();
            check(username);
            reps--;

        }


        scan.close();



    }
    static void check(String username)
    {
        int length = username.length();
        int temp=0;
        boolean valid=false;
        char username1[] = username.toCharArray();
        for(int i=0; i<length; i++)
        {
            temp=(int) username1[i];
            if((temp>=65 && temp<=90) || (temp>=97 && temp<=122) || temp==95 || (temp>=48 && temp <=57))
                valid=true;
            else
            {
                valid=false;
                break;

            }

        }
        if(length<8 || length>30)
            valid=false;
        temp=(int) username1[0];
        if(!((temp>=65 && temp<=90) || (temp>=97 && temp<=122)))
            valid=false;
        //System.out.println(valid);
        if(valid)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}
