class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int [] w = new int[26];
        int [] s = new int[26];
        if(s1.length()>s2.length())return false;
        for(int i=0;i<s1.length();i++){
            s[s1.charAt(i)-'a']++;
            w[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(w,s))return true;
        for(int i=s1.length();i<s2.length();i++){
            w[s2.charAt(i)-'a']++;
            w[s2.charAt(i-s1.length())-'a']--;
            if(Arrays.equals(w,s)){
                return true;
            }
        }
        return false;
    }
}
