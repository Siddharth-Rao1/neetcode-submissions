class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> al = new HashSet<>();
        int l=0,res=0;
        for(int i=0;i<s.length();i++){
            while(al.contains(s.charAt(i))){
                al.remove(s.charAt(l));l++;
            }
            al.add(s.charAt(i));
            res=Math.max(res,i-l+1);
        }
        return res;
    }
}
