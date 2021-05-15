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
public class sumofallnodes {
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
    
    public static void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+"->");
        inorder(root.right);
    }
    
    public static void preorder(node root){
        if(root==null){
            return;
        }
        
         System.out.print (root.data+"->");
        preorder(root.left);
       
        preorder(root.right);
    }
    
  public static int sumofallnodes(node root){
      if(root==null)return  0;
      
      return root.data+sumofallnodes(root.left)+sumofallnodes(root.right);
      
  }
  public static int getdifferencce_even_odd_nodes(node root ){
      if(root==null)return 0;
      return root.data-getdifferencce_even_odd_nodes(root.left)-getdifferencce_even_odd_nodes(root.right);
  }
    public static void main(String args[]){
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
        
        System.out.println("sum of all nodes"+ sumofallnodes(root));
        System.out.println("sum of odd even nodes"+getdifferencce_even_odd_nodes(root));
    }
}
