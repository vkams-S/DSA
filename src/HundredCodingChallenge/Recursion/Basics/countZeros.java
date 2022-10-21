package HundredCodingChallenge.Recursion.Basics;

public class countZeros {
    public static void main(String[] args) {
        System.out.println(count(20304));
    }
    static int count(int n)
    {
        return helper(n,0);
    }
// special pattern : how to pass value to above function call.
    private static int helper(int n, int i) {
        if(n==0) return i;
        int rem=n%10;
        if(rem==0) {
            return helper(n/10,i+1);
        }
        return helper(n/10,i);
    }
}
