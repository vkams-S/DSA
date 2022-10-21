package HundredCodingChallenge.Recursion;

public class MatrixPath {
    /*
            you have nXn matrix , where you can only move right or down
            find the number of ways to reach from point a to point b.
     */
    static int findPath(int mat[][],int n,int m){
        //1. base case: if you have only one row or column then
        // you have only one way to reach to the destination
        //
        if(n==1||m==1) return 1;
        return findPath(mat,n,m-1)+findPath(mat,n-1,m);
    }
}
