import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    @DisplayName("add commas to long number")
    void canAddCommasToLongNumber() {
        String rawNumber = "12345678";
        assertEquals("12,345,678", Main.addCommas(rawNumber));
    }

    @Test
    @DisplayName("Can add commas to medium number")
    void canAddCommasToMediumNumber() {
        String rawNumber = "345678";
        assertEquals("345,678", Main.addCommas(rawNumber));
    }

    @Test
    @DisplayName("Can add commas to short number")
    void canAddCommasToShortNumber() {
        String rawNumber = "123";
        assertEquals(rawNumber, Main.addCommas(rawNumber));
    }

    @Test
    @DisplayName("Can add commas to various different numbers")
    void canAddCommas() {
        assertAll(
                () -> assertEquals("", Main.addCommas("")),
                () -> assertEquals("1", Main.addCommas("1")),
                () -> assertEquals("12", Main.addCommas("12")),
                () -> assertEquals("123", Main.addCommas("123")),
                () -> assertEquals("1,234", Main.addCommas("1234")),
                () -> assertEquals("12,345", Main.addCommas("12345")),
                () -> assertEquals("123,456", Main.addCommas("123456")),
                () -> assertEquals("1,234,567", Main.addCommas("1234567")),
                () -> assertEquals("1,234,567", Main.addCommas("1234567")),
                () -> assertEquals("12,345,678", Main.addCommas("12345678"))
        );
    }

}