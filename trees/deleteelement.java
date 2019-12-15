import java.util.*;
public class deleteelement {
    
    class node{
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
public deleteelement()
{
    root=null;
}
    
public deleteelement(int key)
        
{
    root=new node(key);
    
}
public node insert(node root,int data)
{
    node temp=new node(data);
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
    return;
}
public static node minimum(node temporary)
{
    while(temporary.left!=null)
    {
        temporary=temporary.left;
    }
    return temporary;
}
public static node del(node root,int item)
{
    node temporary=root;
    node temp1=null;
    while(temporary!=null&&temporary.data!=item)
    {
        temp1=temporary;
        if(item<temporary.data)
        {
           temporary=temporary.left;
            
        }
        else
        {
            temporary=temporary.right;
        }
    }  

if(temporary==null)
{
    return root;
}
if(temporary.left==null&&temporary.right==null)
{
    if(temporary!=root)
    {
        if(temp1.left==temporary)
        {
            temp1.left=null;
        }
        else
        {
            temp1.right=null;
        }
    }
        else
    {
        root=null;
    }
    }
else if(temporary.left!=null&&temporary.right!=null)
{
    node p=minimum(temporary.right);
    int a=p.data;
    del(root,p.data);
    temporary.data=a;
}
else
{
    node child=null;
    if(temporary.left!=null||temporary.right!=null)
    {
        if (temporary.left!=null)
        {
             child=temporary.left;
        }
        else
        {
             child=temporary.right;
        }
    }
    if(temporary!=root)
    {
        if(temporary==temp1.left)
        {
            temp1.left=child;
        }
        else
        {
            temp1.right=child;
        }
    }
    else
    {
        root=child;
    }
}
 return root;
}

public static void main(String args[])
  {
    deleteelement bst=new deleteelement(50);
    bst.insert(bst.root,30);
    bst.insert(bst.root,56);
    bst.insert(bst.root,86);
    bst.insert(bst.root,59);
    bst.insert(bst.root,20);
    bst.insert(bst.root,35);
    bst.insert(bst.root,33);
    System.out.println("bst in preorder");
    inorder(bst.root);
  //  int k= height(bst.root);
    //System.out.println("height of tree is"+ k);
     System.out.println("enter the item u want to delete");
     Scanner sc=new Scanner(System.in);
     int  m=sc.nextInt();
     bst.del(bst.root,m);
     System.out.println("inorder after deletion");
     inorder(bst.root);
  }
}
