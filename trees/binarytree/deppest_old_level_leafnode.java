/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;
import java.util.*;
public class deppest_old_level_leafnode {
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
    
int depthdeepestoddlevel;
  public void  deepestLeftLeafNode(node node,int level) {
     if (node == null) {
      return;
    }

    if ( node.left == null && node.right == null &&level%2!=0&&(level > depthdeepestoddlevel)) {
      
      depthdeepestoddlevel = level;
    }

    deepestLeftLeafNode(node.left, level + 1);
    deepestLeftLeafNode(node.right, level + 1);
  }
  
  
  


    public static void main(String args[]){
        deppest_old_level_leafnode b=new deppest_old_level_leafnode();
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
         
       b.deepestLeftLeafNode(root, 1);
    
   
      System.out.println(b.depthdeepestoddlevel);
   
        
    }
}    



