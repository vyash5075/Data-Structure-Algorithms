/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;

import java.util.*;
public class boundarynodes {
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
    
    public static void printboundary(node root){
      if(root!=null){
          System.out.println(root.data);
          
          printboundaryleft(root.left);
          printleaves(root.left);
          printleaves(root.right);
          printboundaryright(root.right);
      }
    }

    public static void printboundaryleft(node root){
        if(root==null)return;
        if(root.left!=null){
            
            System.out.println(root.data);
            printboundaryleft(root.left);
            
        }
        else if(root.right!=null){
            System.out.println(root.data);
            printboundaryleft(root.right);
        }
    }
    
      public static void printboundaryright(node root){
        if(root==null)return;
        if(root.right!=null){
             printboundaryright(root.right);
            System.out.println(root.data);
           
            
        }
        else if(root.left!=null){
            printboundaryright(root.right);
            System.out.println(root.data);
            
        }
    }
    
    
      public static void printleaves(node root){
          if(root==null){
              return;
          }
           printleaves(root.left);
          if(root.left==null&&root.right==null){
              System.out.println(root.data);
          }
         
          printleaves(root.right);
      }
    public static void main(String args[]){
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
       printboundary(root);
    }
}

