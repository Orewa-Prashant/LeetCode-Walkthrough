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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)return null;
        ListNode temp=head;
        int c=length(temp);
        if(c-n==0)return head.next;
        delete(temp,0,c-n,null);
        return head;
    }
    private int length(ListNode temp){
        if(temp.next==null)return 1;
        int c=length(temp.next);
        return 1+c;
    } 
    private void delete(ListNode temp, int n, int c,ListNode prev){
        if(n==c){
            prev.next=temp.next;
            return;
        } 
        prev=temp;
        delete(temp.next,n+1,c,prev);
    }
}