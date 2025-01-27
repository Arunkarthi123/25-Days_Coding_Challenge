
import java.util.*;
public class Queue2
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        System.out.println("Enter the range :");
        int k = in.nextInt();
        for(int i = 1 ; i<=k ; i++)
        {
            String binary = queue.remove();
            System.out.println(i+"-->"+binary);
            queue.add(binary+"0");
            queue.add(binary+"1");
        }
        
    }
}