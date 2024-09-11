package Arrays.Assignment.OneDimentional;

import java.util.Scanner;

public class ASS_Q3_MaxElement {
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
        int maxele=arr[0];
        for(int i=0;i<n;i++)
        {
          if(arr[i]>maxele)
          maxele=arr[i];
        }
        System.out.println(maxele);
    }
}
