给定一个二叉树，原地将它展开为一个单链表。

给定二叉树

    1
   / \
  2   5
 / \   \
3   4   6

将其展开为：

1
 \
  2
   \
    3
     \
      4
       \
        5
         \
          6

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

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
    private TreeNode pre;
    public void flatten(TreeNode root) {
        if(root==null) return;
        preorder(root);
    }
    private void preorder(TreeNode cur){
        if(cur==null) return;
        preorder(cur.right);
        preorder(cur.left);
        cur.right=pre;
        cur.left=null;
        pre=cur;
    }

}