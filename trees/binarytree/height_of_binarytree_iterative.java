/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;

import java.util.*;
public class height_of_binarytree_iterative {
  static class node{
        int data;
        node left;
        node right;
        node(int d){
            this.data=d;
            this.left=null;
            this.right=null;
        }
    }
   
public static int heightiteratively(node root){
    
    if(root==null)return -1;
   Queue<node>q=new LinkedList<>();
   q.add(root);
   int height=0;
   while(true){
       int size=q.size();
       if(size==0){
           break;
       }
       
       while(size>0){
           node t=q.remove();
           if(t.left!=null){
              q.add(t.left);
           }
           if(t.right!=null){
               q.add(t.right);
           }
           size--;
       }height=height+1;
   }
   return height-1;
}
//way2
 


    public static void main(String args[]){
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
        System.out.println("height of tree by iterative way is"+  heightiteratively(root));
        
    }
}
