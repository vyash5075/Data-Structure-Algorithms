/**
 Input:
root = [1, 2, 3], k = 5
Output: [[1],[2],[3],[],[]]
Input: 
root = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], k = 3
Output: [[1, 2, 3, 4], [5, 6, 7], [8, 9, 10]]
 */
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        int m = findLength(root);
        ListNode temp = root;
        
        ListNode[] res = new ListNode[k];
        int size=m/k;
        int l= m%k;
        
        for(int i=0;i<k;i++){
            ListNode ans= temp;
            int j=size;
            while(temp!=null && j>1){
                temp=temp.next;j--;
            }
            if(size!=0 && l>0 && temp!=null){ temp=temp.next;  l--;}
            ListNode temp1=temp;
            if(temp!=null) temp=temp.next;
            if(temp1!=null) temp1.next=null;
            res[i]=ans;
        }
        return res;
    }
    
    private int findLength(ListNode root) {
        if (root == null) return 0;
        int l = 0;
        while(root != null) {
            l++;
            root = root.next;
        }
        
        return l;
    }
}
