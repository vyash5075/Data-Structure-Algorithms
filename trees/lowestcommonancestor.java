import java.util.*;
public class lowestcommonancestor {
    static class node{
        int data;
        node left;
        node right;
        node(int d)
        {
            this.data=d;
            left=null;
            right=null;
        }
    }
    static node root;
    lowestcommonancestor()
    {
        root=null;
    }
    public static void insert(int data)
    {
        root=insertt(root,data);
    }
    public static node insertt(node root,int data)
    {
     if(root==null)
        {
            root=new node(data);
            return root;
        }
        else if(root!=null)
        {
            node temp=new node(data);
            if(data<root.data)
            {
                insertt(root.left,data);
                if(root.left==null)
                {
                    root.left=temp;
                }
            }
            else
            {
                insertt(root.right,data);
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
    {if(root!=null)
    {
        inorder(root.left);
          System.out.print(root.data+"->");
          
         inorder(root.right);
    }
    }
    public static node lca(int m,int n)
    {
        return findlca(root, m, n);
     
    }
    public static node findlca(node root,int m,int n)
    {
        if(root==null)
        
            return root;
        else    
         if(root.data==m||root.data==n)
                return root;
             
      node left_lca = findlca(root.left, m, n); 
        node right_lca = findlca(root.right, m, n);  
            
          if (left_lca!=null && right_lca!=null) 
            return root;
        
        return (left_lca != null) ? left_lca : right_lca;      
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        lowestcommonancestor l=new lowestcommonancestor();
        l.insert(50);
        l.insert(60);
        l.insert(30);
        l.insert(40);
        l.insert(70);
        l.inorder(root);
       System.out.println("enter the element 1");
        int m=sc.nextInt();
        System.out.println("enter the element 2");
        int n=sc.nextInt();
       System.out.println(l.lca(m,n).data); 
    } 
}
