package trees;

public class BinarySearchTree {
  private int elementCount;
  private BinarySearchTreeNode root;

  public BinarySearchTree() {
    this.root = null;
    this.elementCount = 0;
  }

  public int count() {
    return this.elementCount;
  }

  public void insert(int value) {
    if (root == null) {
      this.root = new BinarySearchTreeNode(value);
    } else {
      this.root.insert(value);
    }

    this.elementCount++;
  }

  public boolean find(int testValue) {
    return this.root != null && this.root.find(testValue);
  }
}
