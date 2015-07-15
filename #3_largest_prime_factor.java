import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static long getFactor (long a){
        long max = (long)Math.sqrt(a);
        for(long i = 2; i <= max; i++){
            if(a%i==0){
                return i;
            }//end if
        }//end for
        return -1;
    }//end isPrime
    
    
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        
        for(int test = 1; test<=tests; test++){
            
            long n = in.nextLong();

            long temp = n;
            for(long i = 0; i < n; i++ ){
                long factor = getFactor(temp);
                if(factor!=-1){
                    temp/=factor;
                }else{
                    break;
                }
            }
            System.out.println(temp);


        }//end for
    
    }
}