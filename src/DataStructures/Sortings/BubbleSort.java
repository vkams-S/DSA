package DataStructures.Sortings;

public class BubbleSort {
    static void swap(int[] arr,int n, int m)
    {
        int temp=arr[m];
        arr[m]=arr[n];
        arr[n]=temp;
    }
    static void bubbleSort(int[] arr){
        int size=arr.length;
        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j<size-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap(arr,j,j+1);
                }
            }
        }
    }
    static  void printArray(int[] arr)
    {
        System.out.print("[");
        for(int ele:arr)
        {
            System.out.print(ele+",");
        }
        System.out.print("]");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] productPrices ={1200,1100,3500,500,350,1900};
        System.out.println("Before sorting.");
        printArray(productPrices);
        bubbleSort(productPrices);
        System.out.println("After sorting.");
        printArray(productPrices);

    }
}
