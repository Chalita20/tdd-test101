import org.example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Simple multiplication should work")
    void testMultiply() {
        int answer = calculator.multiply(4, 5);
        assertEquals(20, answer,"Regular multiplication should work");
    }

    @Test
    @DisplayName("Ensure multiply by zero")
    void testMultiplyByZero() {
        assertEquals(0, calculator.multiply(4, 0),"Regular multiplication should work");
    }

    @Test
    void testDiv(){
        assertEquals(2, calculator.div(4,2), "Regular divide");
    }

    @Test
    void testDivByZro(){
        assertEquals(0, calculator.div(4,0), "Regular division by zero");
    }
}
