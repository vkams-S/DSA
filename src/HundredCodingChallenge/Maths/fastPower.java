package HundredCodingChallenge.Maths;

public class fastPower {
    // a^b = (a^2)^(b/2) of b is even
    // a^b = (a)*(a^(b-1)) of b is odd
    static int fastPower(int a,int b){
        int res=1;
        while(b>0)
        {
            if((b&1)!=0) //if b is odd  1. b%2 or b&1
            {
                res=res*a;
            }
            a=a*a;
            b=b >>1; // b/2
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.print(fastPower(2,4));
    }

}
