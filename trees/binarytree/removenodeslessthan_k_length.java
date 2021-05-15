/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;

import java.util.*;
public class removenodeslessthan_k_length {
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
   
 public node removenodelessthank(node node,int k,int level){
     if(node==null)return null;
     
     node.left=removenodelessthank(node.left,k,level+1);
     node.right=removenodelessthank(node.right,k,level+1);
     
     if(node.left==null&&node.right==null&&level<k){
         return null;
     }
     return node;
     
 }
    public static void main(String args[]){
        removenodeslessthan_k_length b=new removenodeslessthan_k_length();
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
        b.removenodelessthank(root,3,1);
        
        
    }
}    



