package Arrays;
public class Reverse_Array {
    public static void main(String[] args) {
        int []arr={2,5,3,7,1};
        for(int i=0;i<(arr.length)/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
            
        }
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+"  ");
        }
    }
}
