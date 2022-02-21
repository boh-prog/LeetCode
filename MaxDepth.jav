/**
Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

 

Example 1:

Input: root = [3,9,20,null,null,15,7]
Output: 3

Example 2:

Input: root = [1,null,2]
Output: 2

/




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
    
    public int maxDepth(TreeNode root) 
    {
        //depth is zero for an empty root node
        if(root == null)
        {
            return 0;
        }
        
        //root node is not null but has no left and right subTree, depth is 1
        if(root.right == null && root.left == null)
        {
            return 1;
        }
        
        //left and right subTree are not null
        //get depth of left and right subTree
        int left = maxDepth(root.left) + 1; //plus 1 for every level into subTree
        int right = maxDepth(root.right) + 1;
        
        //return subTree of longest path
        return Math.max(left, right);
    }
 
}
