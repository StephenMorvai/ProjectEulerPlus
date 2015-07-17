import java.io.;
import java.util.;
import java.text.;
import java.math.;
import java.util.regex.;

public class Solution {

    public static void main(String[] args) {
         Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        for(int test = 1; test=tests; test++){
            
            int n = in.nextInt();
            
            int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37};
            
            int product = 1;
            
            for(int i = 0; primes[i] = n; i++){
                int a = primes[i];
                while(primes[i]a = n){
                    a=primes[i];
                }
                
                product=a;
            }
            System.out.println(product);
            
        }
    }
}