/**Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]

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
    public ListNode deleteDuplicates(ListNode head) {  
        if(head==null||head.next==null)return head;
         ListNode dummy=new ListNode(-1);
        ListNode itr=dummy;
        itr.next=head;
        ListNode curr=head.next;
        while(curr!=null){
            
            boolean islooprun=false;
            while(curr!=null&&itr.next.val==curr.val){
                islooprun=true;
                 curr=curr.next;
            }
            if(islooprun){
                itr.next=curr;
            }
            else{
              itr=itr.next;
            }
            if(curr!=null)curr=curr.next;
               
        }
        
       
        return dummy.next;
    }
}
