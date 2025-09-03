// Last updated: 9/3/2025, 9:24:32 PM
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
    public boolean isSymmetric(TreeNode root) {
        return symmetric(root.left,root.right);
    }
    public boolean symmetric(TreeNode r1,TreeNode r2){
        if(r1==null&&r2==null){
            return true;
        }
        if(r1==null||r2==null){
            return false;
        }
        if(r1.val!=r2.val){
            return false;
        }
        boolean left = symmetric(r1.left,r2.right);
        boolean right = symmetric(r1.right,r2.left);
        return left&&right;
    }
        
}