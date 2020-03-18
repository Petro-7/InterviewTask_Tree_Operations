import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tree myStructure = new Tree(new Node(null, 5));
        myStructure.getRoot().setLeftChild(new Node(2, 5, 3));
        myStructure.getRoot().setRightChild(new Node(7));

        Node exampleNode = new Node(0);
        exampleNode.setLeftChild(new Node(2));
        exampleNode.setRightChild(new Node(8));
        exampleNode.getRightChild().setRightChild(new Node(5));

        myStructure.getRoot().getRightChild().setLeftChild(new Node(1));
        myStructure.getRoot().getRightChild().setRightChild(exampleNode);


        int subtreeSum = myStructure.sumFromSubtree(exampleNode);
        System.out.println("subtreeSum = " + subtreeSum);

        double averageValue = myStructure.averageValue(myStructure.getRoot());
        System.out.println("averageValue = " + averageValue);

        double medianValue = myStructure.medianValue(myStructure.getRoot());
        System.out.println("medianValue = " + medianValue);
    }
}
