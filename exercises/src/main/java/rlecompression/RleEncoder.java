package rlecompression;

/**
 * RLE-кодировщик
 * <p>
 * AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB -> A4B3C2XYZD4E3F3A6B28
 */
public class RleEncoder {

    private static final String[] INVALID_CHARS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    /**
     * Возвращает строку, закодированную методом RLE
     *
     * @param original Любые символы кроме цифр
     * @return Закодированная строка
     */
    public static String encode(String original) {
        assertValidString(original);
        if (original.equals("")) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        char currentChar = original.charAt(0);
        Integer charCount = 0;
        for (char c : original.toCharArray()) {
            if (currentChar == c) {
                charCount++;
            } else {
                result.append(getCompressedValue(currentChar, charCount));
                charCount = 1;
                currentChar = c;
            }
        }
        result.append(getCompressedValue(currentChar, charCount));

        return result.toString();
    }

    public static String getCompressedValue(char c, Integer charCount) {
        return c + (charCount > 1 ? charCount.toString() : "");
    }

    protected static void assertValidString(String original) {
        if (original == null) {
            throw new IllegalArgumentException("Строка не может быть null");
        }
        for (String invalidChar : INVALID_CHARS) {
            if (original.contains(invalidChar)) {
                throw new IllegalArgumentException("Строка не должна содержать невалидные символы");
            }
        }
    }

}
