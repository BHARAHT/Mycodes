package Searching;
import java.io.*;
import java.util.*;
public class Binary_search{
    
    public static int Binary(int arr[],int target)
    {   int low =0,high =arr.length-1;
        while(low<high)
        {
            int mid=(low+(high-low))/2;
            if(arr[mid]==target)
            return mid;
             if(arr[mid]<=target)
             {
                low=mid+1;
             }
             else
             {
                high=mid-1;
             }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements");

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target value");
        int target = sc.nextInt();
        sc.close();
        
       int result=Binary(arr,target);
        if(result!=0)
        {
            System.out.println("Target element is found at index : "+result);
            
        }
        else
        {
            System.out.println("Element is not found in the array");
        }
        }
}
