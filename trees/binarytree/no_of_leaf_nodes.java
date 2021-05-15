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
public class no_of_leaf_nodes {
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
    
   
    
  public static int sumofallleafnodes(node root){
      if(root==null)return  0;
      if(root.left==null&&root.right==null)return 1;
      return  sumofallleafnodes(root.left)+sumofallleafnodes(root.right);
      
  }
      public static void main(String args[]){
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
        
        System.out.println("sum of all leaf nodes"+ sumofallleafnodes(root));
        
    }
}
