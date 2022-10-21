package DynamicProgramming;

public class FibonacciApp {
    // 0 1 1 2 3 5 8
    int calculateFibonacci(int n)
    {
        if(n<2) return  n;
        return calculateFibonacci(n-1)+calculateFibonacci(n-2);
    }
    public static void main(String[] args) {
          FibonacciApp App = new FibonacciApp();
        System.out.println(App.calculateFibonacci(3));
        System.out.println(App.calculateFibonacci(5));
        System.out.println(App.calculateFibonacci(6));
    }
}
