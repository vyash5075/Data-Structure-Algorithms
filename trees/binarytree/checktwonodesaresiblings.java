/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;

import java.util.*;
public class checktwonodesaresiblings {
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
    
   public boolean isSiblings(node node, node a, node b) {
    if (node == null) {
      return false;
    }

    return (node.left == a && node.right == b) 
        || (node.left == b && node.right == a)
        || isSiblings(node.left, a, b)
        || isSiblings(node.right, a, b);
  }
  


    public static void main(String args[]){
        checktwonodesaresiblings b=new checktwonodesaresiblings();
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
        System.out.println(b.isSiblings(root,root.left.left,root.left.right));
  
        
    }
}    



