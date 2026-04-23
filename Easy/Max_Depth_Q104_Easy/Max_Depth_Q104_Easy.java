
package Max_Depth_Q104_Easy;

/*
Idea: Using Recursion (from DSA Java Y1S2 module)

To find the maximum depth of a binary tree:
- If the current node is null, the depth is 0 (base case).
- Otherwise, we calculate the depth of the left subtree.
- We also calculate the depth of the right subtree.
- We take the maximum of these two depths because the longest path defines the tree depth.
- Finally, we add 1 to include the current node.

This works because recursion breaks the tree into smaller subtrees,
solves each one, and combines the results while returning back up.
*/
//Definition for a binary tree node.

class Solution {
    public int maxDepth(TreeNode root) {

        int result = 0;

        if (root == null) {

            result = 0;

        } else {
            /*The function calculates the depth of a binary tree using recursion. If the current node is `null`, it returns 0 because an empty tree has no depth. Otherwise, it calculates the depth of the left and right subtrees by calling itself recursively on `root.left` and `root.right`. It then takes the larger of the two depths using `Math.max` and adds 1 for the current node. This process continues until it reaches the leaf nodes, and then the results are combined as the recursion returns back up to the root, giving the maximum depth of the tree.
             */
            result = 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

        }

        return result;

    }
}
