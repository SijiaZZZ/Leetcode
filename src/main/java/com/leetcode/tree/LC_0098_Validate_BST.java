/**
 * Created by Sijia on 2/24/22
 * Time Complexity:
 * <p>
 * Space Complexity:
 * <p>
 * Hints:  recursion 比max min 或者直接 inOrder 比较pre
 * <p> 1.
 * <p> 2.
 * <p> 3.
 */

package com.leetcode.tree;

import com.leetcode.util.TreeNode;

public class LC_0098_Validate_BST {

    private Integer pre;
    public boolean isValidBST(TreeNode root) {
        pre = null;
        return inOrder(root);

    }

    private boolean inOrder(TreeNode node) {
        if (node == null) return true;

        if (!inOrder(node.left)) return false;
        if (pre != null && node.val <= pre) {
            return false;
        }
        pre = node.val;
        return inOrder(node.right);

    }
}
