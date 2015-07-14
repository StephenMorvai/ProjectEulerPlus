import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int fib(int num){
        if(num > 2){
            return fib(num - 1) + fib(num - 2);
        }else if( num == 2){
            return 2;
        }else if (num == 1){
            return 1;
        }else{
            return -1;
        }
    }//end fib
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int tests = Integer.parseInt(in.nextLine());
        
        for(long test = 0; test < tests; test++){
            
            long n = 0;
            try{
                n = Long.parseLong(in.nextLine());// max 4 * 10^16
            }catch(NumberFormatException e){
                //Nothing
            }
        /*
        
            Fib(n) = Fib(n-1) + Fib(n-2);

            The sequence goes OEOOEOOEOOEOOE

            extended backwards

            5 3 2 1 1 0 1 -1
        
        */
            //Deciding to start at 2
            long temp = 1;
            boolean cond = true;
            long previous = 1;
            long current = 2;
            long sum = 2;
            while(cond){
                for(int a = 0; a < 3; a++){
                    temp = previous;
                    previous = current;
                    current+=temp;
                }//end for
                if(current <= n){
                    sum+=current;
                }else{
                    cond = false;   
                }//end if
            }//end while
            
            System.out.println(sum);
        }//end for
    }//end main
}