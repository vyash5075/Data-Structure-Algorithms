import java.util.*;

// wap to find pair sum of distinct nodes equal to given sum(x). if pair exists print yes else print no.
public class treepairsum {
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
   static int i=0;
   static int arr[]=new int[50];
   
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
              arr[i]=root.data;
              i++;
       inorder(root.right);
       
    }
    
}
  public static boolean ispair(node root,int sum)
  {
     Arrays.sort(arr);
     for(int i=0;i<arr.length-1;i++)
     {
         for(int j=i+1;j<arr.length;j++)
         {
             if(arr[i]+arr[j]==sum)
             {
                 return true;
             }
         }
     }
     return false;
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
        System.out.println("enter the sum element  to find pairs");
        int sum=sc.nextInt();
        boolean c=ispair(root,sum);
        if(c==true)
        {
         System.out.println("yes");   
        }
        else{
            System.out.println("no"); 
        }
        
  }
}
