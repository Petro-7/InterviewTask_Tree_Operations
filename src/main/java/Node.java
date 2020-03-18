public class Node {
    private Node parent;
    private Node leftChild;
    private Node rightChild;
    private int value;

    public Node(int leftChildValue, int rightChildValue, int value) {
        this.leftChild = new Node(leftChildValue);
        this.rightChild = new Node(rightChildValue);
        this.value = value;
    }

    public Node(Node parent, int value) {
        this.parent = parent;
        this.value = value;
    }

    public Node(int value) {
        this.value = value;
    }


    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
        leftChild.parent=this;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
        rightChild.parent=this;
    }

    public int getValue() {
        return value;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
