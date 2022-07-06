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
    public ListNode partition(ListNode head, int x) {
        ArrayList<ListNode> less=new ArrayList<>();
        ArrayList<ListNode> more=new ArrayList<>();
        
        ListNode hehe=head;
        while(head!=null){
            if(head.val<x)less.add(head);
            else more.add(head);
            head=head.next;
        }
        if(less.size()==0)return hehe;
        ListNode prev=null;
        
        for(int i=0;i<less.size();i++){
            if(prev!=null){
                prev.next=less.get(i);
            }
            less.get(i).next=null;
            prev=less.get(i);
        }
        for(int i=0;i<more.size();i++){
            if(prev!=null){
                prev.next=more.get(i);
            }
            more.get(i).next=null;
            prev=more.get(i);
        }
        return less.get(0);
    }
    /*
    
            ListNode dummyHead=new ListNode(0);
        dummyHead.next=head;
        ListNode temp=head;
        ListNode ref=dummyHead;
        ListNode prev=dummyHead;
        boolean seen=false;
        while(temp!=null ){
            if(seen){
                if(temp.val<x){
                    //System.out.println(temp.val+".."+ref.val);
                    ListNode iter=temp.next;
                    System.out.println(iter.val);
                    prev.next=temp.next;
                    temp.next=ref.next;
                    ref.next=temp.next;
                    temp=iter;
                }
                else{
                    prev=temp;
                    temp=temp.next;
                }
            }
            else{
                if(temp.val==x)seen=true;
                if(temp.val<x)ref=temp;
                prev=temp;
                temp=temp.next;
            }
        }
        return head;
    
    */
}