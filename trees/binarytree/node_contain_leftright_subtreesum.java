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
public class node_contain_leftright_subtreesum {
     static  class Node {
  Node left;
  Node right;
  Node next;
  int data;
}
    public boolean ifSumTree(Node node) {
    int leftSum;
    int rightSum;

    if (node == null || ifLeafNode(node))
      return true;

    if (ifSumTree(node.left) && ifSumTree(node.right)) {
      if (node.left == null)
        leftSum = 0;
      else if (ifLeafNode(node.left))
        leftSum = node.left.data;
      else
        leftSum = 2 * (node.left.data);

      if (node.right == null)
        rightSum = 0;
      else if (ifLeafNode(node.right))
        rightSum = node.right.data;
      else
        rightSum = 2 * (node.right.data);

      if ((node.data == rightSum + leftSum))
        return true;
      else
        return false;
    }

    return false;
  }

  public boolean ifLeafNode(Node node) {
    if (node == null) {
      return false;
    }

    if (node.left == null && node.right == null) {
      return true;
    }

    return false;
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

    node_contain_leftright_subtreesum a = new node_contain_leftright_subtreesum();

    Node root = a.createNewNode(120);
    root.left = a.createNewNode(40);
    root.left.left = a.createNewNode(15);
    root.left.right = a.createNewNode(25);
    root.right = a.createNewNode(20);
    root.right.right = a.createNewNode(20);

    System.out.println(a.ifSumTree(root));
  }
}
