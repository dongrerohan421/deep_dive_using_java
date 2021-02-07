package dsa.sort.recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    void iterativeFactorialTest() {
        int num = 4;
        int actual = Factorial.iterativeFactorial(num);
        int expected = 24;
        assertEquals(expected, actual);
    }

    @Test
    void recursiveFactorialTest() {
        int num = 5;
        int actual = Factorial.recursiveFactorial(num);
        int expected = 120;
        assertEquals(expected, actual);
    }
}
