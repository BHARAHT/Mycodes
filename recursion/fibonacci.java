package recursion;

import java.util.Scanner;

/**
 * fibonacci
 */
public class fibonacci {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        int result=fibonacciSum(n);
        System.out.println(result);
    }

    public static int fibonacciSum(int n) {
        if(n<=1)
        return n;
        else 
        return fibonacciSum(n-1)+fibonacciSum(n-2);
        

    }
}
