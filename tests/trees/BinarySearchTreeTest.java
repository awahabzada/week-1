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
  public void testCount42() {
    BinarySearchTree tree = new BinarySearchTree();

    int expected = 42;

    for (int index = 0; index < expected; index++) {
      tree.insert(index);
    }

    assertEquals(expected, tree.count());
  }

  @Test
  public void testFindWithInsertedValue() {
    BinarySearchTree tree = new BinarySearchTree();

    int testValue = 42;
    tree.insert(testValue);

    assertTrue(tree.find(testValue));
  }

  @Test
  public void testFindWithNonexistentValue() {
    BinarySearchTree tree = new BinarySearchTree();

    assertFalse(tree.find(42));
  }

  @Test
  public void testFindWithManyInsertions() {
    BinarySearchTree tree = new BinarySearchTree();

    int valueThatExists = 0;

    for (int index = 0; index < 20; index++) {
      valueThatExists = (int) Math.floor(Math.random() * 100);
      tree.insert(valueThatExists);
    }

    assertTrue(tree.find(valueThatExists));
  }
}