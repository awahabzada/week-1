package tests.trees;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import trees.BinarySearchTree;

public class BinarySearchTreeTest {
  @Test
  public void testExistence() {
    BinarySearchTree tree = new BinarySearchTree();
  }

  @Test
  public void testCountZero() {
    BinarySearchTree tree = new BinarySearchTree();

    int expected = 0;

    assertEquals(expected, tree.count());
  }

  @Test
  public void testCountWithItems() {
    BinarySearchTree tree = new BinarySearchTree();

    int expected = 42;

    for (int index = 0; index < expected; index++) {
      tree.insert(index);
    }

    assertEquals(expected, tree.count());
  }

  @Test
  public void testFind52() {
    BinarySearchTree tree = new BinarySearchTree();

    int testValue = 52;
    tree.insert(testValue);

    assertTrue(tree.find(testValue));
    assertFalse(tree.find(testValue - 10));
  }

  @Test
  public void testFind0() {
    BinarySearchTree tree = new BinarySearchTree();

    int testValue = 0;
    tree.insert(testValue);

    assertTrue(tree.find(testValue));
    assertFalse(tree.find(testValue - 10));
  }
}
