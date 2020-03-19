/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @author yash verma
 */
import java.util.*;
public class delete_binary_tree_botom_up {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int d)
        {
            this.data=d;
            left=right=null;
        }
    }
    public static Node deleteTree(Node root)
    {
        if(root==null)
        {
            return null;
        }
        else{
            if(root!=null)
            {
                deleteTree(root.left);
                deleteTree(root.right);
                System.out.println(root.data+" will be deleted");
                root=null;
                return root;
            }
        }
        return null;
        
    }
    public static void main(String args[])
    {
        Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		deleteTree(root);
    }
}
