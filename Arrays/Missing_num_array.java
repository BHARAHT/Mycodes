package Arrays;

/**
 * Missing_num_array
 */
public class Missing_num_array {

    public static void main(String[] args) {
        int []arr={1,2,4,6,5,8,7};
        int n=arr.length;
        int sum_of_natural_num=((n+1)*(n+2))/2;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        int miss = sum_of_natural_num-sum;
        System.out.println(miss);


    }
}
//time complexity = O(n)
//space complixity =O(1+)