/**
Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

 

Example 1:

Input: p = [1,2,3], q = [1,2,3]
Output: true

Example 2:

Input: p = [1,2], q = [1,null,2]
Output: false

Example 3:

Input: p = [1,2,1], q = [1,1,2]
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
class Solution 
{
    
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
        result &= isSameTree(p.left, q.left);
        result &= isSameTree(p.right, q.right);
       
        return result;
    }
    
}
