/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;
import java.util.*;
/**
 *
 * @author yash verma
 */
public class delete_bst_element {
    
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
     public static boolean searching(int n,node root)
     {
         if(root==null)
         {
             return false;
             
         }
         else if(n==root.data)
         {
             System.out.println("found");
//             return true;
         }
         else if(n<root.data)
         {
             searching(n,root.left);
         }
         else{
             searching(n,root.right);
         }
         
         return true;
     }
     public static node delete(node root,int data)
     {
         if(root==null)
         {
             return root;
         }
         if(data<root.data)
         {
             root.left=delete(root.left,data);
         }
         else if(data>root.data)
         {
             root.right=delete(root.right,data);
         }
         else{
             if(root.left==null)
             {
                 return root.right;
             }
             if(root.right==null)
             {
                 return root.left;
             }
             root.data=min(root.right);
             root.right=delete(root.right,root.data);
         }
         return root;
     }
     public static int min(node root)
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
{
    Scanner sc=new Scanner(System.in);
    root=insert(root,40);
    root=insert(root,50);
     root=insert(root,25);
     root=insert(root,35);
     root=insert(root,10);
    inorder(root);
    System.out.println("enter the element u want to delete");
    int n=sc.nextInt();
    if(searching(n,root))
            {
                delete(root,n);
            }
    else{
        System.out.println("element not found");
    }
    inorder(root);
}
}
