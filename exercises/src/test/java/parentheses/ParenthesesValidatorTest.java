package parentheses;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by: Denis Timofeev
 * Date: 27.04.2019
 */
@DisplayName("Проверка валидатора строк из скобок")
class ParenthesesValidatorTest {

    private ParenthesesValidator validator;

    @BeforeEach
    void setUp() {
        this.validator = new ParenthesesValidator();
    }

    @Test
    @DisplayName("Пустая строка валидна")
    void emptyStringTest() {
        assertTrue(validator.isValid(""));
    }

    @Test
    @DisplayName("Парные скобки валидны")
    void twoMatchingBracesTest() {
        assertTrue(validator.isValid("()"));
    }

    @Test
    @DisplayName("Вложенные скобки валидны")
    void nestedBracesTest() {
        assertTrue(validator.isValid("([])"));
    }

    @Test
    @DisplayName("Одинаковые вложенные скобки валидны")
    void sameNestedBracesTest() {
        assertTrue(validator.isValid("(())"));
    }

    @Test
    @DisplayName("Дважды вложенные скобки валидны")
    void doubleNestedBracesTest() {
        assertTrue(validator.isValid("{([])}"));
    }

    @Test
    @DisplayName("Одна открывающая скобка не валидна")
    void singleOpenBraceTest() {
        assertFalse(validator.isValid("{"));
    }

    @Test
    @DisplayName("Одна закрывающая скобка не валидна")
    void singleCloseBraceTest() {
        assertFalse(validator.isValid("{"));
    }

    @Test
    @DisplayName("Несовпадающая закрывающая скобка не валидна")
    void mismatchBracesTest() {
        assertFalse(validator.isValid("{]"));
    }

    @Test
    @DisplayName("Две открывающие скобки не валидны")
    void twoOpenBracesTest() {
        assertFalse(validator.isValid("{{"));
    }
}