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
    public boolean isValidBST(TreeNode root) {
       ArrayList<Integer> al = new ArrayList<>();
       Inorder(root,al);
        for(int i=1;i<al.size();i++){
            if(al.get(i-1)>=al.get(i)){
                return false;
            }
        }
        return true;
    }
    public void Inorder(TreeNode root,ArrayList<Integer>al){
        if(root==null)return;
        Inorder(root.left,al);
        al.add(root.val);
        Inorder(root.right,al);
    }
}
