package HundredCodingChallenge.Recursion.Basics;

public class digiProd {
    public static void main(String[] args) {
        System.out.println(digiProd(1234));
    }
    static int digiProd(int n)
    {
        if(n%10==n) return n;
        return (n%10)*digiProd(n/10);
    }
}
