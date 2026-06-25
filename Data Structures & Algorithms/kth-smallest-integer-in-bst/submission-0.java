/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer>q= new PriorityQueue<>();
        dfs( root,q);
        for(int i=1;i<k;i++){
            q.poll();
        }   
        return q.peek();
    }
    void dfs(TreeNode root,PriorityQueue<Integer>q){
        if(root==null)return;
        q.add(root.val);
        dfs(root.left,q);
        dfs(root.right,q);
        return ;
    }
}
