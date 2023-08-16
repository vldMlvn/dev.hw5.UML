package recursive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RecursiveFibonacciTest {

    @Test
    void testCalcFibonacciWithInputOver1() {

        //Given
        RecursiveFibonacci recursive = new RecursiveFibonacci();
        int n = 7;

        //When
        int expected = 13;
        int result = recursive.calcFibonacci(n);

        //Then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testCalcFibonacciWithInput0() {

        //Given
        RecursiveFibonacci recursive = new RecursiveFibonacci();
        int n = 0;

        //When
        int expected = 0;
        int result = recursive.calcFibonacci(n);

        //Then
        Assertions.assertEquals(expected, result);
    }
}

