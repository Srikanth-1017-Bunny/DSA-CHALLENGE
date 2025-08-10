 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }

        int lf=maxDepth(root.left);
        int rh=maxDepth(root.right);
        int max=Math.max(lf,rh)+1;
        return max;
        
    }
}