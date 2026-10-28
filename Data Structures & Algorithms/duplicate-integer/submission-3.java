class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> sh = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(sh.contains(nums[i])){
                return true;
            }
            sh.add(nums[i]);
        }
        return false;
    }
}