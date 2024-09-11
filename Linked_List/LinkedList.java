package Linked_List;

public class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    public void DeleteNode(int position)
    {
        if(head==null)
        {
            return;
        }
        Node temp=head;
        //deletion from the beginning
        if(position==0)
        {
            head=temp.next;
            return;
        }
        //deletion from other locations
        for(int i=0;temp!=null&&i<position-1;i++)
        {
            temp=temp.next;
        }
        if(temp==null&&temp.next==null)
        {
            return;
        }
        temp.next=temp.next.next;


    }
    //Insertion of a node at the end
    public void InsertionAtEnd(int newData) {
        Node newNode = new Node(newData);

        // Check LinkedList is Empty or not
        if (head == null) {
            head = new Node(newData);
            return;
        }

        newNode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

//Insertion of a node at Beginning
    public void InsertionAtBeginning(int newData)
    {
        Node newNode=new Node(newData);
        newNode.next=head;
        head=newNode;
    }
    //Insertion of a node at any position
    public void InsertionAfter(Node prev_node,int newData)
    {
        if(prev_node==null)
        {
        System.out.println("Previous node cannot contain Null value");
        return;
        }
        Node newNode=new Node(newData);
        newNode.next=prev_node.next;
        prev_node.next=newNode;

    }
    

//printing of nodes
    public void printNodes()
    {
        Node current = head;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    //Reversal of linked list using iterative approch
    public void ReverseLL()
    {
        Node curr=head;
        Node prev=null;
        Node next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    //Reversal of linked list using Recursive approch
    public void reversalRec(Node curr,Node prev)
    {
        //last node of linked list
        if(curr.next==null)
        {
            head=curr;
            curr.next=prev;
            return;
        }
        Node nextptr=curr.next;
        curr.next=prev;
        reversalRec(nextptr, curr);
    }
    //Implementation to find the middle node of a linked list
    public void middleNode()
    {
        Node slow=head;
        Node fast =head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
    //Implementation of finding out cycle in linked list
    public void detectLoop()
    {
        Node slow=head;
        Node fast=head;
        int flag=0;
        while(slow!=null && fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                flag=1;
                break;
            }   

        }
        if(flag==0)
        System.out.println("No Loop detected");
        else
        System.out.println("Loop is detected");
    }
    public static void main(String[] args) {
        LinkedList llist=new LinkedList();
        llist.InsertionAtEnd(15);
        llist.InsertionAtEnd(5);
        llist.InsertionAtEnd(2005);
        llist.InsertionAtEnd(2024);

        // System.out.println("Before insertion of 10");
        // llist.printNodes();
        // System.out.println();
        // llist.InsertionAtEnd(10);
        
        
        llist.InsertionAfter(llist.head.next.next, 20);
        // llist.printNodes();
        // System.out.println();
        // llist.DeleteNode(0);
        // System.out.println("After deleting at position 0");
        // llist.printNodes();
        // System.out.println("\nAfter deleting at position 4");
        // llist.DeleteNode(4);
        // llist.DeleteNode(4);
        // System.out.println();
        
       

        // System.out.println("Linked List after successful insertion of all nodes :");
        // llist.printNodes();
        // System.out.println();
        // // llist.ReverseLL();
        

        
        // System.out.println();
        // llist.reversalRec(llist.head, null);
        llist.printNodes();
        // System.out.println("\nPrinting of Middle node of linked list");
        // llist.middleNode();

        System.out.println();
        //circular linked list structure
        Node temp=llist.head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=llist.head;

        llist.detectLoop();
    }
}
