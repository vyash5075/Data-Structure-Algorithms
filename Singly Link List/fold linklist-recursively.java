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
                 public static  node left;
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
   
   
    
   
   public static node fold(node head,int size)
   {
      return folded(head, head,0,4);
   }
   
   public static node folded(node head,node curr,int floor,int size){
       
     if(curr==null)return head;
     node result=re(head, curr.next,floor,size);
     if(result!=head||curr.next==null){
         if(result!=curr&&result.next!=curr){
             curr.next=result.next;
             result.next=curr;
             return curr.next;
         }  curr.next=null;
     }
   
     return head;
     
 }
    public static void main(String args[])
    {
        newbie r=new newbie();
        Scanner sc=new Scanner(System.in);
        LinkedList llist = new LinkedList();
            llist.insertNode(20);          
            llist.insertNode(4);          
            llist.insertNode(15);
             llist.insertNode(25);
            llist.insertNode(85);
             System.out.println("Original Linked list:");
            display(llist.head);
              System.out.println( );
              System.out.println("Reversed Linked list:");
       node llist1 =  fold(llist.head,4);
         // node llist1 = reverse(llist.head);
              display(llist1);
    }
}
