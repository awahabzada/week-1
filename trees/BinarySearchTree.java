package trees;

public class BinarySearchTree {
  private int elementCount;
  private BinaryNode root;

  public BinarySearchTree() {
    this.elementCount = 0;
    this.root = null;
  }

  public void insert(int value) {
    if (this.root == null) {
      this.root = new BinaryNode(value);
    } else if (value < this.root.getValue()) {
      if (this.root.getLeft() == null) {
        this.root.setLeft(
            new BinaryNode(value));
      } else {
        this.root.getLeft().insert(value);
      }
    } else { // > root node
      if (this.root.getRight() == null) {
        this.root.setRight(
            new BinaryNode(value));
      } else {
        this.root.getRight().insert(value);
      }
    }

    this.elementCount++;
  }

  public int count() {
    return this.elementCount;
  }

  public boolean find(int valueToFind) {
    return this.find(this.root, valueToFind);
  }

  private boolean find(BinaryNode node, int valueToFind) {
    if (node.getValue() == valueToFind) {
      return true;
    } else if (valueToFind < node.getValue()) {
      return node.getLeft() != null && this.find(node.getLeft(), valueToFind);
    } else {
      return node.getRight() != null && this.find(node.getRight(), valueToFind);
    }
  }
}
