import java.util.*;
public class isbst {
  static class node
    {
        int data;
        node left;
        node right;
    
    node(int d)
    {
          this.data=d;
          left = right = null;
          
    }  
  }
      static boolean isBST(node root,node l,node r)
        {
            if(root == null)
              return true;
            
            if(l != null && root.data <= l.data)
                return false;
            
            if(r != null && root.data >= r.data)
                return false;
            
            return isBST(root.left,l,root) && isBST(root.right,root,r);
        }
    public static void main(String args[])
    {
        node root =new node(40);
        root.left = new node(20);
        root.right= new node(60);
        root.left.left=new node(10);
        root.left.right=new node(35);
        root.right.left=new node(50);
        root.right.right=new node(70);
        root.left.left.left=new node(5);
   //  root.left.left.right=new node(25);
        if( isBST(root,null,null))
        {
            System.out.println("bst ");
        }
        else{
             System.out.println(" not bst ");
        }
    }
}


