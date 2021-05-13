/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;

import java.util.*;
public class widthoflevel {
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
 
 //way1
   public static void elementsbetweenlevel(node root,int level){
       if(root==null)return;
       
       Queue<node>q=new LinkedList<>();
       int l=1;
       q.add(root);
       while(true){
           int size=q.size();
           if(l==level){
               System.out.println(size);
           }
           if(size==0||l>level){
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
           l++;
       }
   }
   
   
   //way2
   public static int getwidthoflevel(node root,int level){
       if(root==null){
           return 0;
       }
       if(level==1)return 1 ;
       return  getwidthoflevel(root.left,level-1)+getwidthoflevel(root.right,level-1);
   }

    public static void main(String args[]){
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
       elementsbetweenlevel(root,2);
       System.out.println(getwidthoflevel(root,2));
    }
}
