package recursion;

import java.util.Scanner;

/**
 * factorial
 */
public class factorial {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int result=factorialNum(n);
        System.out.println(result);

    }
   public static int  factorialNum(int n)
   {
    if(n==0|| n==1)
    return 1;
    
    int result= n*factorialNum(n-1);
    return result;

   
   }
}