class Solution {
    
    public boolean hasPathSum(TreeNode root, int targetSum) {        
        
        if(root == null) return false;
        
        if(root.val == targetSum && root.right == null && root.left == null) return true;
        
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}