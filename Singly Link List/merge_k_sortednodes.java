
package singlylinklist;

public class ksorted_Linklists {
static class node{
    int data;
    node next;
    node(int d){
        this.data=d;
    }
}
static node head;
public static void display(node head){
    node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println();
}


public static node mergeklists(node arr[],int last){
    
    // Traverse form second list to last
    for (int i = 1; i <= last; i++)
    {
      while(true)
      {
 
        // head of both the lists,
        // 0 and ith list. 
        node head_0 = arr[0];
        node head_i = arr[i];
 
        // Break if list ended
        if (head_i == null)
          break;
 
        // Smaller than first element
        if(head_0.data >= head_i.data)
        {
          arr[i] = head_i.next;
          head_i.next = head_0;
          arr[0] = head_i;
        }
        else
        {
 
          // Traverse the first list
          while (head_0.next != null)
          {
 
            // Smaller than next element
            if (head_0.next.data >= head_i.data)
            {
              arr[i] = head_i.next;
              head_i.next = head_0.next;
              head_0.next = head_i;
              break;
            }
 
            // go to next node
            head_0 = head_0.next;
 
            // if last node
            if (head_0.next == null)
            {
              arr[i] = head_i.next;
              head_i.next = null;
              head_0.next = head_i;
              head_0.next.next = null;
              break;
            }
          }
        }
      }
    }
    return arr[0];
}
public static void main(String args[]){
    int k=3;
    int n=4;
    node arr[]=new node[k];
    arr[0]=new node(1);
    arr[0].next=new node(3);
    arr[0].next.next=new node(5);
    arr[0].next.next.next = new node(7);
 
    arr[1] = new node(2);
    arr[1].next = new node(4);
    arr[1].next.next = new node(6);
    arr[1].next.next.next = new node(8);
 
    arr[2] = new node(0);
    arr[2].next = new node(9);
    arr[2].next.next = new node(10);
    arr[2].next.next.next = new node(11);
    
    
    head=mergeklists(arr,k-1);
    display(head);
 
}

}
