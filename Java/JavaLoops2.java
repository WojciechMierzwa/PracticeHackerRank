package com.example;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.*;
import java.io.*;

import static java.lang.System.in;


public class helloworld {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int c=0;
            for(int j=0;j<n; j++)
            {
                c= (int) Math.pow(2,j)*b +c;
                System.out.print(a+c);
                System.out.print(" ");
            }
            System.out.println();
        }
        in.close();

    }
}
