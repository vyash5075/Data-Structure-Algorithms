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
public class sumof_left_leaves {
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

   
  
  
  public static void leftleafnodesum(node root, boolean isleft){
      if(root==null){
          return;
      }
       if(root.left==null&&root.right==null&&isleft){
           maxsum+=root.data;
       }
      leftleafnodesum(root.left,true);
      leftleafnodesum(root.right,false);
      
  }
  
  
 


    public static void main(String args[]){
         
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
        leftleafnodesum(root,false);
        System.out.println(maxsum);
        
        
    }
}   

