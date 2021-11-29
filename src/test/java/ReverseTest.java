import exercitiul1.Reverse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ReverseTest {
    @Test
    void reverseNumberTest() {
      Reverse reverse = new Reverse();
      int nr = reverse.reverseNumber(123);
        assertEquals(321, nr);
    }
}