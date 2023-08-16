package dymanic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class DynamicFibonacciTest {

    @Test
    void testCalcFibonacciWithEmptyList() {

        //Given
        DynamicFibonacci dynamic = new DynamicFibonacci();
        int n = 6;

        //When
        int expected = 8;
        int result = dynamic.calcFibonacci(n);

        //Then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testCalcFibonacciNotEmptyList() {

        //Given
        DynamicFibonacci dynamic = new DynamicFibonacci();
        dynamic.calcFibonacci(8);
        List<Integer> testList = dynamic.getList();
        int n = 6;

        //When
        int expected = 8;
        int result = testList.get(n);

        //Then
        Assertions.assertEquals(expected, result);
    }
}