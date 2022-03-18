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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1)return head;
        ListNode currHead=head,temp=head,last=null;
        ListNode newHead=head,ref=null;
        int ct=1;
        while(temp!=null){
            if(ct==k){
                last=temp.next;
                reverse(currHead,last);
                if(ref!=null)
                ref.next=temp;
                if(currHead==head)
                    newHead=temp;
                temp=last;
                ref=currHead;
                currHead=last;
                ct=1;
            }
            else{
            temp=temp.next;
            ct++;
            }
        }
        return newHead;
    }
    void reverse(ListNode head, ListNode last){
        ListNode curr=head;
        ListNode next=null;
        ListNode prev=last;
        while(curr!=last){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
    }
}