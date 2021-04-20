    package strings;
    import java.util.*;
     class newbie {
       static class node{
        int data;
        node next;
        node(int d)
        {
            this.data=d;
            next=null;
        }
    }
       
        
        public static node insert(node head,int data){
            node temp=new node(data);
           
            if(head==null){
                head=temp;
            }
            else{
            node pr=head;
            while(pr.next!=null){
                pr=pr.next;
            }
            pr.next=temp;
            }
            return head;
            
        }
       
        public static void display(node head){
            node temp=head;
            int sum=0;
            while(temp!=null){
                sum+=temp.data;
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
        
       
        
      
        
        public static void middleelement(node head){
            node slow=head;
            node fast=head;
            while(fast!=null&&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            System.out.println("d"+slow.data);
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            node head=null;
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
               head= insert(head,sc.nextInt());
            }
            middleelement(head);
             display(head);
           
     
        }
     }
