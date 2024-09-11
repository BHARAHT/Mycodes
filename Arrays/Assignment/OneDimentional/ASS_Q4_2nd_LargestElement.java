package Arrays.Assignment.OneDimentional;

import java.util.Scanner;

public class ASS_Q4_2nd_LargestElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        
        System.out.println("Enter array elements:");
        for(int j=0;j<n;j++)
        {
            arr[j]=sc.nextInt();
        }
        sc.close();
        // max1
        for(int num:arr)
        {
            max1=Math.max(max1, num);
        }
        //max2
        for(int num:arr)
        {
            if(num!=max1)
            {
                max2=Math.max(max2, num);

            }
        }
        if(max2==Integer.MIN_VALUE)
        System.out.println("No second largest element");
        else
        System.out.println("2nd largest element : "+max2);
    }
}
