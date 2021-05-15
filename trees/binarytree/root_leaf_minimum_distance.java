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
public class root_leaf_minimum_distance {
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
   static int maxsum;

  public int  getmindistancerootleaf(node node) {
   
      if (node == null) {
      return Integer.MAX_VALUE;
    }
      if(node.left==null&&node.right==null){
          return 0;
      }
      return 1+Math.min(getmindistancerootleaf(node.left), getmindistancerootleaf(node.right));
      
  }
  
  
  


    public static void main(String args[]){
        root_leaf_minimum_distance b=new root_leaf_minimum_distance();
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
        int sum=14;
       System.out.println(b.getmindistancerootleaf(root));
       
        
    }
}   

