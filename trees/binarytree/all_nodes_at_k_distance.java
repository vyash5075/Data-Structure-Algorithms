/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;

import java.util.*;


public class all_nodes_at_k_distance {
   static class node{
        int data;
        node left;
        node right;
        node(int d){
            this.data=d;
            this.left=null;
            this.right=null;
        }
    }
   

  public int printElementsAtKDistance(node node, node targetNode, int k) {
    if (node == null || targetNode == null || k < 0) {
      return -1;
    }

    return printElementsAtKDistanceUtil(node, targetNode, k);
  }

  public int printElementsAtKDistanceUtil(node node, node targetNode, int k) {
    if(node == null) {
      return -1;
    }
  
    if(node == targetNode) {
      printNodesAtKDistanceFromParent(node, k);
      return 0;
    }
    
    int leftDist = printElementsAtKDistanceUtil(node.left, targetNode, k);
    
    if(leftDist != -1) {
      if(leftDist + 1 == k) {
        System.out.print(node.data + " ");
      } else {
        printNodesAtKDistanceFromParent(node.right, k - 2 - leftDist);
      }
      
      return leftDist + 1; 
    }
    
    int rightDist = printElementsAtKDistanceUtil(node.right, targetNode, k);
    
    if(rightDist != -1) {
      if(rightDist + 1 == k) {
        System.out.print(node.data + " ");
      } else {
        printNodesAtKDistanceFromParent(node.left, k - 2 - rightDist);
      }
      
      return rightDist + 1; 
    }
    
    return -1;
  }

  public void printNodesAtKDistanceFromParent(node node, int k) {
    if (node == null) {
      return;
    }

    if (k == 0) {
      System.out.print(node.data + " ");
    }

    printNodesAtKDistanceFromParent(node.left, k - 1);
    printNodesAtKDistanceFromParent(node.right, k - 1);
  }
    public static void main(String args[]){
        all_nodes_at_k_distance b=new all_nodes_at_k_distance();
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
      
     
    int elements = b.printElementsAtKDistance(root, root.left, 2);
    
    if(elements == -1) {
      System.out.println("No elements found");
    }
    }
}    



