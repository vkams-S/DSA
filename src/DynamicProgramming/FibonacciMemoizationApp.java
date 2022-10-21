package DynamicProgramming;

import java.util.LinkedHashMap;

public class FibonacciMemoizationApp {
    // 0 1 1 2 3 5 8

    int calculateFibonacci(int n)
    {
        int [] cache = new int[n+1];
        //LinkedHashMap<Integer,Integer> DpCache = new LinkedHashMap<>();
       return calculateFibonacciWithMemoization(cache,n);
    }
    int calculateFibonacciWithMemoization(int[] cache,int n)
    {
        if(n<2) return  n;
        if(cache[n]!=0) return cache[n];
        cache[n]=calculateFibonacciWithMemoization(cache,n-1)+calculateFibonacciWithMemoization(cache,n-2);
        return cache[n];
    }
    public static void main(String[] args) {
        FibonacciApp App = new FibonacciApp();
        System.out.println(App.calculateFibonacci(3));
        System.out.println(App.calculateFibonacci(5));
        System.out.println(App.calculateFibonacci(6));
    }
}
