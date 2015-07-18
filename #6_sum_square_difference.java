import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    

    public static long sumOfAll(long last){
        return last*(last+1)/2;
    }
    public static long sumOfSquares(long last){
        return last * (last+1) * (2*last + 1) / 6;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        for(int test = 1; test<=tests; test++){
            
            long n = in.nextLong();
            System.out.println(Math.abs(sumOfAll(n)*sumOfAll(n) - sumOfSquares(n)));
            
            
            
        }
    }
}