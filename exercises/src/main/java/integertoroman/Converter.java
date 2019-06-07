package integertoroman;

/**
 * Created by: Denis Timofeev
 * Date: 02.05.2019
 * <p>
 * Converts integer [1, 3999] to Roman notation
 */
public class Converter {

    private static RomanNumber[] romanNumbers = new RomanNumber[]{
            new RomanNumber("I", 1),
            new RomanNumber("V", 5),
            new RomanNumber("X", 10),
            new RomanNumber("L", 50),
            new RomanNumber("C", 100),
            new RomanNumber("D", 500),
            new RomanNumber("M", 1000)
    };

    /**
     * Converts integer [1, 3999] to Roman notation
     * Argument must be within 9 and 3999.
     *
     * @param num Number to convert
     * @return Value of argument in Roman notation
     */
    public String convert(Integer num) {
        assertValidArgument(num);
        StringBuilder result = new StringBuilder();
        int digit = romanNumbers.length - 1;
        while (num > 0 && digit >= 0) {
            if (num / romanNumbers[digit].getNumber() == 0) {
                digit--;
                continue;
            }
            if (num.toString().startsWith("4")) {
                result.append(romanNumbers[digit].getRomanChar());
                result.append(romanNumbers[digit + 1].getRomanChar());
                num -= romanNumbers[digit].getNumber() * 4;
                continue;
            }
            if (num.toString().startsWith("9")) {
                result.append(romanNumbers[digit - 1].getRomanChar());
                result.append(romanNumbers[digit + 1].getRomanChar());
                num -= romanNumbers[digit - 1].getNumber() * 9;
                continue;
            }
            result.append(romanNumbers[digit].getRomanChar());
            num -= romanNumbers[digit].getNumber();
        }
        return result.toString();
    }

    /**
     * Checks if number is within 0 and 3999
     *
     * @param x Number to check
     */
    private void assertValidArgument(Integer x) {
        if (x < 0 || x > 3999) {
            throw new IllegalArgumentException("Converted number must be within [0, 3999]");
        }
    }

}
