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
public class min_max_value {
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
   static int minval;
   static int maxval;

  public void minmaxval(node node) {
   
      if (node == null) {
      return ;
    }
     if(node.data<=minval){
         minval=node.data;
     }
     if(node.data>=maxval){
         maxval=node.data;
     }
     minmaxval(node.left);
     minmaxval(node.right);
      
  }
  
   
  
   
//way2
 


    public static void main(String args[]){
        min_max_value b=new min_max_value();
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
        minval=root.data;
        maxval=root.data;
       b.minmaxval(root);
       System.out.println(minval+" "+maxval);
        
        
    }
}   

