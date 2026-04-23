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
    int ans = -1;
    int count;
    private void inorder(TreeNode root){
        if(root == null) return;
        if(count == 0) return;
        inorder(root.left);
        count--;
        if(count == 0) { 
            ans = root.val;
            return;
        }
        inorder(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        inorder(root);
        return ans;
    }
}