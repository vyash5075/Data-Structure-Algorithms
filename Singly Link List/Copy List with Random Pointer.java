/*

Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
   Node headd =copylist(head);
    Node headdd=copyrandompointers(headd); 
       return deepcopy(headdd); 
    }
    
    public static Node copylist(Node head){
        Node curr=head;
        while(curr!=null){
            Node forw=curr.next;
            Node temp=new Node(curr.val);
            curr.next=temp;
            temp.next=forw;
            curr=forw;
            
        }
        return head;
    }
    public static Node copyrandompointers(Node head){
        Node curr=head;
        while(curr!=null){
            Node random=curr.random;
            if(random!=null){
                 curr.next.random=random.next;
               
            }
             curr=curr.next.next;
           
        }
        return head;
    }
    public static Node deepcopy(Node head){
        Node dummy=new Node(-1);
        Node prev=dummy;
        Node curr=head;
        while(curr!=null){
            prev.next=curr.next;
            curr.next=curr.next.next;
            prev=prev.next;
            curr=curr.next;
        }
        return dummy.next;
    }
}


-------------------------------------------------------------
    //way 2 by hashmap
    
    
    
    public static node copyrandomlist(node head){
      
        HashMap<node,node>map=new HashMap<>();
        node curr=head;
        
        node nhead=new node(-1);
        node prev=head;
        
        while(curr!=null){
              node node =new node(curr.data);
        
            prev.next=node;
            map.put(curr,node);
            
            prev=prev.next;
            curr=curr.next;
            
        }
        nhead=nhead.next;
                node c1=head;
                node c2=nhead;
                
                while(c1!=null){
                    c2.random=(c2.random!=null?map.get(c1.random):null);
                    c1=c1.next;
                    c2=c2.next;
                }
                return nhead;
    }
    
  
