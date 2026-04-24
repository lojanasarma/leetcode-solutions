package Minimum_Depth_of_Binary_Tree_Q111_Easy;
/**
 * The key difference between **maximum depth** and **minimum depth** of a binary tree
 * comes from how they treat missing branches. For maximum depth, the goal is to find
 * the longest path from the root to any leaf, so we simply take `1 + max(leftDepth, rightDepth)`.
 * If one child is null, it doesn’t matter because we are looking for the longest possible route,
 * and a missing branch just contributes zero depth. This makes the recursion straightforward
 * since `Math.max` naturally ignores shorter or absent paths.
 *
 * However, minimum depth is trickier because we are looking for the shortest path from the
 * root to a **leaf node**, not just any null node. A naive use of `Math.min(left, right)`
 * fails when one child is missing because it incorrectly treats a null branch as having
 * depth zero, which would falsely look like the shortest path. In reality, a null child
 * should not be considered a valid path unless both children exist.
 *
 * Therefore, in minimum depth, if one subtree is missing, we must ignore it and continue
 * down the other side. Only when both children exist do we safely take
 * `1 + min(leftDepth, rightDepth)`.
 *
 * This difference in handling nulls is the core thinking distinction: maximum depth is
 * flexible with missing paths, while minimum depth must strictly follow valid root-to-leaf
 * paths only.
 */
public class Solution {

    public int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        // If left child is null, we must go right
        if (root.left == null) {
            return 1 + minDepth(root.right);
        }

        // If right child is null, we must go left
        if (root.right == null) {
            return 1 + minDepth(root.left);
        }

        // If both children exist
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }

}
