package HundredCodingChallenge.Maths;

public class TrailingZeroOfFactorial {
    static int findTrailingZero(int n)
    {
        //find pairs of 2 and 5
        // n/5+n/25+n/125....
        int res=0;
        if(n>=5) {
            for (int i = 5; i < n; i *= 5) {
                    res += n/i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Trailing 0 of 0 is:"+findTrailingZero(0));
        System.out.println("Trailing 0 of 1 is:"+findTrailingZero(1));
        System.out.println("Trailing 0 of 5 is:"+findTrailingZero(5));
        System.out.println("Trailing 0 of 50 is:"+findTrailingZero(50));
        System.out.println("Trailing 0 of 100 is:"+findTrailingZero(100));
    }
}
