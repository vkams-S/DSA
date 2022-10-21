package HundredCodingChallenge.Recursion.Patterns;

import java.util.Arrays;

public class patternPrinting {
    public static void main(String[] args) {
       // reverseTriangle(4,0);
       // Triangle(4,0);
        int[] array={10,2,8,3,5,1};
       // bubbleSort(array,array.length-1,0);
        selectionSort(array, array.length,0,0);
        System.out.println(Arrays.toString(array));
    }
    /*
            *   *   *   *
            *   *   *
            *   *
            *
     */

    static  void reverseTriangle(int r, int c)
    {
        if(r==0){
            return;
        }
        if(c<r)
        {
            System.out.print("*\t");
            reverseTriangle(r,c+1);
        }else{
            System.out.println();
            reverseTriangle(r-1,0);
        }

    }

    static  void Triangle(int r, int c)
    {
        if(r==0){
            return;
        }
        if(c<r)
        {
            Triangle(r,c+1);
            System.out.print("*\t");
        }else{
            Triangle(r-1,0);
            System.out.println();
        }
    }

    static  void bubbleSort(int[] arr, int r, int c)
    {
        if(r==0){
            return;
        }
        if(c<r)
        {
            if(arr[c]>arr[c+1])
            {
                //swap
                int temp=arr[c+1];
                arr[c+1]=arr[c];
                arr[c]=temp;
            }
            bubbleSort(arr,r,c+1);

        }else{
            bubbleSort(arr,r-1,0);

        }
    }

    static  void selectionSort(int[] arr, int r, int c,int max)
    {
        if(r==0){
            return;
        }
        if(c<r)
        {
            if(arr[c]>arr[max])
            {
                selectionSort(arr,r,c+1,c);
            }else{
                selectionSort(arr,r,c+1,max);
            }

        }else{
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            selectionSort(arr,r-1,0,0);

        }
    }
}
