package Arrays;

import java.util.Scanner;

/**
 * Looping2DArray
 */
public class Looping2DArray {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of rows in an array");
        int m=sc.nextInt();
        System.out.println("Enter the number of columns in an array");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Enter 2d array elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
        System.out.println("Print the array");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}