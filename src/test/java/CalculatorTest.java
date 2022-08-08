import org.example.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator;
    Calculator calculator2;

    @BeforeAll
    static void initial() throws Exception {
        System.out.println("Hello TDD");
    }

    @BeforeEach
    void setUp() throws Exception {
        System.out.println("=====EACH ====");
        calculator = new Calculator();
    }

    @Test
    @EnabledOnOs({OS.MAC})
    void itShouldNotNull(){
        assertNull(calculator2, "Calculator should null");
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
    void divByZeroShouldThrowException(){
       Throwable exception = assertThrows(IllegalArgumentException.class, () -> calculator.div(4,0));
        assertEquals("Division by 0",exception.getMessage());
        //assertEquals(0, calculator.div(4,0), "Regular division by zero");
    }

    @AfterEach
    void doneEachTest() {
        System.out.println("Done");
    }

    @AfterAll
    static void doneAll() {
        System.out.println("Done all test, Good bye!");
    }
}
