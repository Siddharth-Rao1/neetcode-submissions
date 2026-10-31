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