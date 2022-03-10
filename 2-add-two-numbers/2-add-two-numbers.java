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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1=l1,t2=l2,prev=null;
        int c=0;
        while(t1!=null&&t2!=null){
            t1=t1.next;
            t2=t2.next;
        }
        if(t1==null){
            t2=l2;t1=l1;
            while(t1!=null){
                t2.val=t2.val+t1.val+c;
                if(t2.val>9){
                    t2.val%=10;
                    c=1;
                }
                else c=0;
                prev=t2;
                t2=t2.next;t1=t1.next;
            }
            while(t2!=null){
                t2.val=t2.val+c;
                if(t2.val>9){
                    t2.val%=10;
                    c=1;
                }
                else c=0;
                prev=t2;
                t2=t2.next;
            }
            if(c==1){
                ListNode nen=new ListNode(c);
                prev.next=nen;
            }
            return l2;
        }
        else {
            t2=l2;t1=l1;
            while(t2!=null){
                t1.val=t2.val+t1.val+c;
                if(t1.val>9){
                    t1.val%=10;
                    c=1;
                }
                else c=0;
                prev=t1;
                t2=t2.next;t1=t1.next;
            }
            while(t1!=null){
                t1.val=t1.val+c;
                if(t1.val>9){
                    t1.val%=10;
                    c=1;
                }
                else c=0;
                prev=t1;
                t1=t1.next;
            }
            if(c==1){
                ListNode nen=new ListNode(c);
                prev.next=nen;
            }
            return l1;
        }
   
    }
}
