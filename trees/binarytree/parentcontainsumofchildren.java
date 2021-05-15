/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;
import java.util.*;
public class parentcontainsumofchildren {
   static  class Node {
  Node left;
  Node right;
  Node next;
  int data;
}
    public boolean ifParentContainSumofChildren(Node node) {
    if (node == null || (node.left == null && node.right == null)) {
      return true;
    }

    int a = node.left != null ? node.left.data : 0;
    int b = node.right != null ? node.right.data : 0;

    return (a + b == node.data) && ifParentContainSumofChildren(node.left) && ifParentContainSumofChildren(node.right);
  }
     public Node createNewNode(int val) {
    Node newNode = new Node();
    newNode.data = val;
    newNode.left = null;
    newNode.next = null;
    newNode.right = null;
    return newNode;
  }
      public static void main(String[] args) {

    parentcontainsumofchildren a = new parentcontainsumofchildren();

    Node root = a.createNewNode(12);
    root.left = a.createNewNode(4);
    root.left.left = a.createNewNode(3);
    root.left.right = a.createNewNode(1);
    root.right = a.createNewNode(8);
    root.right.right = a.createNewNode(8);
    
    System.out.println(a.ifParentContainSumofChildren(root));
  }
}
