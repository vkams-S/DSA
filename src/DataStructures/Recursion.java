package DataStructures;

public class Recursion {
    public static int getMax(int [] numbers,int length)
    {
        int max=0;
        //let's check if the length is > 0
        if(length>0) {
            // let check if the length is one then return the number directly
            if (length == 1) return numbers[length - 1];
            // now apply divide and conquer
            max=getMax(numbers,length-1);
            max=numbers[length-1]>max?numbers[length-1]:max;
        }
        return max;
    }

    public static void main(String[] args) {
        int numbers[] = {30};
        int max = getMax(numbers,-1);
        System.out.println("Maximum number is: "+max);
    }
}
