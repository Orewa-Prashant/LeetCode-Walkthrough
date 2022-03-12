/*
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
        Node root=head;
        HashMap<Node, Node> h=new HashMap<>();
        
        while(root!=null){
            Node A=new Node(root.val);
            h.put(root,A);
            root=root.next;
        }
        Node ans=head;
        while(head!=null){
            h.get(head).next=h.get(head.next);
            h.get(head).random=h.get(head.random);
            head=head.next;
        }
        
        return h.get(ans);
    }
}