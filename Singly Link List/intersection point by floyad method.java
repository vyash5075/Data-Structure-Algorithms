
    public static node Startingnodeofcycle(node head){
        if(head==null||head.next==null)return head;
        node slow=head;
        node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)break;
        }
        if(slow!=fast){
            return null;
        }
        
        slow=head;
        fast=fast;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }   
    
    
    public static   node IntersectionnodeinLL(node heada,node headb){
         if(heada==null||headb==null)return null;
         node tail=heada;
         while(tail.next!=null){
             tail=tail.next;
         }
         tail.next=headb;
       node ans=  Startingnodeofcycle(heada);
         tail.next=null;
         
         return ans;
    }
