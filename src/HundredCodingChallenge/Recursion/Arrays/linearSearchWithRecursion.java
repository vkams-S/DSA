package HundredCodingChallenge.Recursion.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class linearSearchWithRecursion {
    public static void main(String[] args) {
        int[] array={1,2,3,3,4,5};
        System.out.println(search(array,0,3));
        System.out.println(searchIndex(array,0,3));
        searchIndexBoth(array,0,3);
        System.out.println(result);

        System.out.println(searchIndexBothList(array,0,3,new ArrayList<>()));

        searchIndexBothList2(array,0,3);
    }

    static boolean search(int[] arr,int index,int target)
    {
        if(index==arr.length)
            return false;
        return arr[index]==target || search(arr,index+1,target);
    }

    static int searchIndex(int[] arr,int index,int target)
    {
        if(index==arr.length)
            return -1;

        return arr[index]==target?index : searchIndex(arr,index+1,target);
    }

    // if duplicates then return both

    static ArrayList<Integer> result = new ArrayList<>();
    static void searchIndexBoth(int[] arr,int index,int target)
    {
        if(index==arr.length)
            return ;
        if(arr[index]==target)
        {
            result.add(index);
        }
        searchIndexBoth(arr,index+1,target);
    }

    static ArrayList<Integer> searchIndexBothList(int[] arr, int index, int target, ArrayList<Integer>list)
    {
        if(index==arr.length)
            return list;

        if(arr[index]==target)
        {
            list.add(index);
        }
        return searchIndexBothList(arr,index+1,target,list);
    }

    static ArrayList<Integer> searchIndexBothList2(int[] arr, int index, int target)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length)
            return list;

        if(arr[index]==target)
        {
            list.add(index);
        }
      ArrayList<Integer> answerFromBelowCalls = searchIndexBothList2(arr,index+1,target);
        list.addAll(answerFromBelowCalls);
        return list;
    }

}
