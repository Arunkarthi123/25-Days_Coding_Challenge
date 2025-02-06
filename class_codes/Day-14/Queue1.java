import java.util.*;
public class Queue1 
{
    public static void main(String ar[])
    {
        Scanner s=new Scanner(System.in);
        queue q1=new queue(s.nextInt());
        q1.enqueue(67);
        q1.enqueue(61);
        q1.enqueue(100);
        q1.enqueue(70);
        q1.enqueue(11);
        q1.enqueue(30);
        q1.display();
        q1.dequeue();
        q1.display();
        q1.dequeue();
        q1.display();
        q1.dequeue();
        q1.display();
        q1.dequeue();
        q1.display();
        q1.dequeue();
        q1.display();
        q1.dequeue();
        q1.display();
        q1.enqueue(6);
        q1.display();
    }
}

class queue 
{
    int front,rear;
    int arr[];
    int cap;
    queue(int s)
    {
        cap=s;
     arr=new int[s]; 
     front=0;
     rear=0;
    }
    
    boolean isfull()
    {
        return rear==cap;
    }
    
   void enqueue(int d)
    {
      if(isfull())
      {
          System.out.println("Queue is full");
      }
      else
      {
          arr[rear++]=d;
      }
    }
    
    boolean isempty()
    {
        return front==rear;
    }
    int dequeue()
    {
        if(isempty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            int temp=arr[front];
            for(int i=1;i<rear;i++)
            arr[i-1]=arr[i];
            rear--;
            return temp;
        }
    }
    
    int peek()
    {
        if(isempty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            return arr[front];
            
        }
    }
    
    void display()
    {
        if(isempty())
        {
            System.out.println("Queue is empty");
            return;
        }
        else
        {
            for(int i=0;i<rear;i++)
            System.out.print(arr[i]+" ");
            System.out.println();
        }
    }
}

