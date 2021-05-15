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
public class printallnodesatkdistancefromleafnode {
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
   

    public void printAllElementsAtKDistanceFromLeafNode(node node, int k) {
    if (node == null || k < 0) {
      return;
    }

    int arr[] = new int[20];
    boolean visited[] = new boolean[20];

    printAllElementsAtKDistanceFromLeafNodeUtil(node, k, arr, visited, 0);
  }

  public void printAllElementsAtKDistanceFromLeafNodeUtil(node node, int k, int[] arr, boolean[] visited, int count) {
    if (node == null) {
      return;
    }

    arr[count] = node.data;
    visited[count] = false;
    
    if (node.left == null && node.right == null && count - k >= 0 && visited[count - k] == false) {
      System.out.print(arr[count - k] + " ");
      visited[count - k] = true;
      return;
    }
    
    printAllElementsAtKDistanceFromLeafNodeUtil(node.left, k, arr, visited, count + 1);
    printAllElementsAtKDistanceFromLeafNodeUtil(node.right, k, arr, visited, count + 1);
  }
    public static void main(String args[]){
        printallnodesatkdistancefromleafnode b=new printallnodesatkdistancefromleafnode();
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
       b.printAllElementsAtKDistanceFromLeafNode(root, 4);
    
    }
}    



