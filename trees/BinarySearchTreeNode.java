package trees;

public class BinarySearchTreeNode<T extends Comparable<T>> {
  private T value;
  private BinarySearchTreeNode<T> left, right;

  public BinarySearchTreeNode(T value) {
    this.value = value;

    this.left = null;
    this.right = null;
  }

  public T getValue() {
    return this.value;
  }

  public BinarySearchTreeNode<T> getLeft() {
    return this.left;
  }

  public BinarySearchTreeNode<T> getRight() {
    return this.right;
  }

  public void setLeft(BinarySearchTreeNode<T> node) {
    this.left = node;
  }

  public void setRight(BinarySearchTreeNode<T> node) {
    this.right = node;
  }

  public void insert(T value) {
    if (value.compareTo(this.getValue()) < 0) {
      if (this.left == null) {
        this.left = new BinarySearchTreeNode<T>(value);
      } else {
        this.left.insert(value);
      }
    } else if (value.compareTo(this.getValue()) > 0) {
      if (this.right == null) {
        this.right = new BinarySearchTreeNode<T>(value);
      } else {
        this.right.insert(value);
      }
    }
  }

  public boolean find(T value) {
    if (value.compareTo(this.getValue()) == 0) {
      return true;
    } else if (value.compareTo(this.getValue()) < 0) {
      return this.getLeft() != null && this.getLeft().find(value);
    } else {
      return this.getRight() != null && this.getRight().find(value);
    }
  }
}
