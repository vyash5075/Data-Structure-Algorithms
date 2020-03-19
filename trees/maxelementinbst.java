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
public class maxelementinbst {
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
   static node root;
   public static  node insert(node root,int data)
{
    node temp=new node(data);
    if(root==null)
    {
        root=temp;
        return root;
    }
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
        else{
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
  public static int minimum(node root)
  {
      int min=root.data;
      while(root.left!=null)
      {
         
          root=root.left;
           min=root.data;
      }
      return min;
  }
  public static int maximum(node root)
  {
      int max=root.data;
      while(root.right!=null)
      {
          root=root.right;
          max=root.data;
      }
      return max;
  }
        public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      root=insert(root,50);
       root=insert(root,45);
       root=insert(root,52);
       root=insert(root,12);
        root=insert(root,78); 
        root=insert(root,21); 
        root=insert(root,87);
        int min=minimum(root);
        System.out.println(min);
         int max=maximum(root);
        System.out.println(max);
   }
}
