public class LinkedList1
{
    Node head;
    Node tail;
    LinkedList1()
    {
        this.head = null ;
        this.tail = null ;
    }
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    private void insertAtBeginning(int data)
    {
        Node nn = new Node(data);
        if(this.tail == null)
        {
            this.tail = nn;
        }
        else
        {
            nn.next = this.head;
        }
        this.head= nn;
    }
    private void insertAtSpecificPosition(int data , int pos)
    {
        Node nn = new Node(data);
        if(pos == 1)
        {
            nn.next= head;
            head = nn;
            return;
        }
        Node temp = head;
        for(int i = 1 ; i < pos-1 && temp != null ; i++)
        {
            temp = temp.next;
        }
        if(temp == null)
        {
            System.out.println("Invalid position");
            return;
        }
        nn.next = temp.next;
        temp.next = nn;
    }
    private void insertAtLast(int data)
    {
        Node nn = new Node(data);
        if(head == null)
        {
            head = nn;
        }
        else
        {
            tail.next = nn;
        }
        tail = nn;
    }
    private void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data +"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    static public void main(String args[])
    {
        LinkedList1 list = new LinkedList1();
        LinkedList1 list2 = new LinkedList1();
        LinkedList1  list3 = new LinkedList1();
        list3.insertAtBeginning(10);

        for(int i = 1 ; i < 10 ; i++)
        {
            list.insertAtBeginning(i);
            list2.insertAtLast(i+i);
            list3.insertAtSpecificPosition(i*i, i);
        }
        
        list.printList();
        list2.printList();
        list3.printList();
    }
}