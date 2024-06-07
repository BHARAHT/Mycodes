package Arrays;
import java.util.Scanner;

/**
 * Prefix_sum_2D
 */
public class Prefix_sum_2D {

//row wise prefix sum
    public static void prefixMatrix(int [][]arr)
    {
        int m=arr.length;
        int n =arr[0].length;
         for(int i=0;i<m;i++)
         {
            for(int j=1;j<n;j++)
            {
                arr[i][j]=arr[i][j-1];

            }
        }

        //column wise prefix sum
        for(int j=0;j<n;j++)
         {
            for(int i=1;i<m;i++)
            {
                arr[i][j]=arr[i-1][j];
                
            }
        }
    }
     public static int sum_region(int [][]arr,int r1,int c1,int r2,int c2)
     {
        int up=0,left=0,sum=0,repeated_again=0,result=0;
        sum=arr[r2][c2];
        up=arr[r1-1][c2];
        left=arr[r2][c1-1];
        repeated_again=arr[r1-1][c1-1];
        System.out.println("Total sum: "+sum);
        result=sum+up+left-repeated_again;
        return result;
     }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int m=sc.nextInt();
        System.out.println("Enter the number of columns");
        int n=sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Enter the matrix elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter r1");
        int r1=sc.nextInt();
        System.out.println("Enter c1");
        int c1=sc.nextInt();

        System.out.println("Enter r2");
        int r2=sc.nextInt();
        System.out.println("Enter c2");
        int c2=sc.nextInt();

        prefixMatrix(arr);
        int result=sum_region(arr, r1, c1, r2, c2);
        System.out.println("Sum of elements of given rectangle is "+result);


         }
         public static int findSumMatrix(int [][]arr,int r1,int c1,int r2,int c2)
         {
            int sum=0;
            for(int i=r1;i<=r2;i++)
            {
                for(int j=c1;j<=c2;j++)
                {
                    sum+=arr[i][j];

                }
            }
            return sum;
         }
    }