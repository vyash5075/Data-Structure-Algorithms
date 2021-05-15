/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;

import java.util.*;
public class lowest_common_ancestor {
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
   
   
  boolean ifN1Present = false;
  boolean ifN2Present = false;
  public node findLowestCommonAncestor(node node, int n1, int n2) {

    node lca = this.findLowestCommonAncestorUtil(node, n1, n2);

    if (ifN1Present && ifN2Present) {
      return lca;
    } else if (!ifN1Present && !ifN2Present) {
      return null;
    } else {
      int val = lca.data == n1 ? n2 : n1;
      if (ifElementPresent(lca, val)) {
        return lca;
      }
    }

    return null;
  }
  private boolean ifElementPresent(node node, int val) {
    if (node == null) {
      return false;
    }

    if (node.data == val) {
      return true;
    }

    return ifElementPresent(node.left, val) || ifElementPresent(node.right, val);
  }
  
  public node findLowestCommonAncestorUtil(node node, int n1, int n2) {
    if (node == null) {
      return null;
    }

    if (node.data == n1) {
      ifN1Present = true;
      return node;
    }

    if (node.data == n2) {
      ifN2Present = true;
      return node;
    }

    node leftLCA = findLowestCommonAncestorUtil(node.left, n1, n2);
    node rightLCA = findLowestCommonAncestorUtil(node.right, n1, n2);

    if (leftLCA != null && rightLCA != null) {
      return node;
    }

    return leftLCA != null ? leftLCA : rightLCA;
  }
    public static void main(String args[]){
        lowest_common_ancestor b=new lowest_common_ancestor();
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
      
    node lca = b.findLowestCommonAncestor(root, 5, 14);
    if (lca != null) {
      System.out.println(lca.data);
    } else {
      System.out.println("LCA is null");
    }
    }
}    



