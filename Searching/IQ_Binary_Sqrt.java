package Searching;

import java.util.Scanner;

public class IQ_Binary_Sqrt {

    public static int SquareRoot(int num)
    {
        int low=0,high=num,result=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int val=mid*mid;
            if(val==num)
            {
                return mid;

            }
            else if(val<num)
            {
                result=mid;
                low =mid+1;
            }
            else 
            {
                high=mid-1;
            }

        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number you want the square root of :");
        int num =sc.nextInt();
        int result=SquareRoot(num);
        System.out.println("The square root of "+num+ " is "+result);
        
    }
}
