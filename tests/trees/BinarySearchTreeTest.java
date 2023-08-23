package tests.trees;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import trees.BinarySearchTree;

public class BinarySearchTreeTest {
  @Test
  public void testExistence() {
    BinarySearchTree tree = new BinarySearchTree();
  }

  @Test
  public void testCount42() {
    BinarySearchTree tree = new BinarySearchTree();
    int number = 42;

    for (int index = 0; index < number; index++) {
      tree.insert(index);
    }

    assertEquals(number, tree.count());
  }

  @Test
  public void testCount5() {
    BinarySearchTree tree = new BinarySearchTree();
    int number = 5;

    for (int index = 0; index < number; index++) {
      tree.insert(index);
    }

    assertEquals(number, tree.count());
  }

  @Test
  public void testFind() {
    BinarySearchTree tree = new BinarySearchTree();
    int number = 42;

    tree.insert(number);

    assertTrue(tree.find(number));
    assertFalse(tree.find(number - 10));
  }
}
