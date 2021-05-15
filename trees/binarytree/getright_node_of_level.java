/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;
import java.util.*;
public class getright_node_of_level {
     static class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            this.data=d;
            this.left=null;
            this.right=null;
            
        }
    }
     
     public void storeRightNode(Node node, int key, int level) {
    if(node == null) {
      return;
    }
    
    if(level == 1 & node.data == key) {
      if(flag) {
        rightNode = node;
        return;
      } else {
        flag = true;
      }
    }
    
    storeRightNode(node.left, key, level - 1);
    storeRightNode(node.right, key, level - 1);
  }
     
     public int getLevelOfNode(Node node, int val, int level) {
    if (node == null) {
      return 0;
    }

    if (node.data == val) {
      return level;
    }

    int l = getLevelOfNode(node.left, val, level + 1);
    if (l != 0) {
      return l;
    }

    l = getLevelOfNode(node.right, val, level + 1);
    return l;
  }
  
  Node rightNode;
  boolean flag;
   public void getRightNodeRecursive(Node node, int key) {
    if (node == null || node.data == key) {
      return;
    }
    
    int levelOfKey = getLevelOfNode(node, key, 1);
    storeRightNode(node, key, levelOfKey);
  }
  
   
   
   //way2
   public Node getRightNodeIterative(Node node, int key) {
    if (node == null || node.data == key) {
      return null;
    }

    Queue<Node> q = new LinkedList<Node>();
    q.add(node);
    
    boolean flag = false;

    while (true) {
      int size = q.size();
      
      if (size == 0 || flag) {
        break;
      }

      while (size > 0) {
        Node t = q.remove();
        if (flag) {
          return t;
        }
        
        if (t.data == key) {
          flag = true;
        }
        
        if (t.left != null) {
          q.add(t.left);
        }

        if (t.right != null) {
          q.add(t.right);
        }
        
        size--;
      }
    }
    
    return null;
  }
      public static void main(String args[]){
      getright_node_of_level a=new getright_node_of_level();
       Node root = new Node(12);
    root.left =new Node(7);
    root.left.left = new Node(6);
    root.left.right =new Node(9);
    root.right = new Node(24);
        
  
    a.getRightNodeRecursive(root, 5);
     System.out.println(a.rightNode);
      
}
}
