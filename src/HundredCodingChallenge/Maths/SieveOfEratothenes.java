package HundredCodingChallenge.Maths;

import java.util.Arrays;

public class SieveOfEratothenes {
    // to find if a number is prime or not
    // any number is prime if factors are numbers itself and one
    // to check all the factors if there is no other factor till
    // rootSquare of the number -> there will be not factors after that.
    // So to find out how many prime numbers are there b/w 1-1000 , so we do not have to each and every number
    // this algorithm can give the answer efficiently
    static int numberOfPrime(int n)
    {
        boolean arr[] = new boolean [n+1];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        int np=0;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            for(int j=i*2;j<=n;j+=i)
            {
                arr[j]=false;
            }
        }
        for(int i=0;i<n+1;i++)
        {
            if(arr[i]==true)
            {
                np++;
            }
        }
        return np;
    }

    public static void main(String[] args) {
        System.out.println("Number of prime b/w 1 and 100 is:"+numberOfPrime(100));
    }

}
