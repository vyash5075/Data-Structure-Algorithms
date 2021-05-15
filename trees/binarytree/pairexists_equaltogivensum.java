/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;

import java.util.*;
public class pairexists_equaltogivensum {
    static class Node {
  Node left;
  Node right;
  int data;
}
     
        public Node createNewNode(int val) {
    Node newNode = new Node();
    newNode.data = val;
    newNode.left = null;
    newNode.right = null;
    return newNode;
  }
  public boolean ifPairExists(Node node, int sum) {
    HashSet<Integer> set = new HashSet<>();
    
    return ifPairExistsUtil(node, sum, set); 
  }
  
  public boolean ifPairExistsUtil(Node node, int sum, HashSet<Integer> set) {
    if(node == null) {
      return false;
    }
    
    if(set.contains(sum - node.data)) {
      return true;
    }
    
    set.add(node.data);
    
    if(ifPairExistsUtil(node.left, sum, set)) {
      return true;
    }
    
    return ifPairExistsUtil(node.right, sum, set); 
  }
  public static void main(String[] args) {

   pairexists_equaltogivensum a = new pairexists_equaltogivensum();

    Node root = a.createNewNode(7);
    root.left = a.createNewNode(2);
    root.right = a.createNewNode(6);
    root.left.left = a.createNewNode(3);
    root.left.right = a.createNewNode(5);
    root.right.right = a.createNewNode(10);
    
    System.out.println(a.ifPairExists(root, 14));
  }   
}
