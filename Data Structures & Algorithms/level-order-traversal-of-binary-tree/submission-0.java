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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> al= new ArrayList<>();
         Queue<TreeNode> q=new LinkedList<>();
         if(root==null){
            return al;
          }
         q.add(root);
         //al.add(new ArrayList(root.val));
         while(q.isEmpty()==false){            
            ArrayList<Integer> res = new ArrayList<>();
            int j=q.size();
            for(int i=0;i<j;i++){
                TreeNode curr = q.poll();
                res.add(curr.val);
                if(curr.left!=null)
                q.add(curr.left);
                if(curr.right!=null)
                q.add(curr.right);
            }    
            al.add(new ArrayList(res));                    
        }
        return al;
    }
}
