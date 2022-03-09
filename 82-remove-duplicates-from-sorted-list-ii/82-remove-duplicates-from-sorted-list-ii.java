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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return null;
        if(head.next==null)return head;
        ListNode fakehead= new ListNode(-100);
        fakehead.next=head;
        ListNode temp=head;
        ListNode prev=fakehead;
        while(temp!=null){
            while(temp.next!=null&&temp.val==temp.next.val){
                temp=temp.next;
            }
            if(prev.next!=temp){
                prev.next=temp.next;
                temp=prev.next;
            }
            else{
                prev=prev.next;
                temp=temp.next;
                
            }
        }
        return fakehead.next;
    }
}