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
    ArrayList<Integer> q=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
       inorder(root,0);
        return q;
    }
    public void inorder(TreeNode root,int level){
        if(root==null)return;        
        if(level==q.size()){
            q.add(root.val);
        }
        inorder(root.right,level+1);   
        inorder(root.left,level+1);  
    }
}
