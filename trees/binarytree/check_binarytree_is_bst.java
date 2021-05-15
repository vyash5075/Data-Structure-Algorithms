/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;

import java.util.*;
public class check_binarytree_is_bst {
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
      
      node prev = null;

  public boolean isTreeBST(node node) {
    if (node == null) {
      return true;
    }

    if (!isTreeBST(node.left)) {
      return false;
    }

    if (prev != null && node.data < prev.data) {
      return false;
    }

    prev = node;
    
    return isTreeBST(node.right);
  }
      public static void main(String args[]){
      check_binarytree_is_bst b=new check_binarytree_is_bst();
         node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
        
    System.out.println(b.isTreeBST(root));
     
    }
}
