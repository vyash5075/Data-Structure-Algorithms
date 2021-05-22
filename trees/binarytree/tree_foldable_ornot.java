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
public class tree_foldable_ornot {
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
    

public static boolean checkfoldable(node root){
if(root==null)return true;
return checkmirrorstructure(root.left,root.right);
}
  public static boolean checkmirrorstructure(node root1,node root2){
      
      if(root1==null&&root2==null)return true;
      if(root1==null||root2==null)return false;
      return  checkmirrorstructure(root1.left,root2.right)&&checkmirrorstructure(root1.right,root2.left);
  }
     
  
    public static void main(String args[]){
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
        System.out.println(checkfoldable(root));
        
        
        
    }
}
