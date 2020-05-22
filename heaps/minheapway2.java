package array;
import java.util.*;
/**
 *
 * @author yash verma
 */
public class minheapway2 {
    public int heap[];
    int size;
    int maxsize;
    minheapway2(int d)
    {
        this.maxsize=d;
        size=0;
        heap=new int[maxsize];
        heap[0]=Integer.MIN_VALUE;
    }
    public void insert(int element)
    {
        if(size>maxsize)
        {
            return;
        }
        else{
            heap[++size]=element;
            int current=size;
            while(heap[current]<heap[parent(current)])
            {
                swap(current,parent(current));
                current=parent(current);
            }
        }
    }
    public int parent(int i)
    {
        return i/2;
    }
    public void swap(int curr,int p)
    {
        int temp=heap[curr];
        heap[curr]=heap[p];
        heap[p]=temp;
    }
public void print()
{
    for(int i=1;i<=size;i++)
    {
        System.out.print(heap[i]+" ");
        
    }
    System.out.println();
}
public void minheap()
{
    int poss=size/2;
    for(int pos=poss;pos>=1;pos--)
    {
     heapify(pos);   
    }
}
    public void heapify(int parent)
    {
       if(!leafnode(parent))
       {
           int left=leftchild(parent);
           int right=rightchild(parent);
           if(heap[left]<heap[parent]||heap[right]<heap[parent])
           {
               if(heap[left]<heap[right])
               {
                   swap(left,parent);
                   heapify(left);
                   
               }
           }
           else{
               swap(right,parent);
               heapify(right);
           }
               
       }
    }
    public int leftchild(int pos)
    {
        return pos*2;
    }
    public int rightchild(int pos)
    {
        return pos*2+1;
    }
public boolean leafnode(int pos)
{
    if (pos>=size/2&&pos<size)
    {
        return true;
    }
    return false;
}
public void printt() 
    { 
        for (int i = 1; i <= size / 2; i++) { 
            System.out.print(" PARENT : " + heap[i] 
                             + " LEFT CHILD : " + heap[2 * i] 
                             + " RIGHT CHILD :" + heap[2 * i + 1]); 
            System.out.println(); 
        } 
    } 
    public static void main(String args[])
    {
        minheapway2 m=new minheapway2(15);
        m.insert(5);
        m.insert(3);
        m.insert(17);
        m.insert(10);
        m.insert(84);
        m.insert(19);
        m.insert(6);
        m.insert(22);
        m.insert(9);
        m.print();
	System.out.println();
        System.out.println(m.size);
       // m.minheap();
        m.print();
        m.printt();
    }
}

