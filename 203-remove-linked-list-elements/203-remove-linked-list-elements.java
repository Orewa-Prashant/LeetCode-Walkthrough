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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)return null;
        ListNode temp=head;
        ListNode curr=null;
        int c=0;
        while(temp!=null){c++;
            if(temp==head&&temp.val==val){head=temp.next;curr=head;}
            else if(temp.val==val){
                while(temp!=null){
                    if(temp.val!=val)break;
                    temp=temp.next;
                }
                curr.next=temp;
                if(temp==null){
                    return head;
                }
            }
            curr=temp;
            temp=temp.next;
        }
        return head;
    }
}