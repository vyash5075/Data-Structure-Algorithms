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
public class nextpointer_inorder_successor {
        static class Node{
        int data;
        Node left;
        Node right;
         Node next;
        Node(int d){
            this.data=d;
            this.left=null;
            this.right=null;
            
        }
    }
     
      Node headLinkedList;
  Node prev;
  public void connectNextPointerToInorderSuccessor(Node node) {
    if (node == null) {
      return;
    }

    connectNextPointerToInorderSuccessor(node.left);

    if(prev != null) {
      prev.next = node;
    }
    
    prev = node;

    connectNextPointerToInorderSuccessor(node.right);
  }
  public static void main(String args[]){
      nextpointer_inorder_successor a=new nextpointer_inorder_successor();
       Node root = new Node(12);
    root.left =new Node(7);
    root.left.left = new Node(6);
    root.left.right =new Node(9);
    root.right = new Node(24);
        
   a.connectNextPointerToInorderSuccessor(root);
      
}
}
