import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    @org.junit.jupiter.api.Test
    void getNullLeftChild() {
        final Node node = new Node(12);
        assertNull(node.getLeftChild());
    }

    @org.junit.jupiter.api.Test
    void getLeftChild() {
        final Node node = new Node(12);
        assertNull(node.getLeftChild());
    }

    @org.junit.jupiter.api.Test
    void setLeftChild() {
        final Node node = new Node(12);
        node.setLeftChild(new Node(44));
        assertEquals(44, node.getLeftChild().getValue());
    }

    @org.junit.jupiter.api.Test
    void getRightChild() {
        final Node node = new Node(4, 44, 12);
        assertEquals(44, node.getRightChild().getValue());
    }

    @org.junit.jupiter.api.Test
    void setRightChild() {
        final Node node = new Node(12);
        node.setRightChild(new Node(44));
        assertEquals(44, node.getRightChild().getValue());
    }

    @org.junit.jupiter.api.Test
    void getValue() {
        final Node node = new Node(12);
        assertEquals(12, node.getValue());
    }

    @ParameterizedTest
    @ValueSource(ints = {Integer.MIN_VALUE, -8, 0, 15, Integer.MAX_VALUE})
    void setValue(int number) {
        Node node = new Node(0);
        node.setValue(number);
        assertEquals(number, node.getValue());
    }
}
