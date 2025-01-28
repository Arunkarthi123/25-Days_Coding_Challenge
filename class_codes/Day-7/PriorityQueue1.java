import java.util. PriorityQueue;
public class PriorityQueue1 
{
    public static void main(String[] args) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(20);
        pq.offer(5);
        pq.offer(30);
        System.out.println(pq);
        
    }
}