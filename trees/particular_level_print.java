import java.util.*;
public class Particular_level_print {
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
  
   public static int height(node root)
   {
       int count1=0;
       int count2=0;
       if(root!=null)
       {
           count1=height(root.left);
           count1++;
           count2=height(root.right);
           count2++;
           return count1>=count2?count1:count2;
       }
       return count2;
   }
    public static  void level(node root,int height,int level)
 {
    if(level>height&&level<height)
    {
        System.out.println("level invalid");
    }
    else{
             levelprint(root,level);
    }
         
     
 }
    public static void levelprint(node root,int level)
    {
        if(root!=null)
        {
            if(level==0)
            {
                System.out.println(root.data);
            }
            levelprint(root.left,level-1);
            levelprint(root.right,level-1);
        }
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
        int p=height(root);
        System.out.println("height"+p);
        System.out.println("enter the level to print elemnts of that level");
        int lev=sc.nextInt();
        level(root,p,lev); 
    }
}
