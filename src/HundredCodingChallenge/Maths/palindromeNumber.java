package HundredCodingChallenge.Maths;

public class palindromeNumber {
    static boolean isPalindrome(int n)
    {
        int original=n;
        int rev=0;
        while(n>0)
        {
            //125 -> 5
            rev = rev*10+n%10;
            n=n/10;
        }
        if(rev==original) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println("is 125 palindrome:"+isPalindrome(125));
        System.out.println("is 121 palindrome:"+isPalindrome(121));
    }
}
