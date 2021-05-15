/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;

import java.util.*;
public class mirrorimagecheck {
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
    
  public static boolean checkmirrorimage(node root1,node root2){
      
      if(root1==null&&root2==null)return true;
      if(root1==null||root2==null)return false;
      return root1.data==root2.data&&checkmirrorimage(root1.left,root2.right)&&checkmirrorimage(root1.right,root2.left);
  }
     
  
    public static void main(String args[]){
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
        
          node root2=new node(10);
        root2.left=new node(2);
        root2.right=new node(5);
        root2.left.left=new node(14);
        root2.left.right=new node(13);
        root2.right.left=new node(12);
        root2.right.right=new node(11);
        System.out.println(checkmirrorimage(root,root2));
        
        
        
    }
}
