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
public class convert_binarytree_doublylinklist {
     static class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            this.data=d;
            this.left=null;
            this.right=null;
        }
    }
     
      Node headLinkedList;
  Node prev;

  public void bstToDoublyLinkedList(Node node) {
    if (node == null) {
      return;
    }

    bstToDoublyLinkedList(node.left);

    if (prev == null) {
      headLinkedList = node;
      prev = node;
    } else {
      node.left = prev;
      prev.right = node;
      prev = node;
    }

    bstToDoublyLinkedList(node.right);
  }
       public static void main(String args[]){
      convert_binarytree_doublylinklist a=new convert_binarytree_doublylinklist();
       Node root = new Node(12);
    root.left =new Node(7);
    root.left.left = new Node(6);
    root.left.right =new Node(9);
    root.right = new Node(24);
        
   a.bstToDoublyLinkedList(root);
      
}
}
