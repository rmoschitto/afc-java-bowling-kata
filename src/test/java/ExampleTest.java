import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {

    @Test
    void fail() {
        Example example = new Example();
        String value = example.callForAction();
        assertEquals("Food", value);
    }

    @Test
    void itShouldNotFail() {
        assertTrue(true);
    }
}
