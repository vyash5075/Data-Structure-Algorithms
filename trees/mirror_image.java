import java.util.*;
public class mirror_image {
    static class node{
        int data;
        node left;
        node right;
        node(int d)
        {
            this.data=d;
            left=right=null;
        }
    }
    static node root;
    mirror_image()
    {
        root=null;
    }
    public static void inorder(node root)
    {
        if(root!=null)
        {
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
        }
    }
    public static boolean checkmirror(node root)
    {
        return check(root,root);
    }
    public static boolean check(node root1,node root2)
    {
        if(root1==null&&root2==null)
            return true;
        if(root1!=null&&root2!=null&&root1.data==root2.data)
        {
            return(check(root1.left,root2.right)&&check(root1.right,root2.left));
        }
     return false;   
    }
    public static void main(String  args[])
    {
         mirror_image m=new  mirror_image();
         root=new node(3);
         root.left=new node(5);
         root.left.left=new node(1);
         root.right=new node(2);
         root.right.right=new node(1);
         System.out.println("inorder traversal");
         inorder(root);
        if(checkmirror(root))
            System.out.println("symmetrical");
        else
             System.out.println(" not symmetrical");
    }
}
