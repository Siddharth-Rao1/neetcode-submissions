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

public class Codec {
    int index=0;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder str = new StringBuilder();
        inorder(root,str);
        return str.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] st = data.split(",");
        return deserial(st);
    }
    public TreeNode deserial(String[] st){   
        if(st[index].equals("#")){
           index++; return null;     
        }    
        TreeNode temp = new TreeNode(Integer.parseInt(st[index]));
        index++;
        temp.left =deserial(st);
        temp.right=deserial(st);
        return temp;
    }
    public void inorder(TreeNode root,StringBuilder str){
        if(root==null){
            str.append("#,");return;
        }
        str.append(root.val).append(",");
        inorder(root.left,str);
        inorder(root.right,str);       
    }
}
