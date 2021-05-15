/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;

import java.util.*;
public class root_leaf_sum {
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
    int diameter;

  public boolean rootleafsummatches(node node,int total) {
  System.out.println(node.data+" "+total);
      if (node == null) {
      return false;
    }

    if (node.left == null && node.right == null && total == node.data)
    {
        System.out.println("uu");
      return true;
    }

    return rootleafsummatches(node.left, total - node.data)
        || rootleafsummatches(node.right, total - node.data);
  }
//way2
 


    public static void main(String args[]){
        root_leaf_sum b=new root_leaf_sum();
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
        int sum=14;
       System.out.println(b.rootleafsummatches(root,26) );
        
    }
}   

