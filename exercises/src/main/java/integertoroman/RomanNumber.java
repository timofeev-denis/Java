package integertoroman;

/**
 * Created by: Denis Timofeev
 * Date: 02.05.2019
 */
class RomanNumber {
    private String romanChar;
    private Integer number;

    RomanNumber(String romanChar, Integer number) {
        this.romanChar = romanChar;
        this.number = number;
    }

    String getRomanChar() {
        return romanChar;
    }

    Integer getNumber() {
        return number;
    }
}
