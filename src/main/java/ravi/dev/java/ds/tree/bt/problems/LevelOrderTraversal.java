package ravi.dev.java.ds.tree.bt.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/*
https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
Problem: Given a binary tree, return the bottom-up level order traversal of its nodes' values.
(ie, from left to right, level by level from leaf to root).
Solution:
Use Stack of List<TreeNode> and first push the root node.
Initialize isBottomLevel flag = false
Loop isBottomLevel flag till true
Peek a List of TreeNode from stack
Add child nodes of the list of TreeNode to List
Set isBottomLevel flag true if the list of child nodes is empty
Otherwise push the list of child nodes

Finally covert Stack to List
*/
class LevelOrderTraversal {

  List<List<Integer>> levelOrderBottom(TreeNode root) {
    if (root == null) {
      return null;
    }
    Stack<List<TreeNode>> levelOrderBottomStack = new Stack<>();
    levelOrderBottomStack.push(Collections.singletonList(root));
    boolean isBottomLevel = false;
    while (!isBottomLevel) {
      List<TreeNode> currentLevel = levelOrderBottomStack.peek();
      List<TreeNode> currentChildLevel = new ArrayList<>();
      for (TreeNode treeNode : currentLevel) {
        if (treeNode.left != null) {
          currentChildLevel.add(treeNode.left);
        }
        if (treeNode.right != null) {
          currentChildLevel.add(treeNode.right);
        }
      }
      if (currentChildLevel.isEmpty()) {
        isBottomLevel = true;
      } else {
        levelOrderBottomStack.push(currentChildLevel);
      }
    }

    List<List<Integer>> levelOrderBottom = new ArrayList<>();
    while(!levelOrderBottomStack.isEmpty()) {
      List<Integer> currentLevel = new ArrayList<>();
      List<TreeNode> treeNodes = levelOrderBottomStack.pop();
      for (TreeNode treeNode: treeNodes) {
        currentLevel.add(treeNode.val);
      }
      levelOrderBottom.add(currentLevel);
    }
    return levelOrderBottom;
  }

}

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
}


