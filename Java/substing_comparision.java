import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int number = scan.nextInt();
        int length = word.length();

        ArrayList<String> subs = new ArrayList<>();
        for(int i=0; i<=length-number; i++) //enters substring to an array of substrings
        {
            subs.add(word.substring(i,i+number));
        }
        Collections.sort(subs);
        System.out.println(subs.get(0));
        System.out.println(subs.get(length-number));

    }
}
