import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ITreeOperationsTest {


    @ParameterizedTest
    @CsvSource({ "0, 3, 9, 12", "-5, -3, -1, -9"})
    void sumFromSubtree(int lValue, int rValue, int cValue, int expected) {
        Tree tree = new Tree(new Node(lValue, rValue, cValue));
        assertEquals(expected, tree.sumFromSubtree(tree.getRoot()));
    }

    @ParameterizedTest
    @CsvSource({ "0, 3, 9, 3"})
    void nodeCounter(int lValue, int rValue, int cValue, int expected) {
        Tree tree = new Tree(new Node(lValue, rValue, cValue));
        assertEquals(expected, tree.nodeCounter(tree.getRoot()));
    }

    @ParameterizedTest
    @CsvSource({ "0, 3, 9, 4", "-5, -3, -1, -3"})
    void averageValue(int lValue, int rValue, int cValue, int expected) {
        Tree tree = new Tree(new Node(lValue, rValue, cValue));
        assertEquals(expected, tree.averageValue(tree.getRoot()));
    }

    @ParameterizedTest
    @CsvSource({ "0, 3, 9, 3", "-5, -3, -1, -3"})
    void medianValue(int lValue, int rValue, int cValue, int expected) {
        Tree tree = new Tree(new Node(lValue, rValue, cValue));
        assertEquals(expected, tree.medianValue(tree.getRoot()));
    }
}
