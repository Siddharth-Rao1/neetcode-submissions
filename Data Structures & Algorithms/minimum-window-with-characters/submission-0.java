class Solution {
    public String minWindow(String s, String t) {
        int[] a=new int[256];int start=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<t.length();i++){
            a[t.charAt(i)]++;
        }
        int n=t.length();
        int low=0,high=0,k=0;
        while(high<s.length()){
            if(a[s.charAt(high)]>0){
                k++;
            }
            a[s.charAt(high)]--;
            while(k==n){
                if(min>high-low+1){
                    min=high-low+1;start=low;
                }
                a[s.charAt(low)]++;
                if(a[s.charAt(low)]>0){
                    k--;
                }
                low++;
            }
            high++;
        }
        return (start==-1)?"":s.substring(start,start+min);  
    }
}
