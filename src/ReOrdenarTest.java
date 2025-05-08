import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReOrdenarTest {

    @Test

    public void test_01() {
        assertEquals(54421, ReOrdenar.ordenarDesc(42145));
        assertEquals(654321, ReOrdenar.ordenarDesc(145263));
        assertEquals(987654321, ReOrdenar.ordenarDesc(123456789));
    }
}