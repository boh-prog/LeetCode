/**
Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.

 

Example 1:

Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:

Example 2:

Input: nums = [1,3]
Output: [3,1]
Explanation: [1,3] and [3,1] are both a height-balanced BSTs.

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
    
    //the algorithm does a binary-search-like traversal on the  array to obtain the correct value for every node
    
    //first, create helper function for creating bST
    public TreeNode createTree(int[] nums, int start, int end)
    {
        //passed the end of array
        if(end < start) return null;
        
        int mid = start + (end-start)/2;
        TreeNode root = new TreeNode(nums[mid]); 
        
        //take the left slice of array and create left subtree
        root.left = createTree(nums, start, mid-1);
        //take right slice of array and create right subtree
        root.right = createTree(nums, mid+1, end);
        
        return root;
    }
    
    public TreeNode sortedArrayToBST(int[] nums) 
    {
        //create subTree and return root node
        return createTree(nums, 0, nums.length-1);
    }
    
}
