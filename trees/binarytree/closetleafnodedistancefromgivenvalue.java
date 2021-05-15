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
public class closetleafnodedistancefromgivenvalue {
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
    
    public int closestLeafNode(node node, int val) {
    if (node == null) {
      return Integer.MAX_VALUE;
    }

    node arr[] = new node[10];
    return closestLeafNodeUtil(node, arr, val, 0);
  }
  
  public int closestLeafNodeUtil(node node, node arr[], int val, int level) {
    if (node == null) {
      return Integer.MAX_VALUE;
    }

    int minDistFromLeaf = Integer.MAX_VALUE;

    if (node.data == val) {
      minDistFromLeaf = getMinDistanceToLeaf(node);

      for (int i = level - 1; i >= 0; i--) {
        minDistFromLeaf = Math.min(minDistFromLeaf, level - i + getMinDistanceToLeaf(arr[i]));
      }

      return minDistFromLeaf;
    }

    arr[level] = node;
    
    minDistFromLeaf = Math.min(minDistFromLeaf, closestLeafNodeUtil(node.left, arr, val, level + 1));
    
    if(minDistFromLeaf != Integer.MAX_VALUE) {
      return minDistFromLeaf;
    }

    return Math.min(minDistFromLeaf, closestLeafNodeUtil(node.right, arr, val, level + 1));
  }

  public int getMinDistanceToLeaf(node node) {
    if (node == null) {
      return Integer.MAX_VALUE;
    }

    if (node.left == null && node.right == null) {
      return 0;
    }

    return 1 + Math.min(getMinDistanceToLeaf(node.left), getMinDistanceToLeaf(node.right));
   }

    
    
     public static void main(String args[]){
      closetleafnodedistancefromgivenvalue b=new closetleafnodedistancefromgivenvalue();
         node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
          
           System.out.println(b.closestLeafNode(root, 5));
        
    }
}
