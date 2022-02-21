/**
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

 

Example 1:

Input: root = [1,2,2,3,4,4,3]
Output: true

Example 2:

Input: root = [1,2,2,null,3,null,3]
Output: false

*/
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
    public boolean isSymmetric(TreeNode root) 
    {
        if(root == null) return true;
        //assign left and right subtree to new variables
        TreeNode rightSub = root.right; TreeNode leftSub = root.left;
        //compare left and right subtree with isSameTree Method
        return isSameTree(rightSub, leftSub);
        
    }
    public boolean isSameTree(TreeNode p, TreeNode q)
   {
       //check if root trees are null
        if (p == null || q == null)
        {
            //compare and return result
            return p == q;
        }
        
       //compare valus at root node of tree and assign to boolean 'result'
        boolean result = p.val == q.val;

       //go into subtrees and perform the same comparisons.
        result = result & isSameTree(p.left, q.right);  // (isSameTree(p.left, q.left) 
        result = result &  isSameTree(p.right, q.left); //(isSameTree(p.right, q.right) ||

        return result;
    }
}
