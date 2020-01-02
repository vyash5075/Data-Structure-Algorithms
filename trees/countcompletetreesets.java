import java.util.*;
/**
 *
 * @author yash verma
 */
public class countcompletetreesets {
     static  class node  
{ 
    int data; 
    node left, right; 
   
    node(int item)  
    { 
        data = item; 
        left = right; 
    } 
}
     static node root1;
     public static void inorder(node root)
     {
         if(root!=null)
         {
             inorder(root.left);
             System.out.println(root.data);
             inorder(root.right);
         }
     }
    static  int count=1;
     public static int countcomplete(node root)
     {
         if(root!=null)
         {
             if(root.left!=null&&root.right!=null)
             {
                 count=count+2;
             }
             countcomplete(root.left);
             countcomplete(root.right);
         }
         return count;
     }
     public static void main(String args[])  
    { 
       root1 = new node(1); 
        root1.left = new node(2); 
        root1.right = new node(3); 
        root1.left.left = new node(4); 
        root1.left.right = new node(5); 
       root1.right.left = new node(6); 
        root1.left.right.left = new node(7); 
        root1.left.right.right = new node(8);
        //inorder(root1);
        int c=countcomplete(root1);
        System.out.print(count);
}
}

