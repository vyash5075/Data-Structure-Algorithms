import java.util.*;
public class delete {
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
      public   static node insert(node root,int data)
    {
        node temp=new node(data);
        if(root==null)
        {
            root=temp;
        }
        else if(root!=null)
        {
            if(temp.data<root.data)
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
     public   static void inorder(node root) 
    { 
        if (root != null) 
        { 
            inorder(root.left); 
            System.out.print(root.data+ " "); 
            inorder(root.right); 
        } 
    }
     public static node delete(node root,int item)
     {
         if(root==null)
         {
             return root;
         }
         if(item<root.data)
         {
             root.left=delete(root.left,item);
         }
         else if(item>root.data)
         {
             root.right=delete(root.right,item);
         }
         else{
             if(root.left==null)
                 return root.right;
             else if(root.right==null)
                 return root.left;
             
             root.data=minvalue(root.right);
             root.right=delete(root.right,root.data);
         }
         return root;
     }
     public static int minvalue(node root)
     {
         int min=root.data;
         while(root.left!=null)
         {
             min=root.left.data;
             root=root.left;
         }
         return min;
     }
      public static void main(String args[])
      {Scanner sc=new Scanner(System.in);
         root= insert(root,50); 
       root= insert(root,30); 
       root= insert(root,20); 
       root=insert(root,40); 
       root= insert(root,70); 
        root=insert(root,60); 
        root=insert(root,80); 
        inorder(root);
        System.out.println("enter the element u want ot delete");
        int m=sc.nextInt();
        delete(root,m);
        inorder(root);
        delete(root,30);
        System.out.println("");
        inorder(root);
         delete(root,50);
          System.out.println("");
        inorder(root);
      }
}
