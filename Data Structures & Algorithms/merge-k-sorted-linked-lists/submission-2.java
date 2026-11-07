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

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode>al=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode curr:lists){
            if(curr!=null){
                al.add(curr);
            }
        }
        ListNode merge=new ListNode(-1);
        ListNode curr=merge;
        while(!al.isEmpty()){
            ListNode temp=al.poll();
            curr.next=temp;curr=curr.next;
            if(temp.next!=null){
                al.add(temp.next);
            }
        }
        return merge.next;
    }
}
