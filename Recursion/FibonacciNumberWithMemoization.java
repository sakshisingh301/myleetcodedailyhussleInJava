import java.util.HashMap;

public class FibonacciNumberWithMemoization {
    HashMap<Integer,Integer> cache=new HashMap<>();
    
        public int fib(int n) {


            int result=0;
            //memoization: storing the element so that we dont have to recompute
            if(cache.containsKey(n)) return cache.get(n);
            if(n<2)
            {
                return n;
            }
            else
            {
                result=fib(n-1)+fib(n-2);
            }
            cache.put(n,result);
            return result;
        }

}
