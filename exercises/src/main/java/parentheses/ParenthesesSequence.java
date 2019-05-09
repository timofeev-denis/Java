package parentheses;

import java.util.HashSet;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

/**
 * Find all possible valid parentheses sequences
 * <p>
 * Created by: Denis Timofeev
 * Date: 09.05.2019
 */
class ParenthesesSequence {

    /**
     * Returns a list of valid parentheses sequences
     *
     * @param num A number
     * @return List of all possible valid parentheses sequences with length of num x 2
     */
    static Set<String> getValidSequences(int num) {
        Set<String> result = new HashSet<>();
        if (num == 0) {
            return result;
        }
        result.add(embrace(""));
        result.add(left(""));
        result.add(right(""));

        for (int i = 1; i < num; i++) {
            Set<String> stepResults = new HashSet<>();
            result.forEach(s -> {
                stepResults.add(embrace(s));
                stepResults.add(left(s));
                stepResults.add(right(s));
            });
            result.addAll(stepResults);
        }

        return result.stream()
                .filter(s -> s.length() == num * 2)
                .collect(toSet());
    }

    private static String embrace(String s) {
        return "(" + s + ")";
    }

    private static String left(String s) {
        return "()" + s;
    }

    private static String right(String s) {
        return s + "()";
    }

}
