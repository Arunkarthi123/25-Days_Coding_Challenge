import java.util.*;
public class Queue3
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        Queue<Character> queue = new LinkedList<>();
        for(int i = 0 ; i<26 ; i++)
        {
            char ch = (char) ('a'+i);
            queue.add(ch);
        }
        System.out.println("Enter pass :");
        int k = in.nextInt();
        while(queue.size()!=1)
        {
            for(int i =1 ; i<=k;i++)
            {
                queue.add(queue.remove());
            }
            queue.remove();
        }
        System.out.println("Wninner :"+queue.remove());
    }
}