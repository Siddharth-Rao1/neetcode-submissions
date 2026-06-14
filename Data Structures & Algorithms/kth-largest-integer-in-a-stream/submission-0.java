class KthLargest {
    PriorityQueue<Integer> ab = new PriorityQueue<>((a,b)->Integer.compare(a,b));
    int k;
    public KthLargest(int k, int[] nums) {
        for(int i=0;i<nums.length;i++){
            ab.add(nums[i]);
        }
        this.k = k;
    }
    
    public int add(int val) {
        ab.add(val);
        while(ab.size()>k)
        {
            ab.poll();
        }
        return ab.peek();
    }
}
