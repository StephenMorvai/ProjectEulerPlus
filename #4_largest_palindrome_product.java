import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    /*
        determines of a 6 digit number is a palindrome
    */
    public static boolean isPalindrome(int num){
        String str = num + "";
        if(str.charAt(0) == str.charAt(5) && str.charAt(1) == str.charAt(4) && str.charAt(2) == str.charAt(3)){
            return true;
        }else{
            return false;
        }
    }
    
    /*
        num is 6 digits
    */
    public static int largestPalindromeUnder(int num){
        
        for(int i = num - 1; i>=101101; i--){
            if(isPalindrome(i)){
                return i;
            }
        }//end for
        return -1;
    }

    /*
        checks if num is a factor of two 3 digit numbers
    */
    public static boolean isValid(int num){
        
        for(int i = 300; i < 1000; i++){
            if(num % i == 0 && num/i >= 100 && num/i < 1000){
                return true;
            }
        }
        
        return false;
    }
       
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        
        for(int test = 1; test<=tests; test++){
            
            int n = in.nextInt();
            
            /*
                determine largest palindrome under a certain number and then see if it can be made as a product of 2 3digit numbers
            */
            
            
            
            int temp = n + 1;
            while(temp != -1){
                temp = largestPalindromeUnder(temp);
                if(isValid(temp)){
                  System.out.println(temp);
                  temp = -1;
                }
            }
            
            
            
            
        }
        
        
        
    }
}