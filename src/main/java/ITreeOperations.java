import java.util.ArrayList;
import java.util.List;

public interface ITreeOperations {

    default int sumFromSubtree(Node node){
        if (node == null) {
            return 0;
        }
        return (node.getValue()
                + sumFromSubtree(node.getLeftChild())
                + sumFromSubtree(node.getRightChild()));
    }

    default double nodeCounter(Node node) {
        if (node == null) {
            return 0;
        }
        return (1
                + nodeCounter(node.getLeftChild())
                + nodeCounter(node.getRightChild()));
    }

    default double averageValue(Node node){
        if(node==null){
            return 0;
        }
        return sumFromSubtree(node)/nodeCounter(node);
    }

    default double medianValue(Node node){
        List<Integer> listOfNodes = new ArrayList<>();
        getAllValues(node, listOfNodes);
        listOfNodes.sort(Integer::compareTo);
        if(listOfNodes.size()%2==1)
            return listOfNodes.get(listOfNodes.size()/2);
        else
            return ((listOfNodes.get(listOfNodes.size()/2)
                +listOfNodes.get(listOfNodes.size()/2-1))/2.0);
    }

    default void getAllValues(Node node, List<Integer> list){
        if (node == null) {
            return;
        }
        getAllValues(node.getLeftChild(), list);
        list.add(node.getValue());
        getAllValues(node.getRightChild(), list);
    }
}
