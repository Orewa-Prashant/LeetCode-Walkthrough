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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null)return null;
        ListNode s=head;ListNode f=head;ListNode p=head;
        while(f!=null&&f.next!=null){
            p=s;
            f=f.next.next;
            s=s.next;
        }
        p.next=s.next;
        return head;
        
    }
}