import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHello {

    @Test
    public void testFoo() {
        int result = 5 + 5 * 2;
        // fail a test on purpose
        assertEquals(result, 15);
    }

}