package HundredCodingChallenge.Recursion.Arrays;

public class ArrayIsSorted {
    public static void main(String[] args) {
      int[] array ={1,2,3,8,5,6};
        System.out.println(isSorted(array,0));
    }

    static boolean isSorted(int[] arr,int index)
    {
        if(index==arr.length-1)
            return true;
        return arr[index]<arr[index+1] && isSorted(arr,index+1);
    }
}
