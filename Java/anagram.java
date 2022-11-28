import java.util.Scanner;

public class Solution {

     static boolean isAnagram(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
        int lenghta=a.length();
        int lengthb=b.length();
        if(lenghta!=lengthb)
            return false;
        else
        {
            int counter=0;
            for(int i=0; i<lenghta; i++)
            {
                for(int j=0; j<lenghta; j++)
                    if(a.charAt(i)==b.charAt(j)) {
                        counter++;
                        break;
                    }
            }
            if(lenghta==counter)
            {
                return true;
            }
            else
                return false;
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
