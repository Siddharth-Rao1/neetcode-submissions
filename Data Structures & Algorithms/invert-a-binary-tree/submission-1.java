class Solution {
    public TreeNode invertTree(TreeNode root) {
        return invert(root);
    }
    public TreeNode invert(TreeNode root){
        if(root==null)return null;
        TreeNode curr=root.left;
        root.left=invert(root.right);
        root.right=invert(curr);
        return root;
    }
}