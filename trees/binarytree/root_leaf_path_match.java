/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;

import java.util.*;
public class root_leaf_path_match {
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
    
int depthdeepestoddlevel;
  public boolean  checksequencematchornot(node node,int sequence[],int index) {
   if (node == null) {
      return false;
    }

    if (index >= sequence.length || node.data != sequence[index]) {
      return false;
    }

    if (node.left == null && node.right == null && index == sequence.length - 1) {
      return true;
    }

    return checksequencematchornot(node.left, sequence, index + 1)
        || checksequencematchornot(node.right, sequence, index + 1);
  }
  
  
  


    public static void main(String args[]){
        root_leaf_path_match b=new root_leaf_path_match();
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
         int sequence[]={10,5,11};
      System.out.println(b.checksequencematchornot(root,sequence,0));
   
        
    }
}    



