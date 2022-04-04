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
    public ListNode swapNodes(ListNode head, int k) {
        if(head.next==null)return head;
        ListNode temp=head;
        int n=0;
        ListNode a=null;
        while(temp!=null){
            n++;
            if(k==n)a=temp;
            temp=temp.next;
            
        } temp=head;
        int c=0;
        ListNode b=null;
        while(temp!=null){
            c++;
            if(c==n-k+1)b=temp;
            temp=temp.next;
        }
        int tea=a.val;
        a.val=b.val;
        b.val=tea;
        return head;
        
    }
}