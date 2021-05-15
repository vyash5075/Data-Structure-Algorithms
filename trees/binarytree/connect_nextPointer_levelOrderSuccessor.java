/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;

import java.util.*;
public class connect_nextPointer_levelOrderSuccessor {
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
    
    public void connectNodeLevelSuccessor(Node node) {
    Node previousNode = null;

    Queue<Node> q = new LinkedList<>();
    q.add(node);

    while (!q.isEmpty()) {
      int size = q.size();

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

     public static void main(String args[]){
      connect_nextPointer_levelOrderSuccessor a=new connect_nextPointer_levelOrderSuccessor();
       Node root = new Node(12);
    root.left =new Node(7);
    root.left.left = new Node(6);
    root.left.right =new Node(9);
    root.right = new Node(24);
      a.connectNodeLevelSuccessor(root);
} 
}
