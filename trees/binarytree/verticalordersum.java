/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;

/**
 *
 * @author yash verma
 */import java.util.*;
public class verticalordersum {
  static class node{
        int data;
        node left;
        node right;
        int height;
        node(int d){
            this.data=d;
            this.left=null;
            this.right=null;
            
        }
    }
    
   
   public static void verticalorder(node root){
       if(root==null)return;
       TreeMap<Integer,Integer>m=new TreeMap<Integer,Integer>();
       int hd=0;
       getverticlorder(root,hd,m);
       
       for(Map.Entry<Integer, Integer>cm:m.entrySet()){
           System.out.println(cm.getValue());
       }
        }
    public static void getverticlorder(node root,int hd,TreeMap<Integer,Integer>m){
        if(root==null)return;
        if(m.get(hd)==null){
           
            m.put(hd,root.data);
        }
        else{
            int l=m.get(hd);
           l=l+root.data;
            m.put(hd,l);
        }
        getverticlorder(root.left,hd-1,m);
        getverticlorder(root.right,hd+1,m);
    }
   
    
   
    public static void main(String args[]){
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
       verticalorder(root);
    }
}

