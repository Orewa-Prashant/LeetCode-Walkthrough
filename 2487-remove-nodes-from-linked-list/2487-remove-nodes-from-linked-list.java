/**
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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            st.push(temp);
            temp=temp.next;
        }
        
        int max=0;
        ListNode prev=null;
        while(!st.isEmpty()){
            ListNode curr=st.pop();
            if(curr.val>=max){
                curr.next=prev;
                prev=curr;
            }
            max=Math.max(max,curr.val);
            
        }
        return prev;
    }
}