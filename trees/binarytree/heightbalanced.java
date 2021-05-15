/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;

 import java.util.*;
public class heightbalanced {
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

  public int ifHeightBalancedTree(node node) {
    if (node == null) {
      return 0;
    }
    
    if(node.left == null && node.right == null) {
      return 1;
    }

    int lH = ifHeightBalancedTree(node.left);
    int rH = ifHeightBalancedTree(node.right);
     if(lH==-1||rH==-1||Math.abs(lH-rH)>1){
         return -1;
     }
    return Math.max(lH, rH) + 1;
  }
//way2
 


    public static void main(String args[]){
        heightbalanced b=new heightbalanced();
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
       System.out.println(b.ifHeightBalancedTree(root) != -1);
        
    }
}   

