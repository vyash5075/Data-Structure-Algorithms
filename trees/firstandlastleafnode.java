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
public class firstandlastleafnode {
   static  class node{
       int data;
       node left;
       node right;
       node(int d)
       {
           this.data=d;
           left=right=null;
       }
   }
   static int arr[];
   int n;
   static int i=-1;
   firstandlastleafnode(int n)
   {
       this.n=n;
       arr=new int[n];
   }
          static node root;
          public static node insert(node root,int data)
          {
             node temp=new node (data);
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
          public static void inorder(node root)
          {
              if(root!=null)
              {
                  inorder(root.left);
                  System.out.println(root.data);
                 inorder(root.right);
              }
          }
          public static void leafnodes(node root)
          {
              if(root!=null)
              {
                  if(root.left==null&&root.right==null)
                  {  i++;
                      System.out.println(root.data+"ssss");
                      arr[i]=root.data;
                     
                  }
                  leafnodes(root.left);
                  leafnodes(root.right);
              }
          }
          public static void main(String args[])
          {
              Scanner sc=new Scanner(System.in);
              int n=sc.nextInt();
              for(int i=0;i<n;i++)
              {
                  root=insert(root,sc.nextInt());
              }
              inorder(root);
              firstandlastleafnode m=new firstandlastleafnode(n);
              leafnodes(root);
              System.out.println("first leaf node is"+arr[0]);
              System.out.println("last leaf node is"+arr[i]);
              System.out.println(arr.length);
   }
}
