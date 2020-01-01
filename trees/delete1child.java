import java.util.*;
/**
 *
 * @author yash verma
 */
public class delete1child {
    static class node{
    int data;
    node left;
    node right;
    node(int d)
    {
        this.data=d;
        node left=null;
        node right=null;
    }
}
   static node root;
   public static  node insert(node root,int data)
{
    node temp=new node(data);
    if(root==null)
    {
        root=temp;
        return root;
    }
    if(root!=null)
    {
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
        return root;
            
        }
    return root; 
}
  public static void inorder(node root)
        
{
    if(root==null)
    {
        return;
    }
    else
    {
      
       inorder(root.left);
              System.out.println(root.data);

       inorder(root.right);
       
    }
    
}
   public static boolean  search(node root,int item)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==item)
        {
            return true; 
        }
        
            boolean left=search(root.left,item);
            if(left)
            
                return true;
            
            
                boolean right=search(root.right,item);
         return right;
    }
   public static void deletion(node ptr, int item)
   {
        node parent=null;
	while(ptr!=null && ptr.data!=item)
	{
            parent=ptr;
            if(ptr.data>item)
            {
		ptr=ptr.left;
            }
            else
            {
		ptr=ptr.right;
            }
        }
            if(parent.left==ptr)
            {
		if(ptr.left!=null)
		{
                    parent.left=ptr.left;
                    ptr.left=null;
                }
                    else
		{
                    parent.left=ptr.right;
                    ptr.right=null;
                }					
            }
            else
            {
		if(ptr.left!=null)
		{
                    parent.right=ptr.left;
                    ptr.left=null;
		}
		else
		{
               	parent.right=ptr.right;
		ptr.right=null;
		}
            }
    }
   public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      root=insert(root,50);
       root=insert(root,45);
       root=insert(root,52);
       root=insert(root,12);
        root=insert(root,78); 
        root=insert(root,21); 
        root=insert(root,87);
        System.out.println("inorder");
        inorder(root);
        System.out.println("enter the u want to delete");
        int item=sc.nextInt();
        boolean flag=search(root,item);
        if(flag)
        {
           deletion(root,item);
            System.out.println("inorder");
           inorder(root);
        }
        else{
            System.out.println("invalid output");
        }    
  }
    
}
