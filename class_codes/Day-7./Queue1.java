import java.util.*;
public class Queue1
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i =1 ;i<=10;i++)
        {
            queue.add(i);
        }        
        System.out.println(queue);
        int k = in.nextInt();
        for(int i =1 ;i<=k;i++)
        {
            int m = queue.remove();
            stack.add(m);
        }
        // System.out.println(stack);
        for(int i = 1 ; i<=k;i++)
        {
            int m = stack.pop();
            queue.add(m);
        }
        // System.out.println(queue);
        int n = queue.size();
        for(int i = 1 ; i <= n - k ;i++)
        {
            int m = queue.remove();
            queue.add(m);
        }
        System.out.println(queue);
        
    }
}