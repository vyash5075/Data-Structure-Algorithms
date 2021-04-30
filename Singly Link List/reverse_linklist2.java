/**

Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]


 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
       int rr=right;
        int l=left;
        if(head==null);
        if(head.next==null)return head;
        if(left==right)return head;
        int size=size(head);
        ListNode lefty=head;
       
        ListNode q=head;
        while(left!=1){
            q=lefty;
            lefty=lefty.next;
            
            left--;
        }        
    int rightsize=rr-l;
        ListNode righty=lefty;
        ListNode r=righty.next;
        System.out.println(rightsize+"ss");
        while(rightsize!=0 ){
            righty=righty.next;
           
            r=righty.next;
            rightsize--;
        }
         
        righty.next=null;
        
      ListNode reversehead=reverse(lefty);
        display(reversehead);
        
        if(q!=lefty){
            
             q.next=reversehead;
        lefty.next=r;
        }
        else{
            head=reversehead;
            if(r!=righty&&r!=null){
                  lefty.next=r;
            }
              
        }
        
        return head;
        
    }
    public static void display(ListNode head){
        ListNode w=head;
        
        while(w!=null){
            System.out.println(w.val+"/");
            w=w.next;
        }
    }
    public static int size(ListNode head)
    {
        ListNode w=head;
     int count=0;
        while(w!=null){
            count++;
            w=w.next;
        }
        return count;
    }
    public static ListNode reverse(ListNode head){
        ListNode next=null;
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            next=temp.next;
           temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
}
