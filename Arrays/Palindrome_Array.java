package Arrays;

/**
 * Palindrome_Array
 */
public class Palindrome_Array {

    public static void main(String[] args) {
        
        int []a={1,4,3,3,4,1};
        int n=a.length;
        int flag=0;
        for(int i=0;i<n/2;i++)
        {
            if(a[i]!=a[n-i-1])
            {
                flag=1;
                System.out.println("Not a Palindrome");
                break;
            }   
        }
        if(flag==0)
        System.out.println("Palindrome");
    }
}