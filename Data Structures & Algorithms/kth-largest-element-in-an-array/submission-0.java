class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> ab = new PriorityQueue<>((a,b)->
        b-a);
        for(int i=0;i<nums.length;i++){
            ab.add(nums[i]);
        }
        for(int i=1;i<k;i++){
            ab.poll();
        }
        return ab.peek();
    }
}
