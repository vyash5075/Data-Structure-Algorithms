/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;

import java.util.*;
public class printancestors {
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

   public boolean  printancestors(node node,int val) {
   if (node == null) {
      return false;
    }
   if(node.data==val){
   return true;
   }
   if(printancestors(node.left,val)||printancestors(node.right,val)){
       System.out.println(node.data);
       return true;
   }
  return false;
}
  


    public static void main(String args[]){
        printancestors b=new printancestors();
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
   System.out.println(b.printancestors(root,11));
    }
}    



