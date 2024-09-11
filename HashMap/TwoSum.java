import java.util.HashMap;
import java.util.Scanner;

/**
 * TwoSum
 */
public class TwoSum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        System.out.println("Enter the Array values");
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter the target value");
        int target =sc.nextInt();

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(arr[i],i);
        }
        int result[]=new int[2];
        //if the current element is equal to the target elemtnt
        for(int i=0;i<n;i++)
        {
            if(arr[i]==target&&map.containsKey(0))
            {
                result[0]=i;
                result[1]=map.get(0);
                break;
            }
            else if(map.containsKey(target-arr[i]))
            {
                //if element is not repetable
                if(map.get(target-arr[i])>i)
                {
                    result[0]=i;
                    result[1]=map.get(target-arr[i]);
                    break;
                }
            }
        }
        System.out.println("The resultant array is : [ "+result[0] +" , "+result[1]+" ]");
    }
}