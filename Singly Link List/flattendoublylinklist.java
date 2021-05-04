Input: head = [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
Output: [1,2,3,7,8,11,12,9,10,4,5,6]

class Solution {
    public Node flatten(Node head) {
        Node cur = head;
        Node tail = head;
        Stack<Node> stack = new Stack<>();
        while(cur != null) {
            if(cur.child != null) {
                Node child = cur.child;
                if(cur.next != null){ 
                    stack.push(cur.next);
                    cur.next.prev = null; 
                }
                cur.next = child;
                child.prev = cur;
                cur.child = null;
            }
            tail = cur;
            cur = cur.next;
        }
        while(!stack.isEmpty()) {
            cur = stack.pop();
            tail.next = cur;
            cur.prev = tail;
            while(cur != null) {
                tail = cur;
                cur = cur.next;
            }
        }
        return head;
    }
}
