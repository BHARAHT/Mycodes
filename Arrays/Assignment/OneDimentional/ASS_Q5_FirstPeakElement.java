package Arrays.Assignment.OneDimentional;

import java.util.Scanner;

public class ASS_Q5_FirstPeakElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(int j=0;j<n;j++)
        {
            arr[j]=sc.nextInt();
        }
        sc.close();
        for(int i=1;i<n;i++)
        {
           
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1])
                {
                System.out.println(arr[i]);

                break;
                }            
        }
    }
}
