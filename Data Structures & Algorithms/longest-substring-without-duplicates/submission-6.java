class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low=0,high=0,len=1;
        if(s.length()==1)return 1;
        if(s.length()==0)return 0;
        int[] ch=new int[128];
        while(high<s.length()){
            ch[s.charAt(high)]++;
            while(ch[s.charAt(high)]>1){
                
                ch[s.charAt(low)]--;
                low++;
            }
            len=Math.max(len,high-low+1);
            high++;
        }
        return len;
    }
}
