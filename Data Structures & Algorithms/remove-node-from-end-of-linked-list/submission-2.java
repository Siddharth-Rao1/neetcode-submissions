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
         ListNode curr= head,curr1=head;int l=0;
    while(curr!=null){
        curr=curr.next;l++;
    }
    if(l==1||l==n)return head.next;
    for(int i=1;i<(l-n);i++){
        curr1=curr1.next;
    }
    curr1.next=curr1.next.next;
    return head;
       
    }
}
