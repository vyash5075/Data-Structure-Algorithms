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
   
  
   public static int addlist(node one,int p1,node two,int p2,LinkedList rev){
       if(one==null&&two==null){
           return 0;
       }
      // int oc=0;
       if(p1>p2){
           int oc= addlist(one.next, p1-1, two, p2, rev);
             int sum=one.data+oc;
            int nd=sum/10;
            int nc=sum%10;
            node temp=new node(nc);
            if(rev.head==null){
                rev.head=temp;
            }
            else{
                temp.next=rev.head;
                rev.head=temp;
            }
            return nc;
       }
       else if(p2>p1){
           int oc= addlist(one, p1, two.next, p2-1, rev);
             int sum=two.data+oc;
            int nd=sum/10;
            int nc=sum%10;
            node temp=new node(nc);
            if(rev.head==null){
                rev.head=temp;
            }
            else{
                temp.next=rev.head;
                rev.head=temp;
            }
            return nc;
       }
       else{
           
           int oc=  addlist(one.next, p1-1, two.next, p2-1, rev);
            int sum=one.data+two.data+oc;
            int nc=sum/10;
            int nd=sum%10;
             
            node temp=new node(nd);
            if(rev.head==null){
                rev.head=temp;
            }
            else{
                temp.next=rev.head;
                rev.head=temp;
            }
            return nc;
       }
      
   }
   
   
   
   public static LinkedList addtwolists(LinkedList one,LinkedList two){
        LinkedList rev = new LinkedList();
        int oc=addlist(one.head,4,two.head,4,rev);
           if(oc>0){
                node temp=new node(oc);
            if(rev.head==null){
                rev.head=temp;
            }
            else{
                temp.next=rev.head;
                rev.head=temp;
            }
           }     
       return rev;
   }
    public static void main(String args[])
    {
        newbie r=new newbie();
        Scanner sc=new Scanner(System.in);
        LinkedList llist = new LinkedList();
            llist.insertNode(6);          
            llist.insertNode(2);          
            llist.insertNode(3);
           
            llist.insertNode(4);
             LinkedList llist2 = new LinkedList();
            llist2.insertNode(6);          
            llist2.insertNode(2);          
            llist2.insertNode(3);
            
            llist2.insertNode(4);
            
             System.out.println("Original Linked list1:");
            display(llist.head);
              System.out.println( );
              System.out.println("Original Linked list2:");
              display(llist2.head);
              LinkedList liste3=addtwolists(llist,llist2);
                display(liste3.head);
    }
}
