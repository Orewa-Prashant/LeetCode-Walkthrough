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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)return null;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        return fun(head,temp);
    }
    TreeNode fun(ListNode head, ListNode end){
        if(end==null)return null;
        if(head==end)return new TreeNode(head.val);
        ListNode slow=head,fast=head,prev=null;
        while(fast!=end&&fast.next!=end){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        TreeNode root=new TreeNode(slow.val);
        root.right=fun(slow.next,end);
        root.left=fun(head,prev);
        return root;
    }
}