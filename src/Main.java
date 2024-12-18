public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();

        // UC 1: Insert 56, 30, 70 into the tree
        tree.insert(56);
        tree.insert(30);
        tree.insert(70);

        // UC 2: Check the size of the tree
        System.out.println("Size of the tree: " + tree.size()); // Should print 3
    }
}