
public class BST2 
{
    public static void main(String ar[])
    {
        bst b1=new bst();
        b1.root=b1.insert(45,b1.root);
        b1.root=b1.insert(56,b1.root);
        b1.root=b1.insert(51,b1.root);
        b1.root=b1.insert(69,b1.root);
        b1.root=b1.insert(53,b1.root);
        b1.root=b1.insert(11,b1.root);
        b1.root=b1.insert(19,b1.root);
        b1.root=b1.insert(99,b1.root);
        b1.root=b1.insert(8,b1.root);
        b1.root=b1.insert(51,b1.root);
        b1.root=b1.insert(52,b1.root);
        
        b1.preorder(b1.root);
        System.out.println();
        b1.root=b1.delete(99,b1.root);
        b1.preorder(b1.root);
        System.out.println();
        b1.root=b1.delete(51,b1.root);
        b1.preorder(b1.root);
        System.out.println();
        b1.root=b1.delete(45,b1.root);
        b1.preorder(b1.root);
        
    }
}
class node 
{
    int data;
    node left,right;
    node(int d)
    {
        data=d;
        left=null;
        right=null;
    }
}

class bst 
{
    node root=null;
    node insert(int d, node troot)
    {
        if(troot==null)
        {
        node nnode=new node(d);
        return nnode;
        }
        if(d<troot.data)
        troot.left=insert(d,troot.left);
        else if(d>troot.data)
        troot.right=insert(d,troot.right);
        
        return troot;
        
    }
    
    node delete(int key,node troot)
    {
        if(key<troot.data)
        troot.left=delete(key,troot.left);
        else if(key>troot.data)
        troot.right=delete(key,troot.right);
        else 
        {
            if(troot.right==null)
            return troot.left;
            else if(troot.left==null)
            return troot.right;
            else 
            {
              node temp=predec(troot.left); 
              troot.data=temp.data;
              troot.left=delete(temp.data,troot.left);
            }
        }
        return troot;
    }
    
    node predec(node troot)
    {
      while(troot.right!=null)
      troot=troot.right;
      
      return troot;
    }
    void preorder(node troot)
    {
        if(troot!=null)
        {
            System.out.print(troot.data+" ");
            preorder(troot.left);
            preorder(troot.right);
        }
    }
}
