import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    @DisplayName("add commas to long number")
    void canAddCommasToLongNumber() {
        String rawNumber = "12345678";
        assertEquals(Main.addCommas(rawNumber), "12,345,678");
    }

    @Test
    @DisplayName("Can add commas to medium number")
    void canAddCommasToMediumNumber() {
        String rawNumber = "345678";
        assertEquals(Main.addCommas(rawNumber), "345,678");
    }

    @Test
    @DisplayName("Can add commas to various different numbers")
    void canAddCommas() {
        assertAll(
                () -> assertEquals(Main.addCommas(""), ""),
                () -> assertEquals(Main.addCommas("1"), "1"),
                () -> assertEquals(Main.addCommas("12"), "12"),
                () -> assertEquals(Main.addCommas("123"), "123")
        );
    }

}