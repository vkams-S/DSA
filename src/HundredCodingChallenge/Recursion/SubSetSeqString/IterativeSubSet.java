package HundredCodingChallenge.Recursion.SubSetSeqString;

import java.util.*;

public class IterativeSubSet {
    public static void main(String[] args) {
       /* int[] array ={1,2,3};
        List<List<Integer>> ans = subset(array);
        for(List<Integer> list:ans)
        {
            System.out.println(list);
        }*/
        int[] array1 ={1,2,2,3};
        List<List<Integer>> ans1 = subSetWithDuplicates(array1);
        for(List<Integer> list:ans1)
        {
            System.out.println(list);
        }
    }

    // if there are no duplicates in the array
    // Time taken at each level is O(N)
    // total subsets are 2^N
    // so total time taken O(N*2^N)
    // space complexity : O(N*2^N) - total subsets 2^N  for outer List and N for internal array
    // which will be created for each subset .
    static List<List<Integer>> subset(int[] arr)
    {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr)
        {
            int n=outer.size();
            for(int i=0;i<n;i++)
            {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }


        return outer;

        }

//with duplicates : do not add next element to the left of it.
    // Assumption : array is sorted. or sort the array first.
    static List<List<Integer>> subSetWithDuplicates(int[] arr)
    {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++)
        {
            start=0; // let's assume that start is zero but
            // if current and previous element is same then start=end+1;
            if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }
            end=outer.size()-1;
            int n=outer.size();
            for(int j=start;j<n;j++)
            {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }


        return outer;

    }

    }

