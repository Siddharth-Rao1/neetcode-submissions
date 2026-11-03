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
    public void count(TreeNode root,int max,int[] cnt){
        if(root==null)return;
        if(root.val>=max){
            max=root.val;cnt[0]++;
        }
        count(root.left,max,cnt);
        count(root.right,max,cnt);
    }
    public int goodNodes(TreeNode root) {
        int[] cnt=new int[1];
        count(root,root.val,cnt);
        return cnt[0];
    }
}
