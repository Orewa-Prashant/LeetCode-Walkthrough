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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0)return head;
        ListNode t=head,pow=null;int c=0;
        while(t!=null){
            c++;  // C is to calcualte length
            t=t.next;
        }
        k%=c;   // if k > c
        if(k==0)return head;
        k=c-k;c=0;
        t=head;
        ListNode prev=null;
        while(c!=k){
            c++;
            prev=t;
            t=t.next;
        }
        prev.next=null;
        pow=t;
        while(t.next!=null)t=t.next;
        t.next=head;head=pow;
        return head;
    }
}