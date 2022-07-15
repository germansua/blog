package co.gersua.demo.calc;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaCalcTest {

    private JavaCalc javaCalc = new JavaCalc();

    @Test
    void addTwoIntegers() {
        assertEquals(3, javaCalc.add(1, 2));
        assertEquals(0, javaCalc.add(1, -1));
    }
}
