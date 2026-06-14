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
        ListNode dummy=head;
        ListNode curr=head;int len=0;
        while(curr!=null){
            len++;curr=curr.next;
        }
        if(len==1||len==n)return head.next;
        int res=len-n;
        for(int i=1;i<res;i++){
            dummy=dummy.next;
        }
        dummy.next=dummy.next.next;
        return head;
    }
}
