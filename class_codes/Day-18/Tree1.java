import java.util.LinkedList;
import java.util.Queue;
public class Tree1
{
    public static void main(String argep[])
    {
        Btree tree = new Btree();
        for(int i = 0 ; i< 10 ; i++)
            tree.insert(i);
        Node root = tree.root;
        tree.preTraversal(root);
    }
}
class Node
{
    int data;
    Node left;
    Node right;
    public Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class Btree
{
    Node root ;
    Queue<Node> queue;
    public Btree()
    {
        root = null;
        queue = new LinkedList<>();
    }
    public void insert(int val)
    {
        Node nn = new Node(val);
        queue.add(nn);
        if(root == null)
        {
            root = nn;
        }
        else if(queue.peek().left == null)
            queue.peek().left = nn;
        else if(queue.peek().right == null)
        {
            queue.peek().right = nn;
            queue.poll();
        }

    }
    public void preTraversal(Node root)
    {
        if(root == null)
            return;
        System.out.print(root.data+" ");
        this.preTraversal(root.left);
        this.preTraversal(root.right);
    }
    public void postTraversal(Node root)
    {
        if (root == null)
            return ;
        this.postTraversal(root.left);
        this.preTraversal(root.right);
        System.out.print(root.data+" ");
    }
    public void inOrderTraversal(Node root)
    {
        if (root == null)
            return ;
        this.postTraversal(root.left);
        System.out.print(root.data+" ");
        this.preTraversal(root.right);
    }

}