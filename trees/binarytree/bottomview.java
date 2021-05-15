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
import java.util.*;
public class bottomview {
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
    
   
   public static void topview(node root){
       if(root==null)return;
       
       
       
       TreeMap<Integer,Integer>m=new TreeMap<Integer,Integer>();
       Queue<node>q=new LinkedList<node>();
       q.add(root);
       while(!q.isEmpty()){
           node temp=q.remove();
           int hd=temp.height;
          // if(m.get(hd)==null){
               m.put(hd,temp.data);
          // } 
           
           if(temp.left!=null){
               temp.left.height=hd-1;
               q.add(temp.left);
           }
            if(temp.right!=null){
               temp.right.height=hd+1;
               q.add(temp.right);
           }
           
       }
       
       System.out.println(m.values());
   }
    
   
    
   
    public static void main(String args[]){
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
       topview(root);
    }
}
