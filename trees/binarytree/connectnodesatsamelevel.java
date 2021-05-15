/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;

/**
 *
 * @author yash verma
 */
import java.util.*;
public class connectnodesatsamelevel {
    static class Node{
        int data;
        Node left;
        Node right;
        Node next;
        Node(int d){
            this.data=d;
            this.left=null;
            this.right=null;
            
        }
    }
    public void connectNode(Node node) {
    Node previousNode;

    Queue<Node> q = new LinkedList<>();
    q.add(node);

    while (!q.isEmpty()) {
      int size = q.size();
      
      previousNode = null;

      while (size > 0) {
        node = q.remove();

        if (previousNode != null) {
          previousNode.next = node;
        }
        
        previousNode = node;

        if (node.left != null) {
          q.add(node.left);
        }
        
        if (node.right != null) {
          q.add(node.right);
        }
        
        size--;
      }
    }
  }
    
    //way2
    public void connectNodeAtSameLevel(Node node) {
    if(node == null) {
      return;
    }
    
    while(node != null) {
      Node t = node;
      
      while(t != null) {
        if(t.left != null) {
          if(t.right != null) {
            t.left.next = t.right;
          } else {
            t.left.next = getNextRight(t);
          }
        }
        
        if(t.right != null) {
          t.right.next = getNextRight(t);
        }
        
        t = t.next;
      }
      
      if(node.left != null) {
        node = node.left;
      } else if(node.right != null) {
        node = node.right;
      } else {
        node = getNextRight(node);
      }
    }
  }
  
  public Node getNextRight(Node node) {
    Node tmp = node.next;
    
    while(tmp != null) {
      if(tmp.left != null) {
        return tmp.left;
      } else if(tmp.right != null) {
        return tmp.right;
      }
      tmp = tmp.next;
    }
    return null;
  }
      public static void main(String args[]){
      connectnodesatsamelevel a=new connectnodesatsamelevel();
       Node root = new Node(12);
    root.left =new Node(7);
    root.left.left = new Node(6);
    root.left.right =new Node(9);
    root.right = new Node(24);
     a.connectNode(root);
} 
}
