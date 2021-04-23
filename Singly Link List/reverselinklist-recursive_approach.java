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
        node(int d)
        {
            this.data=d;
            this.next=null;
        }
    }
                 static class LinkedList {
		public  node head;

		public LinkedList() {
			this.head = null;
		}
                 
   
                     public void insertNode(int nodeData) {
			node node = new node(nodeData);

			if (this.head != null) {
				node.next = head;
			}
			this.head = node;
		}
	}
   public static  void display(node head)
   {
       if(head!=null)
       {
           node p=head;
           while(p!=null)
           {
               System.out.print(p.data+"->");
               p=p.next;
           }
       }
   }
   
   
   
   public static node  rev(node head){
       
      if(head==null){
          return head;
      }
      if(head.next==null){
          return head;
      }
      node newhead=rev(head.next);
      head.next.next=head;
      head.next=null;
      return newhead;
   }
   static node reverse(node head){
       if(head==null) return head;
       if(head.next==null) return head;
       node newnode=reverse(head.next);
       head.next.next=head;
       head.next=null;
       return newnode;
   }
   
    public static void main(String args[])
    {
        newbie r=new newbie();
       // node head=null;
        Scanner sc=new Scanner(System.in);
        LinkedList llist = new LinkedList();
            llist.insertNode(20);
          
            llist.insertNode(4);
           
            llist.insertNode(15);
            
            llist.insertNode(85);
             System.out.println("Original Linked list:");
            display(llist.head);
              System.out.println( );
              System.out.println("Reversed Linked list:");
            node llist1 = reverse(llist.head);
         
              display(llist1);
    }
}
