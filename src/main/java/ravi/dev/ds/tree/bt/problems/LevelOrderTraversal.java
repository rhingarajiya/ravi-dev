package ravi.dev.ds.tree.bt.problems;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

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
      return Collections.emptyList();
    } else {
      Deque<List<TreeNode>> levelOrderBottomStack = new ArrayDeque<>();
      levelOrderBottomStack.push(Collections.singletonList(root));
      boolean isBottomLevel = false;
      while (!isBottomLevel) {
        List<TreeNode> childTreeNodes = getChildNodes(levelOrderBottomStack.peek());
        if (childTreeNodes.isEmpty()) {
          isBottomLevel = true;
        } else {
          levelOrderBottomStack.push(childTreeNodes);
        }
      }

      List<List<Integer>> levelOrderBottom = new ArrayList<>();
      while (!levelOrderBottomStack.isEmpty()) {
        List<Integer> currentLevel = new ArrayList<>();
        List<TreeNode> treeNodes = levelOrderBottomStack.pop();
        for (TreeNode treeNode : treeNodes) {
          currentLevel.add(treeNode.val);
        }
        levelOrderBottom.add(currentLevel);
      }
      return levelOrderBottom;
    }
  }

  private List<TreeNode> getChildNodes(List<TreeNode> currentLevel) {
    List<TreeNode> currentChildLevel = new ArrayList<>();
    if (currentLevel != null) {
      for (TreeNode treeNode : currentLevel) {
        if (treeNode.left != null) {
          currentChildLevel.add(treeNode.left);
        }
        if (treeNode.right != null) {
          currentChildLevel.add(treeNode.right);
        }
      }
    }
    return currentChildLevel;
  }
}

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
}


