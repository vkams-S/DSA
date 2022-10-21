package HundredCodingChallenge.Recursion.Basics;

public class ReverseNumber {
    public static void main(String[] args) {
      rev1(123);
        System.out.println(sum);
        System.out.println(rev2(456));
        System.out.println(palindrome(121));
    }
    static boolean palindrome(int n)
    {
        return n==rev2(n);
    }
    static  int sum=0;
    static void rev1(int n)
    {
        if(n==0)
        {
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        rev1(n/10);

    }

    static int rev2(int n)
    {
        int digits = (int)Math.log10(n)+1;
        return helper(n,digits);

    }
    static int helper(int n,int base)
    {
        if(n%10==n) return  n;
        int rem =n%10;
        return rem*(int)Math.pow(10,base-1)+helper(n/10,base-1);
    }
}
