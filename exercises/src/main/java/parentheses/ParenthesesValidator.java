package parentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by: Denis Timofeev
 * Date: 27.04.2019
 */
class ParenthesesValidator {

    private static Map<String, String> pairs = new HashMap<>();
    private Stack<String> stack;

    ParenthesesValidator() {
        stack = new Stack<>();
        pairs.put(")", "(");
        pairs.put("]", "[");
        pairs.put("}", "{");
    }

    boolean isValid(String s) {
        if (s.length() == 0) {
            return true;
        }
        int i = 0;
        while (i <= s.length() - 1) {
            String currentChar = s.substring(i, i + 1);
            String matchingOpenBrace = pairs.get(currentChar);

            if (matchingOpenBrace == null) {
                stack.push(currentChar);
                i++;
                continue;
            }

            if (stack.empty()) {
                return false;
            }

            if (!stack.pop().equals(matchingOpenBrace)) {
                return false;
            }
            i++;
        }
        return stack.empty();
    }

}
