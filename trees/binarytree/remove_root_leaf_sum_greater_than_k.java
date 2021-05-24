/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;

import java.util.*;
public class remove_root_leaf_sum_greater_than_k {
 static class Node {
  Node left;
  Node right;
  int data;
}
static class BinaryTree {

  public Node removeAllNodesIfSumGreaterThanK(Node node, int k, int s) {
    if (node == null) {
      return null;
    }

    node.left = removeAllNodesIfSumGreaterThanK(node.left, k, s + node.data);
    node.right = removeAllNodesIfSumGreaterThanK(node.right, k, s + node.data);

    if (node.left == null && node.right == null && (s + node.data) < k) {
      return null;
    }

    return node;
  }
   public Node createNewNode(int val) {
    Node newNode = new Node();
    newNode.data = val;
    newNode.left = null;
    newNode.right = null;
    return newNode;
  }
}
public static void main(String[] args) {

    BinaryTree a = new BinaryTree();

    Node root = a.createNewNode(2);
    root.left = a.createNewNode(7);
    root.right = a.createNewNode(9);
    root.left.left = a.createNewNode(2);
    root.left.right = a.createNewNode(6);
    root.left.right.right = a.createNewNode(11);

    root = a.removeAllNodesIfSumGreaterThanK(root, 13, 0);
  }
}
