import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

      public void evenorOdd(int N)
      {
          String str1 ="Weird";
          String str2 ="Not Weird";
          if(N%2!=0)
          {
              System.out.println(str1);

          }
          if(N%2 == 0)
          {  
            if( N>=2 && N<=5)
            {
              System.out.println(str2);
            }
            else if(N>=6 && N<=20)
            {
                System.out.println(str1);
            }
            else if(N>20)
            {
                System.out.println(str2);

            }
          }

      }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Solution obj = new Solution();
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
 
        scanner.close();
        obj.evenorOdd(N);
        
    }
}
