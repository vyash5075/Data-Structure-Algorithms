import java.util.*;
/*input 
7
1 2 3 4 5 6 7 

output
 4 2 1 3 6 5 7  
*/
public class arrtree {
static class node {
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
public static  node sarray(node root,int arr[],int start,int end)
{
    if(start>end)
    {
        return null;
    }
        int mid=(start+end)/2;
        node temp=new node(arr[mid]);
        if(root==null)
        {
            root=temp;
        }
        
            root.left=sarray(root.left,arr,start,mid-1);
            root.right=sarray(root.right,arr,mid+1,end);
        

    return root;
}

public static void preorder(node root)
{
    if(root==null)
    {
        return;
    }
   else
    {
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
}
public static void main(String args[])
{
    arrtree a=new arrtree();
    int n;
    Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    root=a.sarray(root,arr,0,n-1);
    System.out.println("output:-");
    a.preorder(a.root);
}
}

