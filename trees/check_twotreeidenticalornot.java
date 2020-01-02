import java.util.*;


/**
 *
 * @author yash verma
 */
class Node  
{ 
    int data; 
    Node left, right; 
   
    Node(int item)  
    { 
        data = item; 
        left = right = null; 
    } 
} 
public class check_twotreeidenticalornot {
   Node root1;
   Node root2;
   boolean identicaltrees(Node root1,Node root2)
   {
       if(root1==null&&root2==null)
       {
           return true;
       }
       if(root1!=null&&root2!=null)
       {
           if(root1.data==root2.data)
           {
              return identicaltrees(root1.left,root2.left)&&identicaltrees(root1.right,root2.right);
           }
           
           
       }
      return false;
   }
   public static void main(String[] args)  
    { 
        twotreeidenticalornot tree = new twotreeidenticalornot(); 
   
        tree.root1 = new Node(1); 
        tree.root1.left = new Node(9); 
        tree.root1.right = new Node(3); 
        tree.root1.left.left = new Node(4); 
        tree.root1.left.right = new Node(5); 
   
        tree.root2 = new Node(1); 
        tree.root2.left = new Node(9); 
        tree.root2.right = new Node(3); 
        tree.root2.left.left = new Node(4); 
        tree.root2.left.right = new Node(5);
        boolean b= tree.identicaltrees(tree.root1,tree.root2);
        if(b==true)
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
