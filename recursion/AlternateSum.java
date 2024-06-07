package recursion;

import java.util.Scanner;

/**
 * AlternateSum
 */
public class AlternateSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int result=AlternateSumOfSeries(n);
        System.out.println(result);
    }

    public static int AlternateSumOfSeries(int n) {
        if(n==0)
        return 0;
        else if(n%2==0)
        {
           return AlternateSumOfSeries(n-1)-n;
        }
        else
        {
            return AlternateSumOfSeries(n-1)+n;
        }
    }
}