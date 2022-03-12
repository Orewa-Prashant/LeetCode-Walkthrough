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
    public int pairSum(ListNode head) {
        ListNode temp=head;
        int len=0;   //var to store the length if the linked list
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        Stack<Integer> st=new Stack<>();
        int i=0,max=0;
        while(head!=null){
            if(i<len/2){
                st.push(head.val);
            }
            else{
                max=Math.max(max,head.val+st.pop());
            }
            i++;
            head=head.next;
        }
        return max;
        
    }
}