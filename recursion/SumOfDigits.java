package recursion;

import java.util.Scanner;

/**
 * SumOfDigits
 */
public class SumOfDigits {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int x=sc.nextInt();
        sc.close();
        int result =SumofDigits(x);

        System.out.println("Sum of given Number is : "+result);
    }

    public static int SumofDigits(int x) {
        int result;
        if(x==0)
        return 0;
        else
        {
            result =(x%10)+SumofDigits(x/10);
            return result;
        }
    }
}