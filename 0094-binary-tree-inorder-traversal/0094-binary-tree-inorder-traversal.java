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
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode temp = root;
        List<Integer> ls = new ArrayList<>();
        inorder(temp, ls);
        return ls;
    }
    private void inorder(TreeNode temp, List<Integer> ls){
        if(temp == null) return;
        inorder(temp.left, ls);
        ls.add(temp.val);
        inorder(temp.right, ls);
    }
}