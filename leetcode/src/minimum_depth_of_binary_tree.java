import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for binary tree
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

//public class Solution {
//    public int run(TreeNode root) {
//        if (root == null)
//            return 0;
//        if (root.left == null && root.right == null)
//            return 1;
//
//        int depth = 0;
//        Queue<TreeNode> queue = new LinkedList<>();
//        return 0;
//    }
//}