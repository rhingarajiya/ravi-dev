package ravi.dev.ds.tree.bt.problems;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LevelOrderTraversalTest {

  @Test
  public void testLevelOrderTraversalTest() {
    TreeNode rootTreeNode = new TreeNode(10);

    rootTreeNode.left = new TreeNode(6);
    rootTreeNode.right = new TreeNode(20);

    rootTreeNode.left.left = new TreeNode(5);
    rootTreeNode.left.right = new TreeNode(12);
    rootTreeNode.right.left = new TreeNode(15);
    rootTreeNode.right.right = new TreeNode(25);

    LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
    List<List<Integer>> result = levelOrderTraversal.levelOrderBottom(rootTreeNode);

    assertEquals(Arrays.asList(5, 12, 15, 25), result.get(0));
    assertEquals(Arrays.asList(6, 20), result.get(1));
    assertEquals(Collections.singletonList(10), result.get(2));
  }


  @Test
  public void testLevelOrderTraversalTest2() {
    TreeNode rootTreeNode = new TreeNode(10);

    rootTreeNode.left = new TreeNode(6);
    rootTreeNode.right = new TreeNode(20);

    rootTreeNode.left.left = new TreeNode(5);
    rootTreeNode.right.left = new TreeNode(15);

    LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
    List<List<Integer>> result = levelOrderTraversal.levelOrderBottom(rootTreeNode);

    assertEquals(Arrays.asList(5, 15), result.get(0));
    assertEquals(Arrays.asList(6, 20), result.get(1));
    assertEquals(Collections.singletonList(10), result.get(2));
  }

  @Test
  public void testLevelOrderTraversalTest3() {
    TreeNode rootTreeNode = new TreeNode(10);

    rootTreeNode.left = new TreeNode(6);

    rootTreeNode.left.left = new TreeNode(5);
    rootTreeNode.left.right = new TreeNode(12);

    LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
    List<List<Integer>> result = levelOrderTraversal.levelOrderBottom(rootTreeNode);

    assertEquals(Arrays.asList(5, 12), result.get(0));
    assertEquals(Collections.singletonList(6), result.get(1));
    assertEquals(Collections.singletonList(10), result.get(2));
  }

  @Test
  public void testLevelOrderTraversalTestWithNullRootNode() {
    LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
    assertTrue(levelOrderTraversal.levelOrderBottom(null).isEmpty());
  }

}