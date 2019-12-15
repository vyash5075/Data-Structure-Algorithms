import java.util.*;
public class leftview {
    static class node{
        int data;
        node left;
        node right;
        node(int d)
        {
            left=null;
            right=null;
            this.data=d;
        }
    }
    static node root;
      leftview()
    {
        root=null;
    }
    public static void insert(int data)
    {
        root=insertt(root,data);
    }
    public static node insertt(node root,int data)
    {
        node temp=new node(data);
        if(root==null)
        {
            root=temp;
            return root;
        }
        else if(root!=null)
        {
            
            if(data<root.data)
            {
                insertt(root.left,data);
                if(root.left==null)
                {
                    root.left=temp;
                }
            }
            else
            {
                insertt(root.right,data);
                if(root.right==null)
                {
                    root.right=temp;
                }
            }
            return root;
        }
     return root;
    }
     public static void inorder(node root)
    {if(root!=null)
    {
        inorder(root.left);
          System.out.print(root.data+"->");
         inorder(root.right);     
    }
    }
     public static void leftview()
     {
         
         leftview1(root,1);
     }
     static int temp=0;
     public static void leftview1(node root,int level)
     {
         if(root==null)
         {
             return;
         }
         else{
             if(temp<level)
             {
                 System.out.println(root.data);
                 temp=level;
             }
           
             leftview1(root.left,level+1);
               leftview1(root.right,level+1);
         }
     }
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        leftview l=new leftview();
        l.insert(50);
        l.insert(60);
        l.insert(30);
        l.insert(40);
        l.insert(70);
        l.inorder(root);
        System.out.println("left view of created binary tree is");
       leftview();
    }
}