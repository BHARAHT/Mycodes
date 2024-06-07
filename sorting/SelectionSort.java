package sorting;

import java.util.Arrays;

/**
 * SelectionSort
 */
public class SelectionSort {

    public static void Selectionsort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int min_idx=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min_idx])
                {
                    min_idx=j;
                }
              
            }
            if(min_idx!=i)
            {
                int temp=arr[min_idx];
                arr[min_idx]=arr[i];
                arr[i]=temp;
            
            }        
        }
    }
    public static void main(String[] args) {
        int arr[]={50,25,38,44,99,16,11,21};
        Selectionsort(arr);
        System.out.println("Sorted array is: ");
        System.out.println(Arrays.toString(arr));
    }
}
