package Queue;

import java.util.Stack;

/**
 * Queue_uning_Stack
 */
public class Queue_uning_Stack {

    static Stack<Integer> stack1 =new Stack<>();
    static Stack<Integer> stack2 =new Stack<>();
    static void enQueue(int data)
    {
        stack1.push(data);
    }
    static int deQueue()
    {
        int ele;
        if(stack1.empty() && stack2.empty())
        {
            System.out.println("Queue is empty");
            System.exit(0);
        }
        if(stack2.empty())
        {
            while(!stack1.empty())
            {
                ele=stack1.pop();
                stack2.push(ele);
            }
        }
        ele=stack2.pop();
        return ele;
    }
    public static void main(String[] args) {
       Queue_uning_Stack q=new Queue_uning_Stack();
       q.enQueue(1);
       q.enQueue(2);
       q.enQueue(3);
       q.enQueue(4);
       q.enQueue(5);

      System.out.println("Deleted element is  "+q.deQueue()); 
      System.out.println("Deleted element is  "+q.deQueue()); 

    }
}