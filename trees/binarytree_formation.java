/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;
import java.util.*;
/**
 *
 * @author yash verma
 */
public class binarytree_formation {
    static class node{
        int data;
        node left,right;
        node(int d){
            this.data=d;
            left=right=null;
        }
    }
    node root;
    public static node constructree(node root,int arr[],int i)
    {
        if(i<arr.length)
        {
            node temp=new node(arr[i]);
            if(root==null)
            {
                root=temp;
            }
            root.left=constructree(root.left,arr,2*i+1);
            root.right=constructree(root.right,arr,2*i+2);
        }
        return root;
    }
    
    public void inorder(node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.println(root.data+"d");
            inorder(root.right);
        }
    }
    
    
    public static void  main(String args[])
    {
        binarytree_formation b=new binarytree_formation();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        b.root=constructree(b.root,arr,0);
        b.inorder(b.root);
        
        
    }
}
