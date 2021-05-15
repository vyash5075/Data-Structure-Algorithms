/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;

import java.util.*;
public class siblings {
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
 
  
  
    public node  getsibling(node node,int val) {
    if(node==null||node.data==val){
        return null;
    }
    if(node.left!=null&&node.left.data==val){
        return node.right;
    }
     if(node.right!=null&&node.right.data==val){
        return node.left;
    }
         
    node l=getsibling(node.left,val);
    if(l!=null)return l;
    l=getsibling(node.right,val);
    return l;
}
  


    public static void main(String args[]){
        siblings b=new siblings();
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
       
                node sibling= b.getsibling(root,11);
     if(sibling!=null){
         System.out.println(sibling.data);
     }
     else{
         System.out.println("null");
     }
        
    }
}    



