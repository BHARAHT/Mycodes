package Stack;

import java.util.Scanner;
import java.util.Stack;

public class VaildParantheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        System.out.println("Is the string contains valid parantheses : " + isValid(str));
    }

    public static boolean isValid(String str) {
        char[] ch = str.toCharArray();

        Stack<Character> stack1 = new Stack<>();
        for (char ele : ch) {
            if (ele == '(' || ele == '{' || ele == '[') {
                stack1.push(ele);
                continue;
            } else if (stack1.empty())
                return false;
            char top = stack1.pop();
            // there is no mapping
            if(top=='[' && ele!=']')
            return false;

            else if(top=='(' && ele!=')')
            return false;

            else if(top=='{' && ele!='}')
            return false;

        }
        return(stack1.empty()==true);
    }
}
