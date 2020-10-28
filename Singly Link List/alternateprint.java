import java.util.*;
/**
 *
 * @author yash verma
 */
public class alternateprint {
    
      static class node{
          int data;
          node next;
          node(int d)
          {
              this.data=d;
              next=null;
          }
      }
      node  head;
      public node insert(alternateprint t1,int data){
         
         node temp=new node(data);
         if(t1.head==null)
         {
             t1.head=temp;
         }
         else{
             node t=t1.head;
             while(t.next!=null)
             {
                 t=t.next;
                 
             }
             t.next=temp;
         }
         return head;
      }
      public void print(alternateprint t1)
      {int sum=0;
          node t=t1.head;
          while(t!=null)
          {
              System.out.print(t.data+"->");
              sum=sum+t.data;
              t=t.next;
          }
          System.out.println("sum is "+sum);
          
      }
      
      public node alternateprint(alternateprint t1)
      {System.out.println("alternate print of link list");
          int sum=0;
           if(t1.head==null)
           {
               return t1.head;
           }
           else{
               node temp=t1.head;
               while(temp!=null)
               {
                   System.out.println(temp.data);
                   sum=sum+temp.data;
                   temp=temp.next.next;
               }
               System.out.println("sum is "+sum);
           }
           return t1.head;
          
      }
      public static void main(String args[]){
          System.out.println("array link ist");
          Scanner sc=new Scanner(System .in);
          alternateprint t1=new alternateprint();
          int n=sc.nextInt();
          int arr[]=new int[n];
          for(int i=0;i<n;i++)
          {
              arr[i]=sc.nextInt();
          }
               
          for(int i=0;i<n;i++){
              t1.insert(t1,arr[i]);
          }
          
          t1.print(t1);
         
          t1.alternateprint(t1);
                   
        
      }
        
}
