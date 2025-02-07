
public class Reverse
{
    public static void main(String[] args) 
    {
        LinkedList l1 = new LinkedList();
        for(int i =1 ;i<6;i++)
        {
            l1.insertAtBeginning(i);
        }   
        System.out.println(l1);
        l1.reverse();
        System.out.println(l1);
    }
}
class LinkedList
{
    static class Node
    {
        int data ;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
        @Override
        public String toString()
        {
            System.out.println(data);
            return ""+data;
        }
    }
    Node head ;
    public LinkedList()
    {
        this.head = null;
    }
    public void insertAtBeginning(int val)
    {
        Node nn = new Node(val);
        if(head == null)
        {
            head = nn;
            return;
        }
        nn.next = head;
        head = nn;
    }
    public void insertAtLast(int val)
    {
        Node nn = new Node(val);
        if(head == null)
        {
            head = nn;
            return ;
        }
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = nn;
    }
    public void insertAtSpecificPosition(int val , int pos)
    {
        Node nn = new Node(val);
        Node temp = head;
        if(pos == 1)
        {
            this.insertAtBeginning(val);
        }
        for(int i = 2 ; i < pos && temp != null ; i++ )
        {
            temp = temp.next;
        }
        if(temp ==null || pos < 0)
        {
            System.out.println("Invalid position");
            return;
        }
        temp.next = nn;
    }
    public boolean isEmpty()
    {
        return head == null;
    }
    public int deleteAtFirst()
    {
        if(isEmpty())
        {
            System.out.println("List is empty !!!");
            return -1;
        }
        int val = head.data;
        head = head.next;
        return val;
    }
    public int deleteAtLast()
    {
        if(isEmpty())
        {
            System.out.println("List is empty !!!");
            return -1;
        }
        if(head.next == null)
        {
            int val = head.data;
            head = null;
            return val;
        }
        Node temp = head;
        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        int val = temp.data;
        temp.next = null;
        return val;
    }
    public int deleteAtSpecificPosition(int pos)
    {
        int val;
        if(pos == 1)
        {
            return deleteAtFirst();
        }
        if(head == null)
        {
            System.out.println("List is empty !!!");
            return -1;
        }
        if(head.next == null )
        {
            return this.deleteAtFirst();
        }
        Node temp = head;
        int i;
        for(i = 2 ; i < pos && temp.next.next != null ; i++)
        {
            temp = temp.next;
        }
        if(i != pos)
        {
            System.out.println("Invalid position");
            return -1;
        }
        val = temp.next.data;
        temp.next = temp.next.next;
        return val;
    }
    public void reverse()
    {
        if(head == null || head.next == null)
        {
            return;
        }
        Node prev = null;
        Node cur = head;
        Node next;
        while(cur != null)
        {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
    }
    @Override
    public String toString()
    {
        Node temp = head;
        String str = "";
        while(temp != null)
        {
            str = str + temp.data +"->";
            temp = temp.next;
        }
        str = str + "null";
        return str;
    }
}