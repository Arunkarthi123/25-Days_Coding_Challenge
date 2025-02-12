import java.util.*;
public class Tree2
{
    public static void main(String[] args) 
    {
        Btree tree = new Btree();
        for(int i = 0 ; i < 10 ; i++)
        {
            tree.insert(i);
        }
        tree.levelOrderTraversal(tree.root);   
    }
}
class Node
{
    int data ;
    Node left ;
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
    Queue<Node> queue ;
    Node root ;
    Queue<Node> q;

    Btree()
    {
        root  = null;
        queue = new LinkedList<>();
        q = new LinkedList<>();
    }
    public void insert(int val)
    {
        Node nn = new Node(val);
        if(root == null)
        {
            root = nn;
        }
        else if(queue.peek().left == null)
            queue.peek().left = nn;
        else
        {
            queue.peek().right = nn;
            queue.poll();
        }
        queue.add(nn);
    }
    public void levelOrderTraversal(Node node)
    {
        if(node == null)
        {
            System.out.print("null ");
            return;
        }
        q.add(node.left);
        q.add(node.right);
        System.out.print(node.data + " ");
            
        Node n = q.poll();
        levelOrderTraversal(n);       
    }
}