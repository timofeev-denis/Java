package parentheses;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by: Denis Timofeev
 * Date: 09.05.2019
 */
class ParenthesesSequenceTest {

    @Test
    void zeroTest() {
        Set<String> sequences = ParenthesesSequence.getValidSequences(0);
        assertTrue(sequences.isEmpty());
    }

    @Test
    void oneTest() {
        Set<String> sequences = ParenthesesSequence.getValidSequences(1);
        assertEquals(1, sequences.size());
        assertTrue(sequences.contains("()"));
    }

    @Test
    void twoTest() {
        Set<String> sequences = ParenthesesSequence.getValidSequences(2);
        assertEquals(2, sequences.size());
        assertTrue(sequences.containsAll(Arrays.asList("(())", "()()")));

    }

    @Test
    void threeTest() {
        Set<String> sequences = ParenthesesSequence.getValidSequences(3);
        assertEquals(5, sequences.size());
        assertTrue(sequences.containsAll(Arrays.asList("((()))", "()()()", "(()())", "()(())", "(())()")));
    }

    @Test
    void correctLengthTest() {
        Set<String> sequences = ParenthesesSequence.getValidSequences(10);
        sequences.forEach(s -> assertEquals(20, s.length()));
    }
}
