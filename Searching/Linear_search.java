package Searching;
import java.io.*;
import java.util.*;
public class Linear_search{
    
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
        int index=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==target)
            {
                index=i;
                break;

            }

        }
        if(index==-1)
        {
            System.out.println("Element is not found in the array");
        }
        else
        {
            System.out.println("Target element is found at index : "+index);
        }
        }
}
