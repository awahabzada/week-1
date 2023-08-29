package trees;

public class BinarySearchTree<T extends Comparable<T>> {
  private int elementCount;
  private BinarySearchTreeNode<T> root;

  public BinarySearchTree() {
    this.elementCount = 0;
    this.root = null;
  }

  public int count() {
    return this.elementCount;
  }

  public void insert(T value) {
    if (this.root == null) {
      this.root = new BinarySearchTreeNode<T>(value);
    } else {
      this.root.insert(value);
    }

    this.elementCount++;
  }

  public boolean find(T testValue) {
    return this.root != null && this.root.find(testValue);
  }

}
