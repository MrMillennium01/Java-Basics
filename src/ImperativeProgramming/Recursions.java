package ImperativeProgramming;

import java.util.HashMap;
import java.util.Map;

public class Recursions {
    private final Map<Integer, Long> memo = new HashMap<>();

    public void main(String[] args){
        System.out.println(fib(50));
    }

    public static int Fib(int fib){
        if (fib<=1){
            return 0;
        }
        if (fib==2){
            return 1;
        }
        return Fib(fib-1) + Fib(fib-2);
    }

    public long fib(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        if (n <= 1) return n;                  // base cases: F(0)=0, F(1)=1 [web:3]
        if (memo.containsKey(n)) return memo.get(n);  // return cached result if present [web:1][web:2]

        long result = fib(n - 1) + fib(n - 2); // recursive relation F(n)=F(n-1)+F(n-2) [web:3]
        memo.put(n, result);                   // cache the computed value [web:1][web:2]
        return result;
    }
}


// 0,1,1,2,3,5,8,13,21,34
