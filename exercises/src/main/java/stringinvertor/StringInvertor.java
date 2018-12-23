package stringinvertor;

class StringInvertor {

    /**
     * Inverts string
     *
     * @param original String to invertWithCharSwitching
     * @return Inverted string
     */
    static String invertWithCharSwitching(String original) {
        StringBuilder result = new StringBuilder(original);
        for (int i = 0; i <= original.length() / 2 - 1; i++) {
            result.setCharAt(i, original.charAt(original.length() - i - 1));
            result.setCharAt(original.length() - i - 1, original.charAt(i));
        }
        return result.toString();
    }

}
