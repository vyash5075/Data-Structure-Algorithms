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
public class sum_of_leafnodes {
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

   
  
  
  public static void leafnodesum(node root){
      if(root==null){
          return;
      }
       if(root.left==null&&root.right==null){
           maxsum+=root.data;
       }
      leafnodesum(root.left);
      leafnodesum(root.right);
      
  }
  
  
 


    public static void main(String args[]){
        sum_of_leafnodes b=new sum_of_leafnodes();
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
        leafnodesum(root);
        System.out.println(maxsum);
        
        
    }
}   

