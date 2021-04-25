 public static node reverse(node head)
     {if(head==null||head.next==null){
            return head;
        }
         node temp=head;
         node prev=null;
         node next=null;
         while(temp!=null)
         {
             next=temp.next;
             temp.next=prev;
             prev=temp;
             temp=next;
         }
         head=prev;
         return head;
     }
     
      public static node subtracttwonumbers(node l1,node l2){
       //  asssumption: l1 is >l2 in size   
       if( l2==null){
           return l1;
       }
       if(l1==null){
           l2.data=-l2.data;
           return l2;
       }
       l1=reverse(l1);
       l2=reverse(l2);
       node head=new node (-1);
       node itr=head;
       node c1=l1;
       node c2=l2;
       int borrow=0;
       while(c1!=null){
           int diff=borrow+c1.data-(c2!=null?c2.data:0);
           if(diff<0){
               borrow=-1;
               diff+=10;
           }
           else{
               borrow=0;
           }
           itr.next=new node(diff);
           itr=itr.next;
           
           c1=c1.next;
           if(c2!=null)c2=c2.next;
       }
      return reverse(head.next);
       
   }
