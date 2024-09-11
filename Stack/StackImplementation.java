package Stack;

import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        Stack <Integer> stack1 =new Stack<>();
        stack1.push(1);
        stack1.push(6);
        stack1.push(0);
        stack1.push(5);

        //display the top element in the stack
        System.out.println("Top element in the stack is "+ stack1.peek());
        // delete the element 
        stack1.pop();
        System.out.println("Top element in the stack is "+ stack1.peek());

        //search for an element in stack
        //if the element is not available in the stack then, the search method returns -1
        System.out.println("Element 1 is present at position : "+ stack1.search(1));
        

        //check wheter stack is empty or not
        System.out.println("Is Stack empty or not? "+ stack1.empty());
    }
}
