/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;

import java.util.*;
public class cousins {
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
  
public  boolean cousins(node node,node a,node b){
    if(node==null||a==null||b==null){
        return false;
    }
   // System.out.println(getlevel(node,a.data,1));
    if(getlevel(node,a.data,1)!=getlevel(node,b.data,1)){
        return false;
    }
    
    return(!isSiblings(node,a,b));
}

public static int getlevel(node node,int val,int level){
    if (node == null) {
      return 0;
    }

    if (node.data == val) {
      return level;
    }

    int l = getlevel(node.left, val, level + 1);
    if (l != 0) {
      return l;
    }

    l = getlevel(node.right, val, level + 1);
    return l;
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
        cousins b=new cousins();
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
       System.out.println (b.cousins(root,root.left.left,root.right.left));
    }
}    



