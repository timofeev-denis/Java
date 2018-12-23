package stringinvertor;

class StringInvertor {

    /**
     * Inverts string
     *
     * @param original String to invert
     * @return Inverted string
     */
    static String invert(String original) {
        StringBuilder result = new StringBuilder();
        for(char c : original.toCharArray()) {
            result.insert(0, c);
        }
        return result.toString();
    }

}
