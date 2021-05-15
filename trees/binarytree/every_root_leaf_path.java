/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;
import java.util.*;
public class every_root_leaf_path {
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
    int diameter;

  public void rootleafpath(node node) {
   
      if (node == null) {
      return ;
    }
int arr[]=new int[5];
printroottoleaf(node,arr,0);
     
      
  }
  
  
  public static void printroottoleaf(node root,int arr[],int index){
      if(root==null){
          return;
      }
      arr[index]=root.data;
      if(root.left==null&&root.right==null){
          printarr(arr,index);
      }
      printroottoleaf(root.left,arr,index+1);
      printroottoleaf(root.right,arr,index+1);
      
  }
  
  public static void printarr(int arr[],int index){
      for(int i=0;i<=index;i++){
          System.out.print(arr[i]+" ");
      }
      System.out.println();
  }
//way2
 


    public static void main(String args[]){
        every_root_leaf_path b=new every_root_leaf_path();
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
        int sum=14;
       b.rootleafpath(root);
        
    }
}   

