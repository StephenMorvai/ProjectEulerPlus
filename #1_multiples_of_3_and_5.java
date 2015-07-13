import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        long tests = in.nextInt();
        
        for(long test = 1; test <=tests; test++){
            
            long n = in.nextInt();
            long sum = 0;
            
            long a = (n - 1)/3;
            long b = (n - 1)/5;
            long c = (n - 1)/15;
            
                
            sum+= 3* a* (a+1)/2;
            sum+= 5 * b *(b+1)/2;
            sum-= 15 * c *(c+1)/2;
                
            System.out.println(sum);
        }
        
    }
}