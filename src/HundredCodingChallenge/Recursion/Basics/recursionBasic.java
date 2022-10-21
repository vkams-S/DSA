package HundredCodingChallenge.Recursion.Basics;

public class recursionBasic {
    /*
    3 steps of recursion
    1. Find the base case
    2. Find the relation b/w problem and sub problem
    3. Generalize the relation
     */

    static int finSumOfNaturalNumber(int n)
    {
        //1. find base case
        if(n==1) return 1;
        //2. find relation b/w problem and sub problem
        // if sum of 1st 4 natural numbers are already available[Recursive leap of faith] then how can we find the sum of
        // 1st 5 natural number ? sum(5)=sum(4)+5
        //3. generalization : f(n)=f(n-1)+n;
        return finSumOfNaturalNumber(n-1)+n;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 1st 10 natural numbers are:"+finSumOfNaturalNumber(5));
    }
}
