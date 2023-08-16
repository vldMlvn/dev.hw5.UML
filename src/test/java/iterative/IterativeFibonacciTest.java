package iterative;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IterativeFibonacciTest {

    @Test
    void testCalcFibonacciWithInputOver1() {

        //Given
        IterativeFibonacci fibonacci = new IterativeFibonacci();
        int n = 6;

        //When
        int expected = 8;
        int result = fibonacci.calcFibonacci(n);

        //Then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testCalcFibonacciWithInput1() {

        //Given
        IterativeFibonacci fibonacci = new IterativeFibonacci();
        int n = 1;

        //When
        int expected = 1;
        int result = fibonacci.calcFibonacci(n);

        //Then
        Assertions.assertEquals(expected, result);
    }
}
