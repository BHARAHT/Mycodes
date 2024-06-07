package recursion;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        
        int arr[]={2,4,8,12,17,24,27,39,47};
        int low=0;
        int high=arr.length-1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target element :");
        int target=sc.nextInt();
        int result=Binary_Search(arr,low,high,target);
        if(result ==-1)
        System.out.println("Element not found");
        else
        System.out.println("Index at which the target element is found is "+result);

    }

    public static int Binary_Search(int[] arr, int low, int high, int target) {
        
        while(low<high)
        {
            int mid=low+(high-low)/2;
             if(arr[mid]==target)
             return mid;

             else if(arr[mid]<target)
             return Binary_Search(arr, mid+1, high, target);
             else{
                return Binary_Search(arr, low, mid-1, target);
             }
        }
        return -1;
        
    }
}
