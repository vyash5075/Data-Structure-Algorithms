/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;
import java.util.*;
public class parentof_node {
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
 
  
  
    public node  getparent(node node,int val) {
    if(node==null||node.data==val){
        return null;
    }
    if((node.left!=null&&node.left.data==val)||(node.right!=null&&node.right.data==val)){
        return node;
    }
    node l=getparent(node.left,val);
    if(l!=null)return l;
    l=getparent(node.right,val);
    return l;
}
  


    public static void main(String args[]){
        parentof_node b=new parentof_node();
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
       
                node parent= b.getparent(root,11);
     if(parent!=null){
         System.out.println(parent.data);
     }
     else{
         System.out.println("null");
     }
        
    }
}    



