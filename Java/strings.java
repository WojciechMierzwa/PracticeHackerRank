import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int length_A=A.length();
        int length_B=B.length();

        String A1 = A.substring(0,1);
        String A2= A.substring(1,length_A);
        String B1 = B.substring(0,1);
        String B2= B.substring(1,length_B);
        A=A1.toUpperCase()+A2;
        B=B1.toUpperCase()+B2;

        int letterA= (int) A1.charAt(0);
        int letterB = (int) B1.charAt(0);



        System.out.println(length_A+length_B);
        if(letterA>letterB)
            System.out.println("Yes");
        else
            System.out.println("No");

        System.out.println(A+" "+B);


    }
}



