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
    @DisplayName("Can add commas to short number")
    void canAddCommasToShortNumber() {
        String rawNumber = "123";
        assertEquals(Main.addCommas(rawNumber), rawNumber);
    }

    @Test
    @DisplayName("Can add commas to various different numbers")
    void canAddCommas() {
        assertAll(
                () -> assertEquals(Main.addCommas(""), ""),
                () -> assertEquals(Main.addCommas("1"), "1"),
                () -> assertEquals(Main.addCommas("12"), "12"),
                () -> assertEquals(Main.addCommas("123"), "123"),
                () -> assertEquals(Main.addCommas("1234"), "1,234"),
                () -> assertEquals(Main.addCommas("12345"), "12,345"),
                () -> assertEquals(Main.addCommas("123456"), "123,456"),
                () -> assertEquals(Main.addCommas("1234567"), "1,234,567"),
                () -> assertEquals(Main.addCommas("1234567"), "1,234,567"),
                () -> assertEquals(Main.addCommas("12345678"), "12,345,678")
        );
    }

}