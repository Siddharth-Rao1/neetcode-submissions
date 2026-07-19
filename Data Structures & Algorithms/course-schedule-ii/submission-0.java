class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        int[] inDegree = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int j:adj.get(i)){
                inDegree[j]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(inDegree[i]==0){
                q.add(i);
            }
        }
        int[] res = new int[numCourses];int indx=0;
        while(!q.isEmpty()){
            int node =q.poll();
            res[indx++]=node;
            for(int i:adj.get(node)){
                inDegree[i]--;
                if(inDegree[i]==0)q.add(i);
            }
        }
        if(indx==numCourses)return res;
        int[] arr ={};
        return arr;
    }
}
