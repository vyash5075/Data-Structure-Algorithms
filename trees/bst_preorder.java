import java.util.*;
public class bst_preorder {
    static class node{
        int data;
        node left;
        node right;
        node (int d)
        {
            this.data=d;
            left=null;
            right=null;
        }
    }
    static node root;
    public static node insert(node root,int data)
    {
        node temp=new node(data);
        if(root==null)
        {
            root=temp;
            return root;
        }
        else{
            if(data<root.data)
            {
                insert(root.left,data);
                if(root.left==null)
                {
                    root.left=temp;
                } 
            }
            else{
                insert(root.right,data);
                if(root.right==null)
                {
                    root.right=temp;
                }
            }
        }
        return root;
    }
    public static void preorder(node root)
    {
        if(root!=null)
        {
           
            System.out.println(root.data);
             preorder(root.left);
            preorder(root.right);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of entries");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
          root= insert(root,sc.nextInt());
        }
        System.out.println("preorder");
        preorder(root);
    }   
}
