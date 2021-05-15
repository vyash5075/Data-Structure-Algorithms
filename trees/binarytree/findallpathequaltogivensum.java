/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;

import java.util.*;
public class findallpathequaltogivensum {
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

  List<Integer> elements = new ArrayList<Integer>();

  public void printKPathEqualToSum(Node node, int val) {
    if (node == null) {
      return;
    }

    elements.add(node.data);

    printKPathEqualToSum(node.left, val);
    printKPathEqualToSum(node.right, val);

    int sum = 0;
    
    for (int i = elements.size() - 1; i >= 0; i--) {
      
      sum = sum + elements.get(i);
      
      if (sum == val) {
        
        for (int j = i; j < elements.size(); j++) {
          System.out.print(elements.get(j) + " ");
        }
        
        System.out.println();
      }
    }
    
    elements.remove(elements.size() - 1);
  }

       public static void main(String[] args) {

    findallpathequaltogivensum a = new findallpathequaltogivensum();

    Node root = a.createNewNode(2);
    root.left = a.createNewNode(4);
    root.left.left = a.createNewNode(1);
    root.left.right = a.createNewNode(6);
    root.right = a.createNewNode(5);
    root.right.right = a.createNewNode(7);

    a.printKPathEqualToSum(root, 6);

  }
}
