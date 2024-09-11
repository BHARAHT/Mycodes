package Arrays.Assignment.OneDimentional;

import java.util.Scanner;

/**
 * ASS_Q1_SumOfEvenIndex
 */
public class ASS_Q1_SumOfEvenIndex {

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
       
        int sum=0;
       
        for(int i=0;i<n;i++)
        {
           
            if(i%2==0)
            {
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}
