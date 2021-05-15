/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;
import java.util.*;
public class maxsumpath_btw_twoleaves {
    static class Node {
  Node left;
  Node right;
  int data;
}
    int maxSumBetweenTwoLeaves = 0;
     public int getMaxSumPathBetweenTwoLeaves(Node node) {
    if (node == null) {
      return 0;
    }

    if (node.left == null && node.right == null) {
      return node.data;
    }

    int l = getMaxSumPathBetweenTwoLeaves(node.left);
    int r = getMaxSumPathBetweenTwoLeaves(node.right);
    
    if(node.left != null && node.right != null) {
      if (l + r + node.data > maxSumBetweenTwoLeaves) {
        maxSumBetweenTwoLeaves = l + r + node.data;
      }
      
      return Math.max(l, r) + node.data;
    }

    return node.left != null ? l + node.data : r + node.data; 
  }
    public Node createNewNode(int val) {
    Node newNode = new Node();
    newNode.data = val;
    newNode.left = null;
    newNode.right = null;
    return newNode;
  }

     public static void main(String[] args) {

    maxsumpath_btw_twoleaves a = new maxsumpath_btw_twoleaves();

    Node root = a.createNewNode(2);
    root.left = a.createNewNode(4);
    root.left.left = a.createNewNode(1);
    root.left.right = a.createNewNode(6);
    root.right = a.createNewNode(5);
    root.right.right = a.createNewNode(7);
    
    a.getMaxSumPathBetweenTwoLeaves(root);
    System.out.println(a.maxSumBetweenTwoLeaves);
    
  }
}
