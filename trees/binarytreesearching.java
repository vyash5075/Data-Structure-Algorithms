import java.util.*;
public class binarytreesearching {
    static class node{
        int data;
        node left;
        node right;
        node(int d)
        {
            this.data=d;
            left=null;
            right=null;
        }
    }
    static node root;
    public static void inorder( node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
    public static boolean  search(node root,int item)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==item)
        {
            return true; 
        }
        
            boolean left=search(root.left,item);
            if(left)
            
                return true;
            
            
                boolean right=search(root.right,item);
         return right;
    }
    public static int right(node root)
    {
        if(root.left==null&&root.right==null)
        {
            return root.data;
        }
        else{
            right(root.right);
        }
        return root.data;
    }
    public static void main(String args[])
    {Scanner sc=new Scanner(System.in);
        node root=new node(40);
        root.left=new node(50);
        root.right=new node(60);
        root.left.left=new node(67);
        root.left.right=new node(68);
        inorder(root);
        System.out.println("enter the item to search");
        int item=sc.nextInt();
        boolean flag=search(root,item);
        if(flag)
        {
           System.out.println("present");
        }
    }
}
