package recursion;

import java.util.Scanner;

public class PrintMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n:");
        int n = sc.nextInt();
        System.out.println("Enter the number for k:");
        int k = sc.nextInt();
        int result = PrintMulti(n, k);
        System.out.println(result);
    }

    public static int PrintMulti(int n, int k) {
        if (k == 1)
            return n;

        System.out.println(n * k);
        return PrintMulti(n, k - 1);

    }
}
