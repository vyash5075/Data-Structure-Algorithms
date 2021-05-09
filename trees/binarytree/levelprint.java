/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;
import java.util.*;
public class levelprint {
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
  public static void levelprint(node root,int level){
      
      
      if(root==null)return;
      
      if(level==1){
          System.out.println(root.data);
      }
      
      levelprint(root.left,level-1);
      levelprint(root.right,level-1);
      
  }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
        
        System.out.println("enter the level to print its elements");
        levelprint(root,sc.nextInt());
    }
}
