import java.util.Scanner;

/**
 * PowerOfNumber
 */
public class PowerOfNumber {

    public static int powerof(int a,int b)
    {
        int mid,result;
        if(b==1)
        return a;
        else
        {
            mid=b/2;
            result=powerof(a, mid);
            
        }
        int final_result=result*result;
        if(b%2==0)
        return final_result;
        else
        return a*final_result;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter base number value");
        int a=sc.nextInt();
        System.out.println("Enter power number value");
        int b=sc.nextInt();
        sc.close();
        int result=powerof(a,b);
        System.out.println("a^b = "+result);

    }
}