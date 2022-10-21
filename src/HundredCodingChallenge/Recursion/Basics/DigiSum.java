package HundredCodingChallenge.Recursion.Basics;

public class DigiSum {
    public static void main(String[] args) {
        System.out.println(digiSum(1234));
    }
    static int digiSum(int n)
    {
        if(n==0) return 0;
        return (n%10)+digiSum(n/10);
    }
}
