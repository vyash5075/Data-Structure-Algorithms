/**


Input: head = [1,4,3,2,5,2], x = 3
Output: [1,2,2,4,3,5]


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
    public ListNode partition(ListNode head, int x) {
        if(head==null)return null;
        if(head.next==null)return head;
  
    ListNode dummyHead1=new ListNode(-1);
        ListNode smaller=dummyHead1;
        ListNode dummyHead2=new ListNode(-1);
        ListNode greater=dummyHead2;
        
        while(head!=null){
            if(head.val<x){
                smaller.next=head;
                smaller=smaller.next;
                
            }
            else{
                greater.next=head;
                greater=greater.next;
            }
            head=head.next;
        }
        greater.next=null;
        smaller.next=dummyHead2.next;
        return dummyHead1.next;
        
        
    }
}
