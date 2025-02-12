public class BST1
{
    public static void main(String[] args)
    {
        Btree tree = new Btree();
        tree.root = tree.insert(tree.root, 25);
        tree.root = tree.insert(tree.root, 25);
        tree.root = tree.insert(tree.root, 25);
    }
}   
class Node
{
    int data;
    Node left ;
    Node right ;
    Node(int val)
    {
        data = val;
        left = null;
        right = null;
    }
}                                
class Btree
{
    Node root = null;
    public Node insert(Node troot , int d)
    {
        if(troot == null)
            return new Node(d);
        if(troot.data < d)
            troot.left = this.insert(troot.left , d);
        else if(troot.data > d)
            troot.right = this.insert(troot.right , d);
        return troot;
    }
}