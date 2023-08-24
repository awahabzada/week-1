package trees;

public class BinarySearchTreeNode {
  private int value;
  private BinarySearchTreeNode left, right;

  public BinarySearchTreeNode(int value) {
    this.value = value;

    this.left = null;
    this.right = null;
  }

  public int getValue() {
    return this.value;
  }

  public BinarySearchTreeNode getLeft() {
    return this.left;
  }

  public BinarySearchTreeNode getRight() {
    return this.right;
  }

  public void setLeft(BinarySearchTreeNode node) {
    this.left = node;
  }

  public void setRight(BinarySearchTreeNode node) {
    this.right = node;
  }

  public void insert(int value) {
    if (value < this.getValue()) {
      if (this.left == null) {
        this.left = new BinarySearchTreeNode(value);
      } else {
        this.left.insert(value);
      }
    } else if (value > this.getValue()) {
      if (this.right == null) {
        this.right = new BinarySearchTreeNode(value);
      } else {
        this.right.insert(value);
      }
    }
  }

  public boolean find(int value) {
    if (this.getValue() == value) {
      return true;
    } else if (value < this.getValue()) {
      return this.getLeft() != null && this.getLeft().find(value);
    } else {
      return this.getRight() != null && this.getRight().find(value);
    }
  }
}
