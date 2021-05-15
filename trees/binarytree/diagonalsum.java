/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;

import java.util.*;
public class diagonalsum {
      static  class Node {
  Node left;
  Node right;
  Node next;
  int data;
}
       public Node createNewNode(int val) {
    Node newNode = new Node();
    newNode.data = val;
    newNode.left = null;
    newNode.next = null;
    newNode.right = null;
    return newNode;
  }
public void diagonalSum(Node node) {
    if (node == null) {
      return;
    }

    Queue<Node> q = new LinkedList<Node>();
    q.add(node);

    while (true) {
      int size = q.size();

      if (size == 0) {
        break;
      }

      int s = 0;
      
      while (size > 0) {
        Node temp = q.remove();

        while (temp != null) {
          s = s + temp.data;
          
          if (temp.left != null) {
            q.add(temp.left);
          }
          
          temp = temp.right;
        }
        
        size--;
      }

      System.out.println(s);
    }
  }

      
   public static void main(String[] args) {

    diagonalsum a = new diagonalsum();
        
    Node root = a.createNewNode(120);
    root.left = a.createNewNode(40);
    root.left.left = a.createNewNode(15);
    root.left.right = a.createNewNode(25);
    root.right = a.createNewNode(20);
    root.right.right = a.createNewNode(20);

   a.diagonalSum(root);
  }
}
