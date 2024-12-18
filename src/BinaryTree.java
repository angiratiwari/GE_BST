public class BinaryTree<T extends Comparable<T>> {
    private INode<T> root;

    public BinaryTree() {
        root = null;
    }

    // UC 1: Insert method to add nodes
    public void insert(T key) {
        root = insertRec(root, key);
    }

    private INode<T> insertRec(INode<T> root, T key) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new MyBinaryNode<>(key);
            return root;
        }

        // Otherwise, recur down the tree
        if (key.compareTo(root.getKey()) < 0) {
            root.setLeft(insertRec(root.getLeft(), key));
        } else if (key.compareTo(root.getKey()) > 0) {
            root.setRight(insertRec(root.getRight(), key));
        }

        return root;
    }

}
