    package strings;
    import java.util.*;

    /*
    input=>4,2,1,3
    output=>1,2,3,4
    */
     class newbie {
       static class node{
        int data;
        node next;

    }
      
       public static node insert(node head,int data){
          
        node temp=new node();
        
        temp.next=null;
        temp.data=data;
        if(head==null)
        {
            head=temp;
        }
         else{
            temp.next=head;
            head=temp;
        }
                
       return head;
       }
       
       public static void display(node head){
           node temp=head;
           while(temp!=null){
               System.out.println(temp.data);
               temp=temp.next;
           }
       }
       
       public static void lastelement(node head,int k){
           node slow=head;
           node fast=head;
           for(int i=0;i<k;i++){
               fast=fast.next;
           }
           while(fast!=null){
               slow=slow.next;
               fast=fast.next;
           }
           System.out.println(slow.data);
       }
       
      
       public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           node head=null;
           node head2=null;
           int n=sc.nextInt();
           for(int i=0;i<n;i++){
              head= insert(head,sc.nextInt());
           }
           System.out.println("enter the kth elelemnt from last you want");
           int k=sc.nextInt();
           lastelement(head,k);
            
         
       }
     }
       
      
    
       
        
