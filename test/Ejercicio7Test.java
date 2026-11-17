import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ejercicio7Test {

    @Test
    public void testEjercicio7() {
        assertAll(
                () -> assertEquals(7, Ejercicio7.canales(99, 7))
        );
    }
}