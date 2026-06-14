class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> ab = new PriorityQueue<Integer>
        ((a,b)->Integer.compare(b,a));
        for(int i=0;i<stones.length;i++){
            ab.add(stones[i]);
        }
        while(ab.size()>=2){
            int a=ab.poll();int b=ab.poll();
            if(a>b){
                ab.add(a-b);
            }else if(b>a){
                ab.add(b-a);
            }
        }
        return ab.size()>=1?ab.poll():0;
        //return ab.poll();
    }
}
