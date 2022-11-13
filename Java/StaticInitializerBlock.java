import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        boolean flag=true;
        int B= sc.nextInt();
        int H = sc.nextInt();
        if(H<=0 || H>=100 || B<=0 || B>=100)
        {
            flag=false;
        }
        if(flag){
            int area=B*H;
            System.out.println(area);
        }
        if(!flag) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        sc.close();

    }
}
