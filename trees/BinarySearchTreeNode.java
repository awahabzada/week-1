package trees;

public class BinarySearchTreeNode {
  private int value;
  private BinarySearchTreeNode left, right;

  public BinarySearchTreeNode(int value) {
    this.value = value;
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
    if (value < this.value) {
      if (this.left != null) {
        this.left.insert(value);
      } else {
        this.left = new BinarySearchTreeNode(value);
      }
    } else {
      if (this.right != null) {
        this.right.insert(value);
      } else {
        this.right = new BinarySearchTreeNode(value);
      }
    }
  }

  public boolean find(int testValue) {
    if (testValue == this.value) {
      return true;
    } else if (testValue < this.value && this.left != null) {
      return this.left.find(testValue);
    } else if (this.right != null) {
      return this.right.find(testValue);
    } else {
      return false;
    }
  }
}
