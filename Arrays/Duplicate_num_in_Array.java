package Arrays;

//time complixity= O(n^2)
//space complixity = O(1)
public class Duplicate_num_in_Array {
    public static void main(String[] args) {
        int []arr={1,2,2,3,4};
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
