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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null&&list2==null)return null;
        if(list1==null&&list2!=null)return list2;
        if(list1!=null&&list2==null)return list1;
        ListNode t1=list1;
        ListNode t2=list2;
        ListNode prev=null;
        while(t1.next!=null)t1=t1.next;
        t1.next=t2;
        t1=list1;
        while(t1!=null){
            t2=t1.next;
            while(t2!=null){
                if(t1.val>t2.val){
                    int temp=t1.val;
                    t1.val=t2.val;
                    t2.val=temp;
                }
                t2=t2.next;
            }
            t1=t1.next;
        }
        return list1;
    }
}