package HundredCodingChallenge.Maths;

public class EuclidGCD {
    //GCD(a,b)=GCD(a-b,b) where a>b
    //GCD(a,b)=GCD(b,a%b) .. a>b while a%b!=0

    static int gcd(int a,int b)
    {
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        System.out.println("GCD of 12,78 is:"+gcd(12,78));
        System.out.println("GCD of 12,78 is:"+gcd(65,15));
    }
}
