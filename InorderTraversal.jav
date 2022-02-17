
/**
Given the root of a binary tree, return the inorder traversal of its nodes' values.

 

Example 1:

Input: root = [1,null,2,3]
Output: [1,3,2]

Example 2:

Input: root = []
Output: []

Example 3:

Input: root = [1]
Output: [1]

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
    //instantiate class variable of visited nodes
    public static List<Integer> visited = new ArrayList<Integer>();

    public List<Integer> inorderTraversal(TreeNode root) 
    {
        
        visited = new ArrayList<Integer>();
        //traverse tree
        traverse(root);
        
        return visited;
    }
    
    public static void traverse(TreeNode node)
    {
        //return null if current node is null
        if(node == null) return;
        //traverse the left subtree
        if(node.left != null)
        {
            traverse(node.left);
        }
        //add value of current node in list of visited
        visited.add(node.val);
        
        //move to right subtree and traverse in the same way
        if(node.right != null)
        {
            traverse(node.right);
        }
    }
}
