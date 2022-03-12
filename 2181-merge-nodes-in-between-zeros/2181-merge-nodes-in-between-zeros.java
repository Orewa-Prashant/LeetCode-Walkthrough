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
    public ListNode mergeNodes(ListNode head) {
        if(head==null)return null;
        int sum=0;
        head=head.next;
        ListNode ans=null,prev=null;
        while(head!=null){
            if(head.val==0){
                
                ListNode a=new ListNode(sum);
                if(prev!=null)prev.next=a;
                else ans=a;
                prev=a;
                sum=0;
            }
            else sum+=head.val;
            
            head=head.next;
        }
        return ans;
    }
}