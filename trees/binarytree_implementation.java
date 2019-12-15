import java.util.*;
public class binarytree_implementation {
 static class node{
        int data;
        node left;
        node right;
        node(int d)
        {
            this.data=d;
            node left=null;
            node right=null;
        }
        
    }
 public static void preorder(node root)
    {
       if(root==null)
       {
           
            return  ;
       }
       else
           
       {
           System.out.println(root.data);
           preorder(root.left);
           preorder(root.right);
       }
    }
    static node root;
    public static void main(String args[])
    {
        practice p=new practice();
        root=new node(50);
        root.left=new node(46);
        root.right=new node(20);
        root.left.left=new node(34);
        root.left.right=new node(21);
        root.right.left=new node(78);
        root.right.right=new node(90);
        preorder(root);
    }
}