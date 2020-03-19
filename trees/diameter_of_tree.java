import java.util.*;
/**
 *
 * @author yash verma
 */
public class diameter_of_tree {
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
    public static node insert(node root,int data)
    {
        node temp=new node(data);
        if(root==null)
        {
            root=temp;
        }
        else{
            if(data<root.data)
            {
                insert(root.left,data);
                if(root.left==null)
                {
                    root.left=temp;
                }
            }
            else{
                insert(root.right,data);
                if(root.right==null)
                {
                    root.right=temp;
                }
            }
        }
        return root;
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
    public static  int height(node root)
    {
        int count1=0;
        int count2=0;
        if(root!=null)
        {
            count1=height(root.left);
            count1++;
            count2=height(root.right);
            count2++;
            return(count1>=count2?count1:count2);
        }
        return count2;
        
    }
    public static int findiameter(node root)
    {
        if(root==null)
        {
            return 0;
        }
        
       int lheight=height(root.left);
       int rheight=height(root.right);
       int ldiameter=findiameter(root.left);
       int rdiameter=findiameter(root.right);
       int max= Math.max(lheight+rheight+1,Math.max(ldiameter, rdiameter));
        return max;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            root=insert(root,sc.nextInt());
        }
        inorder(root);
        System.out.println("diameter of give tree is"+findiameter(root));
    }
}
