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
public class maxsumpath {
       static class Node {
  Node left;
  Node right;
  int data;
}
   int maxSum = 0;
   public int maxSumPath(Node node) {
    if (node == null) {
      return 0;
    }
    
    if(node.left == null && node.right == null) {
      return node.data;
    }

    int l = maxSumPath(node.left);
    int r = maxSumPath(node.right);

    int max_one = Math.max(node.data,  node.data + Math.max(l, r) );

    int max_two = Math.max(max_one, l + r + node.data);

    maxSum = Math.max(maxSum, max_two);

    return max_one;
  }

      public Node createNewNode(int val) {
    Node newNode = new Node();
    newNode.data = val;
    newNode.left = null;
    newNode.right = null;
    return newNode;
  }
      public static void main(String[] args) {

    maxsumpath a = new maxsumpath();

    Node root = a.createNewNode(2);
    root.left = a.createNewNode(4);
    root.left.left = a.createNewNode(1);
    root.left.right = a.createNewNode(6);
    root.right = a.createNewNode(5);
    root.right.right = a.createNewNode(7);

    a.maxSumPath(root);
    System.out.println(a.maxSum);

  }

}
