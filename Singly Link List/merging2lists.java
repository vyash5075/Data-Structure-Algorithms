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
       
       public static node middleelement(node head){
          node a = head;
    node b = head.next;
    
    while(b != null && b.next != null) {
      a = a.next;
      b = b.next.next;
    }
    
    return a;
       }
       
       public static node mergesort(node head){
           if(head==null||head.next==null){
               return head;
           }
           node middle=middleelement(head);
           node secondhalf=middle.next;
           middle.next=null;
           node a= merge(mergesort(head),mergesort(secondhalf));
           return a;
       }
       public static node merge(node a,node b){
          node temp = new node();
    node finalList = temp;
    
    while(a != null && b != null) {
      if(a.data < b.data) {
        temp.next = a;
        a = a.next;
      } else {
        temp.next = b;
        b = b.next;
      }
      temp = temp.next;
    }
    temp.next = (a == null) ? b : a;
    return finalList.next;
         
       }
       
       public static void merging (node head1,node head2){
           node p=head1;
           node q=head2;
           node head3=null;
           node temp;
           if(p.data<q.data){
               
                temp=new node();
               temp.data=p.data;
               System.out.println("head1 is smaller"+head1.data);
               head3=temp;
               p=p.next;
           }
           else{
                 temp=new node();
               temp.data=q.data;
               System.out.println("head2 is smaller"+head2.data);
               head3=temp;
               q=q.next;
           }
          
           while(p!=null&&q!=null){
              
              if(p.data<q.data){
                  node s=p;
                  p=p.next;
                  s.next=null;
                  temp.next=s;
                  temp=temp.next;
              }
              else{
                   node s=q;
                  q=q.next;
                  s.next=null;
                  temp.next=s;
                  temp=temp.next;
              }
           }
           temp.next=(p!=null)?p:q;
           
            node temph=head3;
           while(temph!=null){
               System.out.println(temph.data);
               temph=temph.next;
           }
           return ;
           
       }
       public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           node head=null;
           node head2=null;
           int n=sc.nextInt();
           for(int i=0;i<n;i++){
              head= insert(head,sc.nextInt());
           }
            
          head= mergesort(head);
           display(head);
           
            for(int i=0;i<n;i++){
              head2= insert(head2,sc.nextInt());
           }
            head2= mergesort(head2);
           display(head2);
           
        merging(head,head2);
          // display(head);
       }
     }
       
      
    
       
        
