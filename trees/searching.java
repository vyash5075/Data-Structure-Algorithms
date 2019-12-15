import jva.util.*;
public class searching {
    static class node{
        int data;
        node left;
        node right;
        node (int d)
        {
            this.data=d;
            left=null;
            right=null;
        }
    }
    static node root;
    public static node insert(node root,int data)
    {
        node temp=new node(data);
        if(root==null)
        {
            root=temp;
            return root;
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
   static  int sum=0;
    public static int inorder(node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.println(root.data);
            sum=sum+root.data;
            inorder(root.right);
        }
        return sum;
    }
    public static void searching(node root,int item)
{
    if(root==null)
    {
        System.out.println("item not found");
        
    }
    else if(item==root.data)
        {
            System.out.println("item found");
        
        }
    else if(item<root.data)
    
        searching(root.left,item);
     
    
    else
    
        searching(root.right,item);
    
}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of entries");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
          root= insert(root,sc.nextInt());
        }
        System.out.println("enter the element to find");
        int item=sc.nextInt();
        searching(root,item); 
    }
}
