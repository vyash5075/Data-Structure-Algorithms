import java.util.*;
class height_of_bst {
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
    static node root=null;
    height_of_bst()
    {
        root=null;
    }
    height_of_bst(int item)
    {
        root=new node(item);
    }
    public node insert(node root,int data)
    {
        node temp=new node(data);
        if(root!=null)
        {
            if(data<root.data)
            {
                insert(root.left,data);
                if(root.left==null)
                {
                    root.left=temp;
                }
            }
            else
            {
                insert(root.right,data);
                if(root.right==null)
                {
                    root.right=temp;
                }
            }
            return root;
        }
        return root;
    }
    public int height(node root)
    {
         int count1=0,count2=0;
     
          if(root!=null)
        {
            count1=height(root.left);
            count1++;
            count2=height(root.right);
            count2++;
            return count1>=count2?count1:count2;
        }
       
        return count2;
    }
    public static void main(String args[])
    {
        height_of_bst b =new height_of_bst(50);
               // b.insert(b.root,65 );
                b.insert(b.root, 30);
               // b.insert(b.root,60);
                b.insert(b.root, 100);
                 b.insert(b.root, 60);
                  b.insert(b.root, 70);
                int m=b.height(b.root);
                int n=m-1;
                System.out.println("height of tree is"+n);
        
    }
}
