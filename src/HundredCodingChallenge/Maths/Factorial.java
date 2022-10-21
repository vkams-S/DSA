package HundredCodingChallenge.Maths;

import java.math.BigInteger;

public class Factorial {
    static BigInteger findFactorial(int n)
    {
        if(n==0||n==1) return new BigInteger("1");
        BigInteger fact = BigInteger.valueOf(n).multiply(findFactorial(n-1));
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("factorial of 0 is:"+findFactorial(0));
        System.out.println("factorial of 1 is:"+findFactorial(1));
        System.out.println("factorial of 5 is:"+findFactorial(5));
        System.out.println("factorial of 50 is:"+findFactorial(50));
    }
}
