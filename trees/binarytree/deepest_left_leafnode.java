/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;
import java.util.*;
public class deepest_left_leafnode {
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
  node deepestLeftLeafNode; 
int currentLevel;
  public void  deepestLeftLeafNode(node node,int level,boolean ifLeft) {
     if (node == null) {
      return;
    }

    if (ifLeft && node.left == null && node.right == null && level > currentLevel) {
      deepestLeftLeafNode = node;
      currentLevel = level;
    }

    deepestLeftLeafNode(node.left, level + 1, true);
    deepestLeftLeafNode(node.right, level + 1, false);
  }
  
  
  


    public static void main(String args[]){
        deepest_left_leafnode b=new deepest_left_leafnode();
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
         
       b.deepestLeftLeafNode(root, 1, false);
    
    if(b.deepestLeftLeafNode != null) {
      System.out.println(b.deepestLeftLeafNode.data);
    } else {
      System.out.println("Deepest Left Leaf Node is Null");
    }
       
        
    }
}   



