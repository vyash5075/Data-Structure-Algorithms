/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;
import java.util.*;
public class checkallleafnodesatsamelevel {
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
   int levelOfLeaf;


  public boolean  ifLeavesAtSameLevel(node node,int level) {
   if (node == null) {
      return true;
    }

    if (node.left == null && node.right == null) {
      if (levelOfLeaf == 0) {
        levelOfLeaf = level;
        return true;
      }

      return levelOfLeaf == level;
    }

    return ifLeavesAtSameLevel(node.left, level + 1) && ifLeavesAtSameLevel(node.right, level + 1);
   
  }
  
  
  


    public static void main(String args[]){
        checkallleafnodesatsamelevel b=new checkallleafnodesatsamelevel();
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
         
       System.out.println(b.ifLeavesAtSameLevel (root,1));
       
        
    }
}   

