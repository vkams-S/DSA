package HundredCodingChallenge.Maths;

public class computePowerModulo {
    //1. BigInteger
    //2. Catalan Numbers
    //3. pigeonhole principal
    //4. Inclusion-Exclusion
    static long fastPowerModulo(long a,long b,int n){
        //Properties of Modulo:
        // (a+b)%n =(a%n+b%n)%n;
        //(a-b)%n =(a%n-b%n)%n;
        //(a*b)%n =(a%n*b%n)%n;
        long res=1;
        while(b>0)
        {
            if((b&1)!=0) //if b is odd  1. b%2 or b&1
            {
                res=(res*(a%n))%n;
            }
            a=(a%n*a%n)%n;
            b=b >>1; // b/2
        }
        return res;
    }
// (ans^5)%10^9+7
    public static void main(String[] args) {
        System.out.println(fastPowerModulo(3957875,5,1000000007));
    }
}
