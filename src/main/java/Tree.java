public class Tree implements ITreeOperations {
    private Node root;

    public Tree(Node node) {
        root = node;
    }


    public Node getRoot() {
        return root;
    }
}
