/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;

import java.util.*;

public class rootleaf_number_sum {
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
   static int max=0;

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
     int  l=0;
     int k=1;
      for(int i=0;i<=index;i++){
         l=l*k+arr[i];
         k=k*10;
         
      }
       
      max=max+l;
     // System.out.println(max);
  }
//way2
 

    public static void main(String args[]){
        rootleaf_number_sum b=new rootleaf_number_sum();
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
       b.rootleafpath(root);
       System.out.println(max);
        
    }
}   

