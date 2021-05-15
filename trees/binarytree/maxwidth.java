/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;

import java.util.*;
public class maxwidth {
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
   public static int elementsbetweenlevel(node root){
       if(root==null)return 0;
       int max=0;
       Queue<node>q=new LinkedList<>();
      
       q.add(root);
       while(true){
           int size=q.size();
           max=size>max?size:max;
           if(size==0 ){
               break;
           }
           
           
           while(size>0){
               node temp=q.remove();
               if(temp.left!=null){
                   q.add(temp.left);
               }
               if(temp.right!=null){
                   q.add(temp.right);
               }
               size--;
           }
            
       }
       return max;
   }

    public static void main(String args[]){
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
      System.out.println(elementsbetweenlevel(root));
    }
}
