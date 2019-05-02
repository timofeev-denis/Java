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
            new RomanNumber("M", 1000),
    };

    /**
     * Converts integer [1, 3999] to Roman notation
     * Argument must be within 9 and 3999.
     *
     * @param x Number to convert
     * @return Value of argument in Roman notation
     */
    public String convert(Integer x) {
        assertValidArgument(x);
        StringBuilder result = new StringBuilder();
        int digit = romanNumbers.length - 1;
        while (x > 0 && digit >= 0) {
            double divisionRemainder = (double) x / romanNumbers[digit].getNumber();

            // 4, 40, 400
            if (5 > divisionRemainder && divisionRemainder >= 4) {
                result.append(romanNumbers[digit].getRomanChar());
                result.append(romanNumbers[digit + 1].getRomanChar());
                x -= romanNumbers[digit].getNumber() * 4;
            }

            // 9, 90, 900
            if (2 > divisionRemainder && divisionRemainder >= 1.8) {
                result.append(romanNumbers[digit - 1].getRomanChar());
                result.append(romanNumbers[digit + 1].getRomanChar());
                x -= romanNumbers[digit + 1].getNumber() - romanNumbers[digit - 1].getNumber();
            }

            while (x / romanNumbers[digit].getNumber() >= 1) {
                result.append(romanNumbers[digit].getRomanChar());
                x -= romanNumbers[digit].getNumber();
            }

            digit--;
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
